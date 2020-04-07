import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.qi.service.UserService;


/**
 * @Description TODO
 * @Author qi
 * @Date 2020/3/17 11:14
 * @ClassName AOPTest
 **/
public class AOPTest {

    @Test
    public void pointCutTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 动态代理代理的是接口！！！
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }
}
