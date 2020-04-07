package study.qi.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author qi
 * @Date 2020/3/17 10:36
 * @ClassName AfterLog
 **/
public class AfterLog implements AfterReturningAdvice {

    /**
     * @Description
     * @Autor qi
     * @Date 2020/3/17 10:38

     * @param returnValue：返回值
     * @param method
     * @param args
     * @param target
     * @Exception
     * @return void
     **/
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() + "方法，返回结果为：" + returnValue);
    }
}
