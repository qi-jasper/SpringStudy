import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.qi.config.AppConfig;
import study.qi.pojo.User;

public class AppConfigTest {

    @Test
    public void JavaConfigTest() {

        // 如果完全使用配置类去做，就只能使用AnnotationConfigApplicationContext上下文来获取容器，通过配置类的class对象加载
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean("getUser", User.class);

        System.out.println(user.getName());
    }
}
