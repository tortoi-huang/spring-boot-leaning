
# 2、custom-starter
实验自定义spring starter 功能.
spring starter 本质是类似import功能导入一组已定义好的bean，在创建bean之前会根据是否存在相应的类和配置再确定是否创建bean。
spring 启动时会扫描所有包下面的spring.factories文件，并根据文件中的org.springframework.boot.autoconfigure.EnableAutoConfiguration来找到相应的配置类，然后导入该配置
本例会根据用户是有加载了类 MyDateFormater 并且配置了属性 hello.stater，来确定是否创建 MyDateFormater的实例 bean。
步骤如下：
2.1、 新建属性读取类 MyStarterProperties，对于starter实验这步可以省略，只是方便属性注入MyStarterConfig而已
2.2、 新建 bean定义类 MyStarterConfig
2.3、 配置 EnableAutoConfiguration 配置文件 META-INF/spring.factories
starter 通常用于springboot项目自动配置功能上。无法再非spring boot的spring项目中
附加：
2.4、添加对spring配置元数据支持，使得第三方工具及外部引用可以探测到配置文件
2.4.1、添加 annotationProcessor 'org.springframework.boot:spring-boot-configuration-processor' 依赖
2.4.2、添加META-INF/spring-configuration-metadata.json 元数据配置文件
