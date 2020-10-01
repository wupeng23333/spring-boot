package com.wupeng.springboot.service.impl;

import com.wupeng.springboot.mapper.StudentMapper;
import com.wupeng.springboot.model.Student;
import com.wupeng.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student queryById(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }
}
