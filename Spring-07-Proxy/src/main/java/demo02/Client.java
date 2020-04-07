package demo02;

import org.junit.Test;

public class Client {

    @Test
    public void UserServiceProxyTest() {

        UserServiceImp userService = new UserServiceImp();

        UserServiceProxy proxy = new UserServiceProxy();

        proxy.setUserService(userService);
        proxy.add();

    }

}
