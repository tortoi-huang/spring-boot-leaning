package org.huang.leaning.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.huang.leaning.lib.MyDateFormater;

@Configuration
@ConditionalOnClass(MyDateFormater.class)
@EnableConfigurationProperties(MyStarterProperties.class)
public class MyStarterConfig {
	@Autowired
	private MyStarterProperties properties;

	@Bean
	@ConditionalOnMissingBean
	public MyDateFormater myDateFormater() {
		return new MyDateFormater(properties.getFormat());
	}
}