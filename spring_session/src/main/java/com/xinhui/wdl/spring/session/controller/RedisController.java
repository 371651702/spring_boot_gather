package com.xinhui.wdl.spring.session.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author dongliang.wang
 * @createTime 2019/7/11
 **/
@RestController
public class RedisController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/set")
    public String setSession(HttpSession session){
        session.setAttribute("user","JavaBoy");
        return String.valueOf(port);
    }

    @GetMapping("/gain")
    public String getSession(HttpSession session){
        return session.getAttribute("user") + ":" + port;
    }


}
