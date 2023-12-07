package com.victor.day1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 *Author：Victor_htq
 *Package：com.victor.day1.pojo
 *Project：parent
 *name：Address
 *Date：2023/12/4  19:07
 *Filename：Address
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String province;
    private String city;
}
