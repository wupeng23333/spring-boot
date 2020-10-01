package com.wupeng.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wupeng.springboot.service.StudentService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = StudentService.class,version = "1.0-SNAPSHOT",timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Override
    public Integer queryAllStudent() {
        return 1000;
    }
}
