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

XML映射文件三点规范

![xml映射文件](img/xml映射文件.png)



动态sql

```xml
<if test = ""> </if> 
<where> </where> 去除多余and或or
<set> <set>去除多余逗号
```

框架错误从下向上看

<img src="img/动态sql.png" alt="动态sql" style="zoom: 80%;" />

<img src="img/foreach.png" alt="foreach" style="zoom:80%;" />

![foreach2](img/foreach2.png)

```xml
<sql> <include>
```

![xml](img/xml.png)



参数1：起始索引

参数2：查询返回记录数，每页展示记录数 

```sql
select * from emp limit 0, 5;
```

![分页](img/分页.png)

![分页2](img/分页2.png)



### PageHelper

![pageHelper](img/pageHelper.png)

![pageHelper2](img/pageHelper2.png)