package com.bawei.controller;

import com.bawei.bean.Student;
import com.bawei.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    //接口文档
    @RequestMapping("list")
    public ModelAndView list(){
        //dqwdwqdwqd
        List list = service.list();
        ModelAndView mv = new ModelAndView();
        mv.addObject("list",list);
        mv.setViewName("list");
        /*dwq*/
        return mv;
    }
    @RequestMapping("toadd")
    public String  toadd(){
        return "add";
    }

    @RequestMapping("add")
    @ResponseBody
    public boolean add(Student student){
        student.setSdata(new Date());
        service.add(student);
        return true;
    }

    @RequestMapping("toupd")
    public String  upd(){
        return "upd";
    }

    @RequestMapping("upd")
    @ResponseBody
    public Map upd(int id){
        /*List list = service.listupd();*/
        Student student = service.getstudentid(id);
        Map map = new HashMap();
        /*map.put("list",list);*/
        map.put("student",student);
        return map;
    }

    @RequestMapping("addupd")
    @ResponseBody
    public boolean addupd(Student student){
        service.update(student);
        return true;
    }

    @RequestMapping("delete")
    @ResponseBody
    public boolean delete(int id){
        service.delete(id);
        return true;
    }

    @RequestMapping("delAll")
    @ResponseBody
    public boolean delAll(String id){
        service.delAll(id);
        return true;
    }
}
