package com.chenjiacheng.webstack.servlet.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Slf4j
@WebFilter("/*")  // 一行注解搞定，不需要web.xml
public class OneLineFilter implements Filter {
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                        FilterChain chain) throws IOException, ServletException {
        
        HttpServletRequest req = (HttpServletRequest) request;
        log.info("📨 " + req.getMethod() + " " + req.getRequestURI());

        chain.doFilter(request, response);

        log.info("📤 请求完成");
    }
}