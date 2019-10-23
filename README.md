# spring-boot-leaning
    testweb实验web项目，用来学习各种。


#1、custom-element 
    项目实验自定义一个xml标签"mysdf"。
    参照 https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#xml-custom
    自定义标签功能可以帮助定一个复杂的bean并隐藏定义该bean的细节。步骤如下：
    1.1、 配置bean的实现类和属性，通过实现AbstractSingleBeanDefinitionParser类来处理
    1.2、 通过标签名称注册bean的配置，通过实现NamespaceHandlerSupport类来注册。
    1.3、 定义xml标签格式，xsd文件
    1.4、 关联xml命名空间到bean的注册类
    1.5、 定义xml schema文件存放的位置

#2、custom-starter
    实验自定义spring starter 功能.
    spring starter 本质是类似import功能导入一组已定义好的bean，在创建bean之前会根据是否存在相应的类和配置再确定是否创建bean。
    本例会根据用户是有加载了类 MyDateFormater 并且配置了属性 hello.stater，来确定是否创建 MyDateFormater的实例 bean。
    步骤如下：
    2.1、 新建属性读取类 MyStarterProperties
    2.2、 新建 bean定义类 MyStarterConfig
    2.3、 配置 EnableAutoConfiguration 配置文件 META-INF/spring.factories

#3、custom-enable
    实验spring自定义Enable*功能。
    enable功能与starter类似，引入一组已定义好的bean，使用起来更简单。
    步骤如下：
    3.1、定义一组bean的配置如：CustomFormatConfig 与正常的spring java配置没有什么不同。
    3.2、定义一个Enable*注解，关联到上一步的配置，如本例中的EnableAllCustomFormat，当应用程序引用本注解时会自动导入前面配置的bean。
    备注 可以通过 Enable*注解定义属性将参数传入bean配置类，配置类根据传入属性做相应的动态处理，如selecor包下的实现。