# Java Maven Project Generator

This command line tool helps you create a new Java Maven project with a specified Group ID and Artifact ID. It generates the necessary project structure, including the `pom.xml` file and a sample `Test.java` file with a 'Hello, World!' program.


## 

```bash

curl http://localhost:8080/actuator/prometheus | grep custom_request
```


## How to use

![img.png](img.png)


## 查询过去5分钟的平均响应时间

```
sum by (path) (rate(custom_response_time_sum{application="springboot-prometheus",path!~""}[5m]) / rate(custom_request_total{application="springboot-prometheus",path!~""}[5m]))
```

