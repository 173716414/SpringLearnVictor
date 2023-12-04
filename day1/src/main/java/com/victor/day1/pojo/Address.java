package com.victor.day1.pojo;

import lombok.Data;

/*
 *Author：Victor_htq
 *Package：com.victor.day1.pojo
 *Project：parent
 *name：Address
 *Date：2023/12/4  19:07
 *Filename：Address
 */
@Data
public class Address {
    private String province;
    private String city;
    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
