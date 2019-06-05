package com.qhit.parking.interceptor;

import com.qhit.parking.entity.Admin;
import com.qhit.parking.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginAdmin  implements HandlerInterceptor{

    @Autowired
    RedisUtil redisUtil;

    @Override
    public boolean preHandle(HttpServletRequest Request, HttpServletResponse Response, Object o) throws Exception {
    Admin admin = (Admin) Request.getSession().getAttribute("list");
    if (admin != null){
        String loginadmin = redisUtil.get("id:"+admin.getId());
        if (loginadmin != null&&loginadmin.equals(Request.getSession().getId())){
            System.out.print(loginadmin);
            return true;
        }
    }
     Response.sendRedirect("admin/login");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }



}
