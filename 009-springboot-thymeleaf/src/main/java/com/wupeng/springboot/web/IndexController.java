package com.wupeng.springboot.web;

import com.wupeng.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/message")
    public String message(Model model) {

        model.addAttribute("data", "hello thymeleaf");
        return "message";
    }

    @RequestMapping("/user")
    public ModelAndView user() {

        User user = new User();
        user.setAge(15);
        user.setId(1001);
        user.setName("张三");
        ModelAndView mv = new ModelAndView();

        mv.setViewName("message");
        mv.addObject("user", user);
        return mv;

    }

    @RequestMapping("/index1")
    public String list(Model model) {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setAge(15 + i);
            user.setId(100 + i);
            user.setName("张三" + i);
            userList.add(user);
        }
        model.addAttribute("userList", userList);
        return "index";
    }

    @RequestMapping("/index2")
    public String index(Model model) {
        Map<Integer, Object> userMaps = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setAge(15 + i);
            user.setId(100 + i);
            user.setName("李四" + i);
            userMaps.put(i, user);
        }
        model.addAttribute("userMaps", userMaps);
        return "index";
    }

    @RequestMapping("/index3")
    public String condition(Model model) {
        model.addAttribute("flag", true);
        return "index";
    }

    @RequestMapping("/index4")
    public String inline(Model model) {
        model.addAttribute("data", "springboot");
        model.addAttribute("data2", "hello java");
        return "index";
    }

    @RequestMapping("/index5")
    public String index5(HttpServletRequest request, Model model) {
        model.addAttribute("data1", "hello world");
        request.getSession().setAttribute("data2", "hello my baby");
        return "index";
    }
}
