package com.victor.day1.controller;

import com.victor.day1.pojo.Emp;
import com.victor.day1.pojo.Result;
import com.victor.day1.service.EmpService;
import com.victor.day1.service.impl.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*
 *Author：Victor_htq
 *Package：com.victor.day1.controller
 *Project：parent
 *name：EmpController
 *Date：2023/12/4  19:04
 *Filename：EmpController
 */
@RestController
public class EmpController {
    @Resource
    private EmpService empService;

    @RequestMapping("/listEmp")
    public Result list() {
        List<Emp> empList = empService.listEmp();

        return Result.success(empList);
    }
}
