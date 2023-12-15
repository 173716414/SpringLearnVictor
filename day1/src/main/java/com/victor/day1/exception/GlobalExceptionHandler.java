package com.victor.day1.exception;

/*
 *Author：Victor_htq
 *Package：com.victor.day1.exception
 *Project：parent
 *name：GlobalExceptionHandler
 *Date：2023/12/15  10:43
 *Filename：GlobalExceptionHandler
 */

import com.victor.day1.pojo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public Result ex(Exception ex) {
        ex.printStackTrace();
        return Result.error("对不起，服务器异常");
    }
}
