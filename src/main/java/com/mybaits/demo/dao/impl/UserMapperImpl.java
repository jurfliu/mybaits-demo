package com.mybaits.demo.dao.impl;

import com.mybaits.demo.bean.User;
import com.mybaits.demo.dao.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName: UserDaoImpl
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/30 21:57:31 
 * @Version: V1.0
 **/
public class UserMapperImpl implements UserMapper {
    @Override
    public List<User> findAll() throws IOException {
        //加载核心配置文件
        InputStream resourcesAsStream= Resources.getResourceAsStream("mybaitsConfig.xml");
        //获得sqlsession 工厂对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourcesAsStream);
        //获得sqlsession对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //执行sql
        List<User> userList=sqlSession.selectList("yonghuMapper.findAll");
        //打印资源
        System.out.println("userlist:"+userList);
        //关闭释放资源
        sqlSession.close();
        return userList;
    }
}
