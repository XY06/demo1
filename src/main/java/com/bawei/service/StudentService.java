package com.bawei.service;

import com.bawei.bean.Student;

import java.util.List;

public interface StudentService {
    List list();

    void add(Student student);

    List listupd();

    Student getstudentid(int id);

    void update(Student student);

    void delete(int id);

    void delAll(String id);
}
