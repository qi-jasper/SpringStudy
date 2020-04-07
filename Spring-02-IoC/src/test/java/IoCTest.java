import org.junit.Test;
import study.qi.pojo.User;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCTest {

    @Test
    public void IoCTest() {

//        User user = new User();
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // getBean时就创建了对象
        User user = (User) context.getBean("user");

        // 通过别名获取
        // User user = (User) context.getBean("userhaha");


        user.show();
    }
}
