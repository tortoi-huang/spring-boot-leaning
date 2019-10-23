package org.huang.leaning.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
//导入CustomFormatConfig中配置的bean
@Import(CustomFormatConfig.class)
public @interface EnableAllCustomFormat {
}
