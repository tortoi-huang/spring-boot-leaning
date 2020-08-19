package org.huang.leaning.element.xml;

import org.huang.leaning.lib.ElementFormatter;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class SimpleDateFormatBeanDefinitionParser extends AbstractSingleBeanDefinitionParser { 

    protected Class<ElementFormatter> getBeanClass(Element element) {
        return ElementFormatter.class;
    }

    protected void doParse(Element element, BeanDefinitionBuilder bean) {
        // 添加一个必填的构造函数参数
        String pattern = element.getAttribute("pattern");
        bean.addConstructorArgValue(pattern);

        // 添加一个可选的setter属性
        String lenient = element.getAttribute("lenient");
        if (StringUtils.hasText(lenient)) {
            bean.addPropertyValue("lenient", Boolean.valueOf(lenient));
        }
    }
}