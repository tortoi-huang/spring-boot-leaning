# spring-boot-leaning
testweb实验web项目，用来学习各种。


# 1、custom-element 
项目实验自定义一个xml标签"mysdf"。
参照 https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#xml-custom
自定义标签功能可以帮助定一个复杂的bean并隐藏定义该bean的细节。步骤如下：
1. 配置bean的实现类和属性，通过实现AbstractSingleBeanDefinitionParser类来处理
2. 通过标签名称注册bean的配置，通过实现NamespaceHandlerSupport类来注册。
3. 定义xml标签格式，xsd文件
4. 关联xml命名空间到bean的注册类
5. 定义xml schema文件存放的位置

# 2、custom-starter
实验自定义spring starter 功能.
spring starter 可以通过java config方式配置复杂的bean启用规则，也可以添加一些启动动作，比如启动时扫描特定annotation bean。
spring 启动时会扫描所有包下面的spring.factories文件，并根据文件中的org.springframework.boot.autoconfigure.EnableAutoConfiguration来找到相应的配置类，然后导入该配置
本例会根据用户是有加载了类 MyDateFormater 并且配置了属性 hello.stater，来确定是否创建 MyDateFormater的实例 bean。
步骤如下：
1. 新建属性读取类 MyStarterProperties，对于starter实验这步可以省略，只是方便属性注入MyStarterConfig而已
2. 新建 bean定义类 MyStarterConfig
3. 配置 EnableAutoConfiguration 配置文件 META-INF/spring.factories
starter 通常用于springboot项目自动配置功能上。无法再非spring boot的spring项目中
附加：
4.添加对spring配置元数据支持，使得第三方工具及外部引用可以探测到配置文件
    1. 添加 annotationProcessor 'org.springframework.boot:spring-boot-configuration-processor' 依赖
    2. 添加META-INF/spring-configuration-metadata.json 元数据配置文件

# 3、custom-enable
实验spring自定义Enable*功能。
enable功能是当注解被启用时导入一套已定义的bean，可以理解为@Import注解的别名，不同的是@Enable包含了配置导入的功能，引入一组已定义好的bean。其核心是@Enable*注解上要声明一个@Import注解，指明要导入哪些配置。
与starter不同的是如果只是引入依赖但是不使用@Enable*注解，配置是不会被导入的。
步骤如下：
1. 定义一组bean的配置如：CustomFormatConfig 与正常的spring java配置没有什么不同。
2. 定义一个Enable*注解，关联到上一步的配置，如本例中的EnableAllCustomFormat，当应用程序引用本注解时会自动导入前面配置的bean。
备注 可以通过 Enable*注解定义属性将参数传入bean配置类，配置类根据传入属性做相应的动态处理，如selecor包下的实现。enable功能通常使用在非spring boot项目上自动配置功能，也可以用在springboot项目上，但是在boot项目一般优先考虑starter形式
