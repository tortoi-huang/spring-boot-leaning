package org.huang.leaning.element.xml;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        //这里要与my-element.xsd 中配置的元素名称一致
        registerBeanDefinitionParser("mysdf", new SimpleDateFormatBeanDefinitionParser());
    }
}