package com.bawei.service;

import com.bawei.bean.Student;
import com.bawei.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper mapper;

    @Override
    public List list() {
        return mapper.list();
    }

    @Override
    public void add(Student student) {
        mapper.add(student);
    }

    @Override
    public List listupd() {
        return mapper.listupd();
    }

    @Override
    public Student getstudentid(int id) {
        return mapper.getstudentid(id);
    }

    @Override
    public void update(Student student) {
        mapper.update(student);
    }

    @Override
    public void delete(int id) {
        mapper.delete(id);
    }

    @Override
    public void delAll(String id) {
        mapper.delAll(id);
    }

}
