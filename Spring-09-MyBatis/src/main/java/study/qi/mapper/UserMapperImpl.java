package study.qi.mapper;

import org.mybatis.spring.SqlSessionTemplate;
import study.qi.pojo.User;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    /* 我们所有操作，都是用sqlSession执行，现在都是用SqlSessionTemplate
    * */
    private SqlSessionTemplate sqlSession;


    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> getUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        return mapper.getUser();
    }
}
