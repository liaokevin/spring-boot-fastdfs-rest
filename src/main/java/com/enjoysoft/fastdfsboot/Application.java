package com.enjoysoft.fastdfsboot;

import com.mangofactory.swagger.plugin.EnableSwagger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication


@EnableAutoConfiguration
@ComponentScan(basePackages = "com.enjoysoft.fastdfsboot")
@EnableSwagger
public class Application extends SpringBootServletInitializer {
	private static final Class<Application>  applicationClass = Application.class;
	private static final Logger log = LoggerFactory.getLogger(applicationClass);
	public static void main(String[] args) {
		log.info("startup bootstrap");
		SpringApplication.run(applicationClass, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		//return super.configure(applicationClass);

		return builder.sources(applicationClass);
	}
}
