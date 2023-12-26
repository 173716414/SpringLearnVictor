package com.victor.redis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 *Author：Victor_htq
 *Package：com.victor.redis.pojo
 *Project：parent
 *name：User
 *Date：2023/12/26  11:28
 *Filename：User
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private Integer age;
}
