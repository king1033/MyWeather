package com.king1033.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by king1033 on 2017/2/22.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (id != city.id) return false;
        if (cityCode != city.cityCode) return false;
        if (provinceId != city.provinceId) return false;
        return cityName.equals(city.cityName);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + cityName.hashCode();
        result = 31 * result + cityCode;
        result = 31 * result + provinceId;
        return result;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", cityCode=" + cityCode +
                ", provinceId=" + provinceId +
                '}';
    }
}
