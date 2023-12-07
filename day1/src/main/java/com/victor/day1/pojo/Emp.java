package com.victor.day1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {

    private String name;
    private Integer age;
    private String image;
    private String gender;
    private String job;

}
