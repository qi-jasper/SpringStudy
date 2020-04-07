package study.qi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

public class People {

    private String name;

    /*
    直接在属性上使用即可（在set方法上使用也可以，使用该注解也可以不写set方法）
    如果显示地定义了Autowired中required属性为false，说明这个对象可以为null，否则不能为空
    */
    // @Autowired(required = false)
    // private Cat cat;

    @Autowired
    @Qualifier(value = "dog2")
    // @Qualifier显示地指明唯一的对象，当bean.xml中有多个相同类型的不同名对象时使用；与@Autowired搭配使用
    private Dog dog;

    /*
    @Resource是Java自带的注解，也可以完成自动装配，指定name属性，与@Qualifier中指定value属性的作用一样
    相当于@Autowired与@Qualifier的集合体
    */
    @Resource(name = "cat2")
    private Cat cat;

    /*@Autowired通过byName的方式实现，@Resource默认通过byName的方式实现，如果找不到名字，则通过byType实现*/


    // @Nullable表示这个值可以为空
//    public People(@Nullable String name) {
//        this.name = name;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
