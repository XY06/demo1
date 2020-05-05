package com.bawei.mapper;

import com.bawei.bean.Student;

import java.util.List;

public interface StudentMapper {
    List list();

    void add(Student student);

    List listupd();

    Student getstudentid(int id);

    void update(Student student);

    void delete(int id);

    void delAll(String id);
}
