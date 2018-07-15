### 第1章 安装
### 第2章 开发一个spring boot程序
#### spring boot核心功能
    1、自动配置：自动完成bean装配，比如JdbcTemplate在Classpath里面，则自动配置JdbcTemplate的bean；取代注解和xml配置bean
    2、起步依赖：选择或输入需要的功能就自动引入库和版本；本质上是maven的pom，定义了对其他库的传递依赖；只需起步的时候定义依赖；
               不需要制定版本号，版本号由正在使用的spring boot确定；spring boot已经充分测试，包装传递依赖的兼容；可以通过  
               mvn dependencies、gradle dependencies 查看依赖树；
    3、命令行界面：写代码就完成应用程序，不需要配置；此项为可选功能；
    4、Actuator：查看程序的内部情况，比如上下文bean、自动配置、环境变量、系统属性、线程状态、GC和内存情况、web请求等；
    5、内置web容器：tomcat、jetty、undertow; 
### 第3章 自定义配置
#### 配置文件
    application.properties 细粒度管理spring boot的配置 
#### 排除传递依赖 
    <dependency> 
       <groupId>org.springframework.boot</groupId> 
       <artifactId>spring-boot-starter-web</artifactId>
        <exclusions>
            <exclusion>
            <groupId>com.fasterxml.jackson.core</groupId>
            </exclusion>
        </exclusions>
    </dependency>
#### 覆盖传递依赖（maven总是会使用最近的依赖）
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>       
        <artifactId>jackson-databind</artifactId>         
        <version>2.8.10</version>'
    </dependency>' 
#### 条件化配置1（spring4.0）
    @ConditionalOnBean                配置了某个特定bean       
    @ConditionalOnMissingBean         没有配置特定bean         
    @ConditionalOnClass               Classpath有指定的类      
    @ConditionalOnMissingClass        Classpath无指定的类      
    @ConditionalOnExpression          给定的spEL为true         
    @ConditionalOnJava                java版本匹配特定的值或范围 
    @ConditionalJndi                  

    @ConditionalOnProperty            指定的配置有明确的值       
    @ConditionalOnResource            Classpath里面有指定的资源 
    @ConditionalOnWebApplication      这是web程序              
    @ConditionalOnNotWebApplication   不是web程序  
#### 条件化配置2（Profile）
    不同环境，配置文件不一样，可以使用Spring3.1的Profile(条件化配置),比如：
    @Profile("production")
    @Configuration
    @EnableWebSecurity
    public class SecurityConfig extends WebSecurityConfigurerAdapter{
        //
    }  
    这里的注解@Profile("production")要求application.properties的属性为true才能使用该安全配置：
    spring.profiles.active.production=true;    
#### 自动配置
要覆盖spring boot的自动配置，需要编写一个显示的配置，如SecurityConfig。  
#### 自定义配置
    1、实现org.springframework.context.annotation.Condition接口；
    2、Override(覆盖)Condition接口的matches()方法              
### 第4章 测试








