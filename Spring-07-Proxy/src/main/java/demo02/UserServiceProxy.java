package demo02;

public class UserServiceProxy implements UserService {

    private UserServiceImp userService;

    public void setUserService(UserServiceImp userService) {
        this.userService = userService;
    }

    /*public UserServiceProxy() {

    }*/

    public void add() {
        userService.add();
    }

    public void delete() {
        userService.delete();
    }

    public void update() {
        userService.update();
    }

    public void query() {
        userService.query();
    }

    // 日志方法
    public void log(String msg) {
        System.out.println("use" + msg);
    }

}
