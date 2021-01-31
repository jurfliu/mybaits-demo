package com.mybaits.demo.service;

import com.mybaits.demo.bean.User;

import java.io.IOException;
import java.util.List;

public interface UserService2 {
    List<User> findAll() throws IOException;
    List<User> findByIds(List<Integer> dataList) throws IOException;
}
