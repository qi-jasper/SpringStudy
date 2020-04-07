package demo01;

import org.junit.Test;

public class Client {

    @Test
    public void ClientTest() {

        // 房东租房子
        Host host = new Host();

        // 代理角色，中介帮房东租房子，但是代理角色会有附属操作
        Proxy proxy = new Proxy(host);

        proxy.rent();
    }
}
