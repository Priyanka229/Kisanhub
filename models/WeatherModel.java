package assignment.models;

public class WeatherModel {
    private String weatherParam;
    private String downloadUrl;

    public WeatherModel(String weatherParam, String downloadUrl) {
        this.weatherParam = weatherParam;
        this.downloadUrl = downloadUrl;
    }

    public String getWeatherParam() {
        return weatherParam;
    }

    public void setWeatherParam(String weatherParam) {
        this.weatherParam = weatherParam;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}
