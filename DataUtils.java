package assignment;

import assignment.models.Country;
import assignment.models.WeatherModel;

import java.util.ArrayList;
import java.util.List;

public class DataUtils {

    public static List<Country> getData() {
        List<Country> countryList = new ArrayList<>();

        // add UK info
        List<WeatherModel> weatherModeList = new ArrayList<>();
        weatherModeList.add(new WeatherModel("Max Temp", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Tmax/date/UK.txt"));
        weatherModeList.add(new WeatherModel("Min Temp", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Tmin/date/UK.txt"));
        weatherModeList.add(new WeatherModel("Mean Temp", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Tmean/date/UK.txt"));
        weatherModeList.add(new WeatherModel("Sunshine", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Sunshine/date/UK.txt"));
        weatherModeList.add(new WeatherModel("Rainfall", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Rainfall/date/UK.txt"));

        countryList.add(new Country("UK", weatherModeList));

        // add England info
        weatherModeList = new ArrayList<>();
        weatherModeList.add(new WeatherModel("Max Temp", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Tmax/date/England.txt"));
        weatherModeList.add(new WeatherModel("Min Temp", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Tmin/date/England.txt"));
        weatherModeList.add(new WeatherModel("Mean Temp", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Tmean/date/England.txt"));
        weatherModeList.add(new WeatherModel("Sunshine", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Sunshine/date/England.txt"));
        weatherModeList.add(new WeatherModel("Rainfall", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Rainfall/date/England.txt"));

        countryList.add(new Country("England", weatherModeList));

        // add Wales info
        weatherModeList = new ArrayList<>();
        weatherModeList.add(new WeatherModel("Max Temp", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Tmax/date/Wales.txt"));
        weatherModeList.add(new WeatherModel("Min Temp", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Tmin/date/Wales.txt"));
        weatherModeList.add(new WeatherModel("Mean Temp", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Tmean/date/Wales.txt"));
        weatherModeList.add(new WeatherModel("Sunshine", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Sunshine/date/Wales.txt"));
        weatherModeList.add(new WeatherModel("Rainfall", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Rainfall/date/Wales.txt"));

        countryList.add(new Country("Wales", weatherModeList));

        // add Scotland info
        weatherModeList = new ArrayList<>();
        weatherModeList.add(new WeatherModel("Max Temp", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Tmax/date/Scotland.txt"));
        weatherModeList.add(new WeatherModel("Min Temp", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Tmin/date/Scotland.txt"));
        weatherModeList.add(new WeatherModel("Mean Temp", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Tmean/date/Scotland.txt"));
        weatherModeList.add(new WeatherModel("Sunshine", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Sunshine/date/Scotland.txt"));
        weatherModeList.add(new WeatherModel("Rainfall", "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/Rainfall/date/Scotland.txt"));

        countryList.add(new Country("Scotland", weatherModeList));

        return countryList;
    }
}
