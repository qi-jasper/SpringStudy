import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.qi.mapper.UserMapper;
import study.qi.pojo.User;

public class SpringMyBatisTest {

    @Test
    public void springMyBatisTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        for (User user : userMapper.getUser()) {
            System.out.println(user);
        }
    }
}
