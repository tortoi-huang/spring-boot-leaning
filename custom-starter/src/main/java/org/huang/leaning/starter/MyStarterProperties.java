package org.huang.leaning.starter;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
//ConfigurationProperties注解标识需要将属性注入到当前类，比如环境变量、虚拟启动参数、properties文件或yml文件中配置的属性
//标识这个注解的类必须声明为bean或者被EnableConfigurationProperties注解引用，否则无法注入属性
//对于start实验这个类是多余的，可以省略
@ConfigurationProperties(prefix = "hello.stater")
public class MyStarterProperties {
	private String format;
}
