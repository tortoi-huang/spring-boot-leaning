package org.huang.leaning.element;

import org.huang.leaning.enable.EnableAllCustomFormat;
import org.huang.leaning.enable.select.EnableOneCustomFormat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Configuration
@ImportResource("my-element.xml") //导入xml配置做自定义标签实验
//@EnableAllCustomFormat //enable启用bean实验
@EnableOneCustomFormat(criteria = "") //通过条件动态导入bean实验
public class CustomElementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomElementApplication.class, args);
	}

}
