package com.qhit.parking.comtroller;

import com.qhit.parking.entity.Admin;
import com.qhit.parking.service.adminService;
import com.qhit.parking.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminComtroller {
    @Autowired
    adminService adminService;
    @Autowired
    RedisUtil redisUtil;
@RequestMapping("/login")
public String Login(Admin admin){

return "admin/login";
}

    @RequestMapping("/sel")
    public String sel(Admin admin, HttpSession session){
      Admin list= adminService.selNameByPwd(admin);

      if (list!=null){
       session.setAttribute("list",list);
          redisUtil.set("id:"+list.getId(),session.getId());
          return "admin/index";
      }else {
          return  "admin/login";
      }

    }
    @RequestMapping("/list")
    public String getAll(HttpServletRequest request, HttpServletResponse response){
        List<Admin>list= adminService.selectAll();
        request.setAttribute("adminList",list);
        return "admin/admin-list";
    }
    @RequestMapping("/stopAdmin")
    @ResponseBody
    public String   upda (Admin admin,HttpServletResponse response,HttpServletRequest request) throws IOException {
        int i = adminService.upda(admin);
        if (i>0){
        return "0";
        }else {
            return "1";
        }
    }

    @RequestMapping("/startAdmin")
    @ResponseBody
    public String   updaa (Admin admin,HttpServletResponse response,HttpServletRequest request) throws IOException {
        int i = adminService.upda(admin);
        if (i>0){
            return "0";
        }else {
            return "1";
        }
    }
    @RequestMapping("/edit")
    public  String update(Integer id,HttpServletRequest request,HttpServletResponse response ){
    Admin list = adminService.GetAllById(id);
    request.setAttribute("list",list);
    return "admin/change-edit";
    }

    @RequestMapping("/updateAdmin")
    @ResponseBody
    public String   updaadmin (Admin admin,HttpServletResponse response,HttpServletRequest request) throws IOException {
        int i = adminService.updaadmin(admin);
        if (i>0){
            return "0";
        }else {
            return "1";
        }

    }

    @RequestMapping("/delAdmin")
    @ResponseBody
    public String   deleteByPrimaryKey (Integer id) throws IOException {
        int i = adminService.deleteByPrimaryKey(id);
        if (i>0){
            return  "0";
        }
        return  "1";
    }

    @RequestMapping("/admin-add")
    public  String addList(Admin admin){

    return "admin/admin-add";
    }

    @RequestMapping("/admin-save")
    @ResponseBody
    public  String addListt(Admin admin){
    admin.setStatus(1);
    int i = adminService.insert(admin);
        if (i>0){
            return  "0";
        }
        return  "1";
    }
    @RequestMapping("/findAdminByName")
    public   String getByName(Admin admin,HttpServletRequest request){
    List<Admin> list = adminService.getByName(admin);
    request.setAttribute("adminList",list);
    return "admin/admin-list";
    }

    @RequestMapping("/change-info")
    public String   updaadminn (Integer id,HttpServletResponse response,HttpServletRequest request) throws IOException {
        Admin list = adminService.GetAllById(id);
        request.setAttribute("list",list);

    return "admin/change-info";
    }


    @RequestMapping("/updateAdminn")
    @ResponseBody
    public String   updaadminn (Admin admin,HttpServletResponse response,HttpServletRequest request) throws IOException {
        int i = adminService.updaadmin(admin);
        if (i>0){
            return "0";
        }else {
            return "1";
        }

    }

    @RequestMapping("/logout")
    public  String loginout (HttpSession session){
        session.removeAttribute("list");
    return "admin/login";
    }
}
