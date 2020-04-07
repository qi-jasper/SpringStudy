package study.qi.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
* @Component
* @Repository
* @Service
* @Controller
* 四个注解所做的事情一样，在bean.xml中扫描包实现自动装配
*
* 同时大部分属性设置都支持注解，如：
* @Scope("singleton")设置单例模式
* */

// @Component注解 等价于<bean id="user" class="com.qi.pojo.User"/>
@Component
@Scope("prototype") // 设置为原型模式
public class User {

    // 显示地赋值
    public String name = "qi";

    // 通过注解赋值
    /* 相当于在applicationContext.xml中写
    * <bean id="user" class="com.qi.pojo.User">
        <property name="call" value="hello qi"></property>
    </bean>
    * */
    @Value("hello qi")
    public String call;
}
