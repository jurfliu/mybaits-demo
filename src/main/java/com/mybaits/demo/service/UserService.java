package com.mybaits.demo.service;

import com.mybaits.demo.bean.User;

import java.io.IOException;
import java.util.List;

public interface UserService {
    List<User> findAll() throws IOException;
}
