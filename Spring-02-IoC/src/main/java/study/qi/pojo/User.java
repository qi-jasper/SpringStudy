package study.qi.pojo;

public class User {

    private String name;

    // 无参构造（不写也是默认存在的）
    public User(String name) {
        this.name = name;
        System.out.println("User被创建了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name" + name);
    }

}
