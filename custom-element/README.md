# 自定义spring标签功能

项目实验自定义一个xml标签"mysdf"，在xml配置文件中可以使用如下配置进行配置特殊的bean:
```xml
<beans xmlns="http://www.springframework.org/schema/beans" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:me="http://www.my-element.com/schema/sdf"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.my-element.com/schema/sdf http://www.my-element.com/schema/sdf/my-element.xsd"
       default-lazy-init="false">
       <me:mysdf id="mysdf" pattern="yyyy-MM-dd HH:mm:ss" lenient="true" />
</beans>
```
参照 https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#xml-custom

## 实现标签解析
实现接口`org.springframework.beans.factory.xml.BeanDefinitionParser`， 在本例中是继承 `org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser` 抽象类。
实现`doParse`方法将xml中配置属性跟具体的bean对象属性绑定。

## 定义命名空间
这里定义标签的名字，如`<me:mysdf id="mysdf" pattern="yyyy-MM-dd HH:mm:ss" lenient="true" />`
新建一个类继承 `org.springframework.beans.factory.xml.NamespaceHandlerSupport`,在这里将标签名字跟解析类绑定。

