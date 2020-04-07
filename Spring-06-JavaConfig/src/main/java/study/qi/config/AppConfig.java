package study.qi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import study.qi.pojo.User;

@Configuration  // 这个也会被Spring容器托管，注册到容器中，因为它本身就是一个@Component，这个和bean.xml是一样的
@ComponentScan("study.qi.pojo") // 也可以通过这个注解去扫描指定的类
@Import(AppConfig2.class)   // 引入另外一个配置类AppConfig2
public class AppConfig {

/*
    注册一个Bean，相当于之前在xml文件中写的bean标签
    这个方法的名字，就相当于bean标签中的id
    这个方法的返回值就详单与bean标签中的返回值
*/
    @Bean
    public User getUser() {

        // 返回要注入到bean的对象
        return new User();
    }
}
