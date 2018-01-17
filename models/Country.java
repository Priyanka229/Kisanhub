package assignment.models;

import java.util.List;

public class Country {
    private String regionCode;
    private List<WeatherModel> weatherModels;

    public Country(String regionCode, List<WeatherModel> weatherModels) {
        this.regionCode = regionCode;
        this.weatherModels = weatherModels;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public List<WeatherModel> getWeatherModels() {
        return weatherModels;
    }

    public void setWeatherModels(List<WeatherModel> weatherModels) {
        this.weatherModels = weatherModels;
    }
}
