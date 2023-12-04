package com.victor.day1.dao.impl;

import com.victor.day1.dao.EmpDao;
import com.victor.day1.pojo.Emp;
import com.victor.day1.utils.XmlParserUtils;

import java.util.List;

/*
 *Author：Victor_htq
 *Package：com.victor.day1.dao.impl
 *Project：parent
 *name：EmpDaoA
 *Date：2023/12/4  19:44
 *Filename：EmpDaoA
 */
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        return XmlParserUtils.parse(file, Emp.class);
    }
}
