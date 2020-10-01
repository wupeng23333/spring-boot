package com.wupeng.springboot.web;

import com.wupeng.springboot.model.Student;
import com.wupeng.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

   @Autowired
   private StudentService studentService;

    @RequestMapping(value = "/index")
    public @ResponseBody Object queryById(Integer id){

        Student student= studentService.queryById(id);
        return student;
    }
}
