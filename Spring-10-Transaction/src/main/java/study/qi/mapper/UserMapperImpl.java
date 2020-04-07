package study.qi.mapper;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import study.qi.pojo.User;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    public List<User> getUser() {
        return getSqlSession().getMapper(UserMapper.class).getUser();
    }

    public int addUser(User user) {

        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUserByID(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUserByID(id);
    }
}