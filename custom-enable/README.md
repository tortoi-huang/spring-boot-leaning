# 3、custom-enable
实验spring自定义Enable*功能。
enable功能是当注解被启用时导入一套已定义的bean，可以理解为@Import注解的别名，不同的是@Enable包含了配置导入的功能，引入一组已定义好的bean。其核心是@Enable*注解上要声明一个@Import注解，指明要导入哪些配置。
与starter不同的是如果只是引入依赖但是不使用@Enable*注解，配置是不会被导入的。
步骤如下：
3.1、定义一组bean的配置如：CustomFormatConfig 与正常的spring java配置没有什么不同。
3.2、定义一个Enable*注解，关联到上一步的配置，如本例中的EnableAllCustomFormat，当应用程序引用本注解时会自动导入前面配置的bean。
备注 可以通过 Enable*注解定义属性将参数传入bean配置类，配置类根据传入属性做相应的动态处理，如selecor包下的实现。enable功能通常使用在非spring boot项目上自动配置功能，也可以用在springboot项目上，但是在boot项目一般优先考虑starter形式
