package com.mybaits.demo.bean;

import java.util.Date;

/**
 * @ClassName: Org
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/31 16:13:51 
 * @Version: V1.0
 **/
public class Org {
    private int id;
    private String orgName;
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Org{" +
                "id=" + id +
                ", orgName='" + orgName + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
