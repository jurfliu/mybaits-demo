package com.mybaits.demo.service;

import com.mybaits.demo.bean.Org;
import com.mybaits.demo.bean.User;

import java.io.IOException;
import java.util.List;

public interface OrgService {
   void addOrg(Org org) throws IOException;
   List<Org> findByIds() throws IOException;
}
