package org.huang.leaning.enable;

import org.huang.leaning.lib.EnableDateFormater1;
import org.huang.leaning.lib.EnableDateFormater2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomFormatConfig {

	@Bean
	public EnableDateFormater2 enableDateFormater2() {
		return new EnableDateFormater2("HH:mm:ss");
	}

	@Bean
	public EnableDateFormater1 enableDateFormater1() {
		return new EnableDateFormater1("dd HH_mm_ss");
	}
}
