package study.qi.mapper;

import org.apache.ibatis.annotations.Param;
import study.qi.pojo.User;

import java.util.List;

public interface UserMapper {

    // 查询用户
    List<User> getUser();

    // 添加一个用户
    int addUser(User user);

    // 删除一个用户
    int deleteUserByID(@Param("id") int id);

}
