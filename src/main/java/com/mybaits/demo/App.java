package com.mybaits.demo;

import com.mybaits.demo.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        //add();
       query();
       // update();
        //del();
        System.out.println( "Hello World!" );
    }
    public static void query() throws IOException {
        //加载核心配置文件
        InputStream resourcesAsStream= Resources.getResourceAsStream("mybaitsConfig.xml");
        //获得sqlsession 工厂对象
        SqlSessionFactory  sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourcesAsStream);
        //获得sqlsession对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //执行sql
        List<User> userList=sqlSession.selectList("yonghuMapper.findAll");
        //打印资源
        System.out.println("userlist:"+userList);
        //关闭释放资源
        sqlSession.close();

    }
    public static void  add() throws IOException {
        User user=new User();
        user.setId(1);
        user.setUserName("ljf");
        user.setPassword("123");
        //加载核心配置文件
        InputStream resourcesAsStream= Resources.getResourceAsStream("mybaitsConfig.xml");
        //获得sqlsession 工厂对象
        SqlSessionFactory  sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourcesAsStream);
        //获得sqlsession对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //执行sql
        sqlSession.insert("yonghuMapper.addUser",user);
        //mybaits 执行更新操作，提交事务
        sqlSession.commit();
        //关闭释放资源
        sqlSession.close();
    }
    public static void  update() throws IOException {
        User user=new User();
        user.setId(1);
        user.setUserName("liu");
        user.setPassword("123");
        //加载核心配置文件
        InputStream resourcesAsStream= Resources.getResourceAsStream("mybaitsConfig.xml");
        //获得sqlsession 工厂对象
        SqlSessionFactory  sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourcesAsStream);
        //获得sqlsession对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //执行sql
        sqlSession.update("yonghuMapper.updateUser",user);
        //mybaits 执行更新操作，提交事务
        sqlSession.commit();
        //关闭释放资源
        sqlSession.close();
    }
    public static void  del() throws IOException {
        //加载核心配置文件
        InputStream resourcesAsStream= Resources.getResourceAsStream("mybaitsConfig.xml");
        //获得sqlsession 工厂对象
        SqlSessionFactory  sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourcesAsStream);
        //获得sqlsession对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //执行sql
        sqlSession.delete("yonghuMapper.delUser",1);
        //mybaits 执行更新操作，提交事务
        sqlSession.commit();
        //关闭释放资源
        sqlSession.close();
    }
}
