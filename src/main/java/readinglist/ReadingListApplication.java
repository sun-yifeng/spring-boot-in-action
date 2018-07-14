package readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动引导类（注意：不需要修改启动引导类）
 * 配置代码@SpringBootApplication，将三个有用的注解组合在一起：
 * 1、@Configuration:标明该类使用Spring基于java的配置;
 * 2、@ComponentScan:启用组件扫描，自动注册为Spring的上下文Bean;
 * 3、@EnableAutoConfiguration:启动了SpringBoot自动配置;
 * 在Spring boot的早期版本中需要同时标注以上的三个注解，1.2以上版本中只需要一个即可。
 */
@SpringBootApplication
public class ReadingListApplication {
	/**
	 * 负责启动引导程序，运行spring boot程序有几种方式：
	 * 1、打成war包（传统方式）；
	 * 2、打成jar包，在命令行执行；
	 * 3、向SpringApplication传入启动类；
	 */
	public static void main(String[] args) {
		SpringApplication.run(ReadingListApplication.class, args);
	}
}
