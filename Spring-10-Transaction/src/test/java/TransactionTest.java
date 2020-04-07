import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.qi.mapper.UserMapperImpl;
import study.qi.pojo.User;

import java.util.List;

public class TransactionTest {

    @Test
    public void transactionTest() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl userMapper = context.getBean("userMapper", UserMapperImpl.class);

        User user = new User(7, "7777", "7777");
        userMapper.addUser(user);
        userMapper.deleteUserByID(7);


        List<User> users = userMapper.getUser();
        for (User userList : users) {
            System.out.println(userList);
        }


    }
}
