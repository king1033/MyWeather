package com.king1033.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by king1033 on 2017/2/22.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Province province = (Province) o;

        if (id != province.id) return false;
        if (provinceCode != province.provinceCode) return false;
        return provinceName != null ? provinceName.equals(province.provinceName) : province.provinceName == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (provinceName != null ? provinceName.hashCode() : 0);
        result = 31 * result + provinceCode;
        return result;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", provinceName='" + provinceName + '\'' +
                ", provinceCode=" + provinceCode +
                '}';
    }
}
