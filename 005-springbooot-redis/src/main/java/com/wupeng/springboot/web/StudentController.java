package com.wupeng.springboot.web;

import com.wupeng.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("/put")
    public @ResponseBody Object put(String key,String value){

        studentService.put(key,value);
        return "cg";

    }

    @RequestMapping("/get")
    public @ResponseBody Object get(String key){

        String count=studentService.get(key);
        return "cg"+count;

    }
}
