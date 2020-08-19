package org.huang.leaning.enable.select;

import org.huang.leaning.lib.EnableDateFormatter1;
import org.huang.leaning.lib.EnableDateFormatter2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 根据配置参数决定定义哪些bean
 */
public class CustomFormatConfigSeletor implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		AnnotationAttributes attributes =
				AnnotationAttributes.fromMap(
						importingClassMetadata.getAnnotationAttributes(EnableOneCustomFormat.class.getName(), false));
		String criteria = attributes.getString("criteria");
		if("default".equals(criteria)) {
			return new String[]{Config1.class.getName()};
		} else {
			return new String[]{Config2.class.getName()};
		}
	}

	/**
	 * 如果这个类是以内部类形式存在，那必须声明为静态类，否则会因为找不到依赖的外部类实例出错
	 */
	@Configuration
	public static class Config1 {

		@Bean
		public EnableDateFormatter2 enableDateFormater2() {
			return new EnableDateFormatter2("HH:mm:ss");
		}
	}

	@Configuration
	public static class Config2 {

		@Bean
		public EnableDateFormatter1 enableDateFormater1() {
			return new EnableDateFormatter1("dd HH_mm_ss");
		}
	}
}
