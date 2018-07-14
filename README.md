### spring boot核心功能
1、自动配置：自动完成bean装配，比如JdbcTemplate在Classpath里面，则自动配置JdbcTemplate的bean；取代注解和xml配置bean<br>
2、起步依赖：选择或输入需要的功能就自动引入库和版本；本质上是maven的pom，定义了对其他库的传递依赖；只需起步的时候定义依赖；<br>
           不需要制定版本号，版本号由正在使用的spring boot确定；spring boot已经充分测试，包装传递依赖的兼容；可以通过  <br>
           mvn dependencies、gradle dependencies 查看依赖树；
3、命令行界面：写代码就完成应用程序，不需要配置；此项为可选功能；<br>
4、Actuator：查看程序的内部情况，比如上下文bean、自动配置、环境变量、系统属性、线程状态、GC和内存情况、web请求等；<br>
5、内置web容器：tomcat、jetty、undertow; <br>
### 配置文件
application.properties 细粒度管理spring boot的配置 <br>
### 排除传递依赖 <br>
<dependency> <br>
    <groupId>org.springframework.boot</groupId> <br>
    <artifactId>spring-boot-starter-web</artifactId> <br>
    <exclusions> <br>
        <exclusion> <br>
            <groupId>com.fasterxml.jackson.core</groupId> <br>
        </exclusion> <br>
    </exclusions> <br>
</dependency> <br>

### 覆盖传递依赖（maven总是会使用最近的依赖）<br>
<dependency> <br>
    <groupId>com.fasterxml.jackson.core</groupId>        <br>
    <artifactId>jackson-databind</artifactId>            <br>
    <version>2.8.10</version> <br>
</dependency> <br>

### 条件化配置（spring4.0）<br>
@ConditionalOnBean                配置了某个特定bean       <br>
@ConditionalOnMissingBean         没有配置特定bean         <br>
@ConditionalOnClass               Classpath有指定的类      <br>
@ConditionalOnMissingClass        Classpath无指定的类      <br>
@ConditionalOnExpression          给定的spEL为true         <br>
@ConditionalOnJava                java版本匹配特定的值或范围 <br>
@ConditionalJndi                  

@ConditionalOnProperty            指定的配置有明确的值       <br>
@ConditionalOnResource            Classpath里面有指定的资源 <br>
@ConditionalOnWebApplication      这是web程序              <br>
@ConditionalOnNotWebApplication   不是web程序              <br>








