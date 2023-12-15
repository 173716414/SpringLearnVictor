## Day7

### Interceptor

/*一级路径

/**任意级路径

![Interceptor](img/Interceptor.png)

![拦截器执行流程](img/拦截器执行流程.png)

![filter和Interceptor](img/filter和Interceptor.png)

### 异常处理

全局异常处理器

![全局异常处理器](img/全局异常处理器.png)

```java
@RestControllerAdvice
类
    @ExceptionHandler(Exception.class)
```

