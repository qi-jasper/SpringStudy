package study.qi.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Description 实现AOP方式三：使用注解实现AOP
 * @Author qi
 * @Date 2020/3/17 13:00
 * @ClassName AnnotationPointCut
 **/

@Aspect     // 标注这个类是一个切面
public class AnnotationPointCut {

    @Before("execution(* study.qi.service.UserServiceImp.*(..))")     // 注解里面写切入点
    public void before() {
        System.out.println("==========在方法之前=========");
    }

    @After("execution(* study.qi.service.UserServiceImp.*(..))")
    public void after() {
        System.out.println("==========在方法之后=========");
    }

    // 在环绕增强中，我们可以给定一个参数，代表我们要获取处理的切入点
    @Around("execution(* study.qi.service.UserServiceImp.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");

        // 获取签名，即打印哪个方法被执行了
        Signature signature = joinPoint.getSignature();
        System.out.println(signature);

        // 执行方法
        Object proceed = joinPoint.proceed();

        System.out.println("环绕后");

    }

}
