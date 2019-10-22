package org.huang.leaning.starter;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "hello.stater")
public class MyStarterProperties {
	private String format;
}
