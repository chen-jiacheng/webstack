package com.chenjiacheng.webstack.spring.mvc.controller;

import com.chenjiacheng.webstack.spring.mvc.service.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * AuthController
 *
 * @author chenjiacheng
 * @since 2025/11/23 17:46
 */
@Slf4j
@RequestMapping("/api/auth")
@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register() {
        log.info("register");
        return "register";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login() {
        log.info("login");
        return "login";
    }

    @RequestMapping(value = "/refresh",method = RequestMethod.POST)
    public String refresh() {
        log.info("refresh");
        return "refresh";
    }

    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    public String logout() {
        log.info("logout");
        return "logout";
    }

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public String info() {
        log.info("info");
        return "info";
    }

}
