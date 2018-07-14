package readinglist;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @program: spring-boot-in-action
 * @description: 定义条件化配置：实现Condition接口；spring-boot.autoconfigure.jar包括了很多配置类；
 * @author: Mr.Sun
 * @create: 2018-07-14 19:29
 **/
public class JdbcTemplateCondition implements Condition{
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        try {
            context.getClassLoader().loadClass("org.springframework.jdbc.core.JdbcTemplate");
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
