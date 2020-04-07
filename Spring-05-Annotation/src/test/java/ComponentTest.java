import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.qi.pojo.User;

public class ComponentTest {

    @Test
    public void ComponentScanTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        User user2 = context.getBean("user", User.class);

        System.out.println(user.name);
        System.out.println(user.call);
        System.out.println(user == user2);  //false，因为设置了原型模式
    }
}
