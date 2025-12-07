package com.chenjiacheng.webstack.servlet.web;

import com.alibaba.fastjson.JSON;
import com.chenjiacheng.webstack.servlet.web.model.Result;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@Slf4j
@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
        log.info("com.chenjiacheng.webstack.servlet.web.HelloServlet.init");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Cookie[] cookies = request.getCookies();
        if (null != cookies && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                log.info("cookie:{} {}", cookie.getName(), cookie.getValue());
            }
        }

        HttpSession session = request.getSession();
        log.info("session:{} ", session.getId());

        Result<String> result = Result.success("sessionId: " + session.getId());
        PrintWriter out = response.getWriter();
        out.println(JSON.toJSONString(result));

        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
    }

    public void destroy() {
    }
}