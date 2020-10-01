package com.wupeng.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private Integer age;
    @RequestMapping(value = "/say")
    public @ResponseBody String say(){
        return "hello springboot"+name+"     "+age;
    }
}
