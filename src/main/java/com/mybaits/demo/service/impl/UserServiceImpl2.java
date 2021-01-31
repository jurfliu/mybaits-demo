package com.mybaits.demo.service.impl;

        import com.mybaits.demo.bean.User;
        import com.mybaits.demo.dao.UserMapper;
        import com.mybaits.demo.service.UserService2;
        import org.apache.ibatis.io.Resources;
        import org.apache.ibatis.session.SqlSession;
        import org.apache.ibatis.session.SqlSessionFactory;
        import org.apache.ibatis.session.SqlSessionFactoryBuilder;

        import java.io.IOException;
        import java.io.InputStream;
        import java.util.List;

/**
 * @ClassName: UserServiceImpl2
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/30 23:56:52 
 * @Version: V1.0
 **/
public class UserServiceImpl2 implements UserService2 {
    @Override
    public List<User> findAll() throws IOException {
        //加载核心配置文件
        InputStream resourcesAsStream= Resources.getResourceAsStream("mybaitsConfig.xml");
        //获得sqlsession 工厂对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourcesAsStream);
        //获得sqlsession对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //产生代理对象
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<User> userList= userMapper.findAll();
        //打印资源
        System.out.println("userlist:"+userList);
        //关闭释放资源
        sqlSession.close();
        return userList;
    }
}
