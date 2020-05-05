package com.bawei.bean;

public class Student {
    public int getOption;
    private int id;
    private String sname;
    private String sdata;

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

    public String getSdata() {
        return sdata;
    }

    public void setSdata(String sdata) {
        this.sdata = sdata;
    }

    public int getGetOption() {
        return getOption;
    }

    public void setGetOption(int getOption) {
        this.getOption = getOption;
    }

    public Student() {
    }

    public Student(int id, String sname, String sdata) {
        this.id = id;
        this.sname = sname;
        this.sdata = sdata;
    }
}
