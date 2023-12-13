## Day5

application.properties

@Value("${配置文件中的key}")

![参数配置化](img/参数配置化.png)

![配置文件](img/配置文件.png)

![配置文件格式](img/配置文件格式.png)

推荐yml

![yml](img/yml.png)

```yml
#定义对象/Map集合
user:
  name: Tom
  age: 20
  adress: beijing
#定义数组/List/Set
hobby:
  - java
  - c
  - game
  - sport
```



```java
@Data
@Component
@ConfigurationProperties(prefix = "aliyun.oss")
```

