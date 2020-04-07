package demo04;

import demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    // 生成得到代理对象
    public Object getProxy() {
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
        );
    }

    // 处理代理实例并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        log(method.getName());

        // 动态代理的本质，就是使用反射机制实现
        Object result = method.invoke(target, args);

        return result;

    }

    // 假如新添加一个打印日志方法
    public void log(String msg) {
        System.out.println("执行了" + msg + "方法");
    }
}
