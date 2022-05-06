package com.reliab.yandexdriver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ExternalProperties.class)
public class YandexDriverApplication {

	public static void main(String[] args) {
		SpringApplication.run(YandexDriverApplication.class, args);
	}

}
