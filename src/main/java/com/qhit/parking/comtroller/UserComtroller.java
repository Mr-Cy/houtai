package com.qhit.parking.comtroller;

import com.qhit.parking.entity.Admin;
import com.qhit.parking.entity.User;
import com.qhit.parking.service.UserService;
import org.apache.poi.ss.formula.functions.Odd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserComtroller {
    @Autowired
    UserService userService;

    @RequestMapping("/user-list")
public String GetAll(HttpServletRequest request){
    List<User> list = userService.selectAll();

    request.setAttribute("userList",list);
    return "user/user-list";
}


    @RequestMapping("/stopUser")
    @ResponseBody
    public String  updateByPrimaryKey(User user){
        int i = userService.upByIdByUser(user);
        if (i>0){
            return "0";
        }else {
            return "1";
        }
    }



    @RequestMapping("/startUser")
    @ResponseBody
    public String  updateByPrimaryKeyy(User user){
        int i = userService.upByIdByUser(user);
        if (i>0){
            return "0";
        }else {
            return "1";
        }
    }
    @RequestMapping("/deluser")
    @ResponseBody
    public   String deleteByPrimaryKey(Integer id){
        int i = userService.deleteByPrimaryKey(id);
        if (i>0){
            return "0";
        }else {
            return "1";
        }
    }

    @RequestMapping("/findUserByName")
    public String GetAllByNameByUser(User user,HttpServletRequest request){
        List<User> list = userService.GetAllByNameByUser(user);
        request.setAttribute("userList",list);
        return "user/user-list";
    }
}
