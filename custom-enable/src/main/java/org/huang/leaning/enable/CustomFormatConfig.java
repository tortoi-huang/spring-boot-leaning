package org.huang.leaning.enable;

import org.huang.leaning.lib.EnableDateFormatter;
import org.huang.leaning.lib.EnableDateFormatter1;
import org.huang.leaning.lib.EnableDateFormatter2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomFormatConfig {

	@Bean
	public EnableDateFormatter enableDateFormatter() {
		return new EnableDateFormatter("MM-dd HH:mm:ss");
	}
}
