package com.wupeng.springboot.service;

import com.wupeng.springboot.model.Student;
import org.springframework.stereotype.Service;


public interface StudentService {
    Student queryById(Integer id);
}
