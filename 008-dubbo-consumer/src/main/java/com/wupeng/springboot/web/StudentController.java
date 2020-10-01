package com.wupeng.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wupeng.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Reference(interfaceClass = StudentService.class,version = "1.0-SNAPSHOT",check = false)
    private StudentService studentService;

    @RequestMapping("/student/count")
    public @ResponseBody Object count(){
        Integer count=studentService.queryAllStudent();
        return "总学生数"+count;
    }
}

