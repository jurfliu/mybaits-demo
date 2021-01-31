package com.mybaits.demo.dao;

import com.mybaits.demo.bean.User;

import java.io.IOException;
import java.util.List;

public interface UserMapper {
    List<User> findAll() throws IOException;
    List<User> findByIds(List<Integer> dataList) throws IOException;
}

