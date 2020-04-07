package study.qi.config;

/**
 * @Description TODO
 * @Author qi
 * @Date 2020/3/17 12:51
 * @ClassName DiyPointCut
 **/
public class DiyPointCut {

    public void before() {
        System.out.println("=============前==================");
    }

    public void after() {
        System.out.println("=============后==================");
    }

}
