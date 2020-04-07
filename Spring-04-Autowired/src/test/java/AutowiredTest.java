import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.qi.People;

public class AutowiredTest {

    @Test
    public void AutowiredTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        People people = context.getBean("people", People.class);

        people.getCat().shout();
        people.getDog().shout();
    }
}
