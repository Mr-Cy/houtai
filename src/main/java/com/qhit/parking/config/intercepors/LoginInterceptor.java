package com.qhit.parking.config.intercepors;

import com.qhit.parking.entity.Admin;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class LoginInterceptor implements HandlerInterceptor{

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler){
        HttpSession session = request.getSession();
       Admin list= (Admin) session.getAttribute("list");

       if(list==null){
           return  false;
       }else {
           return true;
       }

    }

}
