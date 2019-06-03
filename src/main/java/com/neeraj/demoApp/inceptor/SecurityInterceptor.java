package com.neeraj.demoApp.inceptor;

import ch.qos.logback.classic.BasicConfigurator;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class SecurityInterceptor extends HandlerInterceptorAdapter {


    @Override
    public boolean preHandle(
            HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        MyRequestWrapper myRequestWrapper = new MyRequestWrapper((HttpServletRequest) request);

//        String body = myRequestWrapper.getBody();
//        String clientIP = myRequestWrapper.getRemoteHost();
//        int clientPort = request.getRemotePort();
//        String uri = myRequestWrapper.getRequestURI();

//        System.out.println(body);
//        System.out.println(clientIP);
//        System.out.println(clientPort);
//        System.out.println(uri);


        System.out.println("==========="+request);
        return true;
    }
}
