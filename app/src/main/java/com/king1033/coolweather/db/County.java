package com.king1033.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by king1033 on 2017/2/22.
 */

public class County extends DataSupport{
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        County county = (County) o;

        if (id != county.id) return false;
        if (cityId != county.cityId) return false;
        if (!countyName.equals(county.countyName)) return false;
        return weatherId.equals(county.weatherId);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + countyName.hashCode();
        result = 31 * result + weatherId.hashCode();
        result = 31 * result + cityId;
        return result;
    }

    @Override
    public String toString() {
        return "County{" +
                "id=" + id +
                ", countyName='" + countyName + '\'' +
                ", weatherId='" + weatherId + '\'' +
                ", cityId=" + cityId +
                '}';
    }
}
