package com.springinaction.agr.places;

import java.util.List;

public class Country {
    public Country() {
    }

    private List<City> cities;
    private List<City> bigCities;
    private City firstBigCity;
    private City lastBigCity;
    private City chosenCity;
    private String[] cityNames;

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public City getChosenCity() {
        return chosenCity;
    }

    public void setChosenCity(City chosenCity) {
        this.chosenCity = chosenCity;
    }

    public List<City> getBigCities() {
        return bigCities;
    }

    public void setBigCities(List<City> bigCities) {
        this.bigCities = bigCities;
    }

    public City getFirstBigCity() {
        return firstBigCity;
    }

    public void setFirstBigCity(City firstBigCity) {
        this.firstBigCity = firstBigCity;
    }

    public City getLastBigCity() {
        return lastBigCity;
    }

    public void setLastBigCity(City lastBigCity) {
        this.lastBigCity = lastBigCity;
    }

    public String[] getCityNames() {
        return cityNames;
    }

    public void setCityNames(String[] cityNames) {
        this.cityNames = cityNames;
    }
}
