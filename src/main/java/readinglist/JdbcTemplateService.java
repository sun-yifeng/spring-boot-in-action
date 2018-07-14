package readinglist;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @program: spring-boot-in-action
 * @description: 定义条件化配置：实现Condition接口；spring-boot.autoconfigure.jar包括了很多配置类；
 * @author: Mr.Sun
 * @create: 2018-07-14 19:29
 **/
public class JdbcTemplateService{

    @Conditional(JdbcTemplateCondition.class)
    public JdbcTemplateService myService(){
        // TODO: 只有满足JdbcTemplateCondition条件时，才创建JdbcTemplateService的bean。
        return null;
    }

}
