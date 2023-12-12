## Day4

预编译sql

性能更高、更安全（防止sql注入）

‘ or '1' = '1

![参数占位符](img/参数占位符.png)

#{}获得对象内容

注意实体类是驼峰命名 数据库是下划线命名

![mybatis插入](img/mybatis插入.png)

主键返回

```java
@Options(keyProperty = "id", useGeneratedKeys = true)
```

字段名和属性名不一致

1、起别名，让别名与实体类属性一致

2、@Results({@Result(column = "", property = "")})

3、打开自动映射开关 

mybatis.configuration.map-underscore-to-camel-case=true



concat mybatis字符串拼接函数