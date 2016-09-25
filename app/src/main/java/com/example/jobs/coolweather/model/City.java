package com.example.jobs.coolweather.model;

/**
 * Created by jobs on 2016/9/25.
 */

public class City {
    private int id;
    private String cityName;
    private String cityCode;

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int provinceId;

    public int getId() {
        return id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCityCode() {
        return cityCode;
    }
}
