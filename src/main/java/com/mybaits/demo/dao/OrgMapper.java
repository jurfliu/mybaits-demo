package com.mybaits.demo.dao;

import com.mybaits.demo.bean.Org;

import java.io.IOException;
import java.util.List;

public interface OrgMapper {
    void  addOrg(Org org);
    List<Org> findAllOrg() throws IOException;
}
