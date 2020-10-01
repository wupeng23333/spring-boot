package com.wupeng.springboot.web;

import com.wupeng.springboot.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

//@Controller
@RestController //相当于所有方法的返回值都是json
@RequestMapping("/user")
public class StudentController {

    @RequestMapping(value = "/student")
//    @ResponseBody
    public Object student() {
        Student student = new Student();
        student.setId(1);
        student.setName("zhangsan");
        student.setAge(15);
        return student;
    }

    //    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @GetMapping(value = "/get")//查询
    public Object get() {
        return "get";
    }

    @PostMapping(value = "/post")//增加
//    @DeleteMapping    删除
//    @PutMapping   修改
    public Object post() {
        return "post";
    }

    @RequestMapping(value = "/student/detail/{id}/{age}")
    public Object student(@PathVariable("id") Integer id, @PathVariable("age") Integer age) {
        Student student = new Student();
        student.setId(id);
        student.setAge(age);
        return student;
    }

    //登录
    @RequestMapping(value = "/login")
    public Object login(HttpServletRequest request) {
        Student student = new Student();
        student.setId(1);
        student.setName("zhangsan");
        student.setAge(15);
        request.getSession().setAttribute("student", student);
        return "login success";
    }

    //登录后访问
    @RequestMapping(value = "/center")
    public Object center() {
        return "center message";
    }

    //不登录也可访问
    @RequestMapping(value = "/out")
    public Object out() {
        return "out";
    }

    //用户未登录访问，跳转到该请求
    @RequestMapping(value = "/error")
    public Object error() {
        return "error";
    }
}





