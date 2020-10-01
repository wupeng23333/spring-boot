package com.wupeng.springbbot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wupeng.springboot.model.Student;
import com.wupeng.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @Reference(interfaceClass = StudentService.class,version = "1.0-SNAPSHOT",check = false)
    private StudentService studentService;


    @RequestMapping("/student/detail/{id}")
    public String studentDetail(Model model, @PathVariable("id") Integer id){

        Student student=studentService.queryStudentById(id);
        model.addAttribute("student",student);
        return "studentDetail";
    }

}
