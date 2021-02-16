package com.mybaits.demo.service.impl;

import com.mybaits.demo.bean.Org;
import com.mybaits.demo.bean.User;
import com.mybaits.demo.dao.OrgMapper;
import com.mybaits.demo.dao.UserMapper;
import com.mybaits.demo.service.OrgService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName: OrgServiceImpl
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/02/01 23:18:21 
 * @Version: V1.0
 **/
public class OrgServiceImpl implements OrgService {
    @Override
    public void addOrg(Org org) throws IOException {
        //加载核心配置文件
        InputStream resourcesAsStream= Resources.getResourceAsStream("mybaitsConfig.xml");
        //获得sqlsession 工厂对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourcesAsStream);
        //获得sqlsession对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //执行sql
        OrgMapper orgMapper=sqlSession.getMapper(OrgMapper.class);
        orgMapper.addOrg(org);
        //mybaits 执行更新操作，提交事务
        sqlSession.commit();
        //关闭释放资源
        sqlSession.close();
    }

    @Override
    public List<Org> findByIds() throws IOException {
            //加载核心配置文件
        InputStream resourcesAsStream= Resources.getResourceAsStream("mybaitsConfig.xml");
        //获得sqlsession 工厂对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourcesAsStream);
        //获得sqlsession对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //执行sql
        OrgMapper orgMapper=sqlSession.getMapper(OrgMapper.class);
        List<Org> orgList=orgMapper.findAllOrg();
        //mybaits 执行更新操作，提交事务
        sqlSession.commit();
        //关闭释放资源
        sqlSession.close();
        return orgList;
    }

}
