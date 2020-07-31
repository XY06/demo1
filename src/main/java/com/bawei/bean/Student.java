package com.bawei.bean;

import java.util.Date;

public class Student {
    public int getOption;
    private int id;
    private String sname;
    private Date sdata;

    public int getGetOption() {
        return getOption;
    }

    public void setGetOption(int getOption) {
        this.getOption = getOption;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getSdata() {
        return sdata;
    }

    public void setSdata(Date sdata) {
        this.sdata = sdata;
    }
}
