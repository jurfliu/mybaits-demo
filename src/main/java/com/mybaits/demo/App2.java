package com.mybaits.demo;

import com.mybaits.demo.bean.User;
import com.mybaits.demo.service.UserService;
import com.mybaits.demo.service.impl.UserServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName: App2
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/30 21:54:06 
 * @Version: V1.0
 **/
public class App2 {
    public static void main(String[] args) throws IOException {
        UserService userService=new UserServiceImpl();
        userService.findAll();
    }

}
