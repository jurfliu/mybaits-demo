package com.mybaits.demo.service.impl;

import com.mybaits.demo.bean.User;
import com.mybaits.demo.dao.UserMapper;
import com.mybaits.demo.dao.impl.UserMapperImpl;
import com.mybaits.demo.service.UserService;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/30 22:00:02 
 * @Version: V1.0
 **/
public class UserServiceImpl implements UserService {

    @Override
    public List<User> findAll() throws IOException {
        UserMapper  userMapper=new UserMapperImpl() ;
       List<User> userList= userMapper.findAll();
       System.out.println("");
        return userList;
    }
}
