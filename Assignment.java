package assignment;

import assignment.models.Country;
import assignment.models.WeatherModel;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public class Assignment {
    public static void main(String[] args) {
        new Assignment().letsStart();
    }

    public void letsStart() {
        // fetch the data
        List<Country> dataList = DataUtils.getData();

        try {
            String saveFilePath = "/Users/priyanka/Documents/personal/KisanHub/src/assignment/weather.csv";
            FileOutputStream outputStream = new FileOutputStream(saveFilePath);

            for (int i = 0; i < dataList.size(); i++) {
                Country country = dataList.get(i);

                for (int j = 0; j < country.getWeatherModels().size(); j++) {
                    WeatherModel weatherModel = country.getWeatherModels().get(j);

                    String downloadedFile = downloadFile(weatherModel.getDownloadUrl());

                    writeDataToCSV(outputStream, country.getRegionCode(), weatherModel.getWeatherParam(), downloadedFile);
                }
            }

            outputStream.close();
        } catch (Exception e) {
            // Exception
            e.printStackTrace();
        }
    }

    public String downloadFile(String fileURL) {
        String returnValue = "";
        try {
            URL url = new URL(fileURL);
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
            int responseCode = httpConn.getResponseCode();

            // always check HTTP response code first
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // opens input stream from the HTTP connection
                InputStream inputStream = httpConn.getInputStream();


                // opens an output stream to save into file
                ByteArrayOutputStream bStream = new ByteArrayOutputStream();
                int bytesRead = -1;
                byte[] buffer = new byte[4096];
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    bStream.write(buffer, 0, bytesRead);
                }

                returnValue = new String(bStream.toByteArray(), "UTF-8");

                bStream.close();
                inputStream.close();

            } else {
                System.out.println("No file to download. Server replied HTTP code: " + responseCode);
            }
            httpConn.disconnect();
        } catch (Exception e) {
            // Exception
            e.printStackTrace();
        }

        return returnValue;
    }

    public void writeDataToCSV(FileOutputStream outputStream, String regionCode, String weatherParam, String newFileText) {
        String[] lines = newFileText.split(System.getProperty("line.separator"));
        int startIndex = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].equals("\r")) {
                startIndex = i + 1;
                break;
            }
        }

        String[] headerField = null;
        for (int i = startIndex; i < lines.length; i++) {
            String[] fields = lines[i].replaceAll("[' ']+", " ").replaceAll("\r", "").split(" ");
            if (i == startIndex) {
                headerField = fields;
                continue;
            }

            for (int j = 1; j < fields.length; j++) {
                String value = fields[j];
                if (value.matches("[-]+")) {
                    value = "N/A";
                }
                String outputText = regionCode + "," + weatherParam + "," + fields[0] + "," + headerField[j] + "," + value + "\n";

                try {
                    outputStream.write(outputText.getBytes(Charset.forName("UTF-8")));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
