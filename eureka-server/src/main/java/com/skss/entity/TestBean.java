package com.skss.entity;

import java.util.List;

public class TestBean {
    /**
     * activityid : ae1e9ef69192455b8015ca80cd21b1cc
     * active_endTime : 2018-10-28 18:23
     * headimg : []
     * price : 0.01
     * name : 郑州四日游
     * fengmiantu : /upload/wonderfulactive/28.jpg
     * active_startTime : 2018-10-25 18:23
     * signup_num : 31
     */

    private String activityid;
    private String active_endTime;
    private String price;
    private String name;
    private String fengmiantu;
    private String active_startTime;
    private String signup_num;
    private List<?> headimg;

    public String getActivityid() {
        return activityid;
    }

    public void setActivityid(String activityid) {
        this.activityid = activityid;
    }

    public String getActive_endTime() {
        return active_endTime;
    }

    public void setActive_endTime(String active_endTime) {
        this.active_endTime = active_endTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFengmiantu() {
        return fengmiantu;
    }

    public void setFengmiantu(String fengmiantu) {
        this.fengmiantu = fengmiantu;
    }

    public String getActive_startTime() {
        return active_startTime;
    }

    public void setActive_startTime(String active_startTime) {
        this.active_startTime = active_startTime;
    }

    public String getSignup_num() {
        return signup_num;
    }

    public void setSignup_num(String signup_num) {
        this.signup_num = signup_num;
    }

    public List<?> getHeadimg() {
        return headimg;
    }

    public void setHeadimg(List<?> headimg) {
        this.headimg = headimg;
    }
}
