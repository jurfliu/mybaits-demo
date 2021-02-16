package com.mybaits.demo;

import com.mybaits.demo.bean.Org;
import com.mybaits.demo.bean.User;
import com.mybaits.demo.service.OrgService;
import com.mybaits.demo.service.UserService;
import com.mybaits.demo.service.UserService2;
import com.mybaits.demo.service.impl.OrgServiceImpl;
import com.mybaits.demo.service.impl.UserServiceImpl;
import com.mybaits.demo.service.impl.UserServiceImpl2;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @ClassName: App2
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/30 21:54:06 
 * @Version: V1.0
 **/
public class App2 {
    private static Logger log = Logger.getLogger(App2.class);
    public static void main(String[] args) throws IOException {
        //方式一：传统方法
        //UserService userService=new UserServiceImpl();
        //userService.findAll();
        //方法二： 代理方式
        /**
        UserService2 userService=new UserServiceImpl2();
        userService.findAll();
        List<Integer> dataList=new ArrayList<Integer>();
        dataList.add(1);
        dataList.add(2);
        userService.findByIds(dataList);
        log.info("执行完了！！！");
         **/
        /**
        OrgService  os=new OrgServiceImpl();
        Org org =new Org();
        org.setCreateTime(new Date());
        org.setId(1);
        org.setOrgName("ljf");
        os.addOrg(org);

         **/
        OrgService  os=new OrgServiceImpl();
        List<Org> orgList=os.findByIds();
        System.out.println("orglist:"+orgList);
        System.out.println("....");
    }

}
