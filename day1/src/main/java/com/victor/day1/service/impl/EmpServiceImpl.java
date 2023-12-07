package com.victor.day1.service.impl;

import com.victor.day1.dao.EmpDao;
import com.victor.day1.dao.impl.EmpDaoA;
import com.victor.day1.pojo.Emp;
import com.victor.day1.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 *Author：Victor_htq
 *Package：com.victor.day1.controller.service
 *Project：parent
 *name：EmpService
 *Date：2023/12/4  19:04
 *Filename：EmpService
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpDao empDao;
    @Override
    public List<Emp> listEmp() {
        List<Emp> empList = empDao.listEmp();

        empList.stream().forEach(emp -> {
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男");
            }else if("2".equals(gender)){
                emp.setGender("女");
            }

            //处理job - 1: 讲师, 2: 班主任 , 3: 就业指导
            String job = emp.getJob();
            if("1".equals(job)){
                emp.setJob("讲师");
            }else if("2".equals(job)){
                emp.setJob("班主任");
            }else if("3".equals(job)){
                emp.setJob("就业指导");
            }
        });
        return empList;
    }
}
