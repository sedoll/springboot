package com.chunjae.test03.controller;

import com.chunjae.test03.common.Url;
import com.chunjae.test03.entity.UserInfo;
import com.chunjae.test03.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    //로그인 화면
    @GetMapping(value= {Url.AUTH.LOGIN})
    public String login() {

        return Url.AUTH.LOGIN_JSP;
    }

    //회원가입 화면
    @GetMapping(Url.AUTH.JOIN)
    public String join() {
        return Url.AUTH.JOIN_JSP;
    }

    //메인화면
    @GetMapping(Url.MAIN.MAIN)
    public String main() {
        return Url.MAIN.MAIN_JSP;
    }

    //사용자 등록
    @PostMapping(Url.AUTH.INSERT_USER)
    @ResponseBody
    public Map<String, Object> insertUser(@ModelAttribute UserInfo userInfo) {

        //회원 등록
        return userService.checkLoginInsert(userInfo);
    }
}