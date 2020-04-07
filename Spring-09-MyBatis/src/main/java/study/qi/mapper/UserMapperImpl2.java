package study.qi.mapper;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import study.qi.pojo.User;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {

    public List<User> getUser() {
        /*SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUser();*/

        return getSqlSession().getMapper(UserMapper.class).getUser();

    }
}
