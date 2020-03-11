package org.huang.leaning.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.huang.leaning.lib.MyDateFormater;

@Configuration()
@ConditionalOnClass(MyDateFormater.class)
@EnableConfigurationProperties(MyStarterProperties.class)//对于本starter实验这个注解及类MyStarterProperties是多余的，可以省略,这里方便属性注入
public class MyStarterConfig {
	@Autowired
	private MyStarterProperties properties;

	@Bean
	@ConditionalOnMissingBean
	public MyDateFormater myDateFormater() {
		return new MyDateFormater(properties.getFormat());
	}
}