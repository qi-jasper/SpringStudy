import org.junit.Test;
import study.qi.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class HelloTest {

    @Test
    public void HelloTest() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());

    }
}
