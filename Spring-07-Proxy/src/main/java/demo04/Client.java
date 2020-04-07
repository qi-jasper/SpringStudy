package demo04;

import demo02.UserService;
import demo02.UserServiceImp;
import org.junit.Test;

public class Client {

    @Test
    public void AllProxyTest() {

        // 真实角色
        UserServiceImp userService = new UserServiceImp();

        // 代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        // 设置要代理的真实对象
        pih.setTarget(userService);

        // 动态生成代理
        UserService proxy = (UserService) pih.getProxy();

        proxy.add();
        proxy.query();
        proxy.delete();
    }
}
