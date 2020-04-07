package demo01;

public class Proxy implements Rent {

    private Host host;

    public Proxy() {

    }

    public Proxy(Host host) {
        this.host = host;
    }

    // 看房
    public void seeHouse() {
        System.out.println("看房");
    }

    // 收中介费
    public void fare() {
        System.out.println("收中介费");
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        fare();
    }
}
