# spring-boot-fastdfs-rest
The Restful client of FastDfs with spring boot

# Spring-boot 相关 
·ApplicationRunner 和 CommandLineRunner 这两个接口可在SpringApplication.run(…)完成之前调用
，用于初始化一些配置，通过@Order(value = 1) 可以设置启动顺序；





#Swagger集成相关
## 1 按照POM.xml配置好Swagger依赖的包
    <dependency>
	    <groupId>com.mangofactory</groupId>
		<artifactId>swagger-springmvc</artifactId>
		<version>1.0.2</version>
	</dependency>
	<dependency>
		<groupId>org.codehaus.jackson</groupId>
		<artifactId>jackson-mapper-asl</artifactId>
		<version>1.9.13</version>
	</dependency>
	<dependency>
		<groupId>org.codehaus.jackson</groupId>
		<artifactId>jackson-core-asl</artifactId>
		<version>1.9.13</version>
	</dependency>
## 2 实现Swagger配置，参照SwaggerConfig.java
## 3 为Controller层添加Swagger注解
    启动后访问： http://localhost:8080/fastdfs/api-docs
## 4 集成SwaggerUI,可独立部署，也可集成到项目中
       
    [GitHub] : https://github.com/swagger-api/swagger-ui
    将dist目录下的文件拷贝为webapp的静态文件，
    修改index.html中 url = "http://petstore.swagger.io/v2/swagger.json";
    为本项目API地址 http://localhost:8080/fastdfs/api-docs,

## 5 访问Swagger UI 
    http://localhost:8080/fastdfs/swagger/index.html
## QA：
    若遇到Swagger UI访问出现跨域问题，需要使用过滤器，参考CORSFilter.java



