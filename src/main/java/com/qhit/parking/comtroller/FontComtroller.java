package com.qhit.parking.comtroller;

import com.qhit.parking.entity.Notice;
import com.qhit.parking.entity.Park;
import com.qhit.parking.entity.User;
import com.qhit.parking.service.ParkService;
import com.qhit.parking.service.UserService;
import com.qhit.parking.service.noticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/front")
public class FontComtroller {
    @Autowired
    ParkService parkService;
    @Autowired
    noticeService noticeService;
    @Autowired
    UserService userService;
    @RequestMapping("/list")
    public String list(HttpServletRequest request){
        List<Park> list = parkService.selectAll();
        request.setAttribute("parkList",list);
        return "front/list";
    }

    @RequestMapping("/detail")
    public String detail(Integer id,HttpServletRequest request){
        Park list = parkService.selectByPrimaryKey(id);
        request.setAttribute("park",list);
        return "front/detail";
    }
    @RequestMapping("/index")
    public String all(HttpServletRequest request){
        List<Notice> list = noticeService.selectAll();
        request.setAttribute("noticeList",list);
        return "front/index";
    }

    @RequestMapping("/join")
    public String login(HttpServletRequest request){

        return "front/join";
    }
    @RequestMapping("/login")
  public String getAndPwd(User user, HttpServletRequest request, HttpServletResponse response){
        User list = userService.getBynameAndPwd(user);
        if (list!=null){
            HttpSession session = request.getSession();
            session.setAttribute("LogUser",list);
            return "front/index";
        }
        return "";

}
    }
