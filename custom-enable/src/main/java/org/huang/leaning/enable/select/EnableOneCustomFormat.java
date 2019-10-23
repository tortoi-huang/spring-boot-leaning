package org.huang.leaning.enable.select;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
//导入 CustomFormatConfigSeletor 中配置的bean
@Import(CustomFormatConfigSeletor.class)
public @interface EnableOneCustomFormat {
	String criteria() default "default";
}
