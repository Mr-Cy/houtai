package com.qhit.parking.comtroller;

import com.qhit.parking.entity.Admin;
import com.qhit.parking.entity.Notice;
import com.qhit.parking.service.noticeService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/notice")
public class noticeComtroller {
    @Autowired
    noticeService noticeService;

    @RequestMapping("/noticeList")
     public String selectAll(HttpServletRequest request){
        List<Notice> list = noticeService.selectAll();
        request.setAttribute("noticeList",list);
     return "notice/notice-list";
    }

    @RequestMapping("/notice-edit")
   public String selectByPrimaryKey(Integer id,HttpServletRequest request){
        Notice not = noticeService.selectByPrimaryKey(id);
        request.setAttribute("notice",not);
        return "notice/notice-edit";
    }
    @RequestMapping("/notice-update")
    @ResponseBody
    public String update(Notice record){
        int i = noticeService.yodateByID(record);
        if (i>0){
            return "0";
        }else{
            return "1";
        }
    }
    @RequestMapping("/delNotice")
    @ResponseBody
    public String deleteByPrimaryKey(Integer id){
        int i = noticeService.deleteByPrimaryKey(id);
        if (i>0){
            return "0";
        }else {
            return "1";
        }

    }

    @RequestMapping("/notice-add")
    public String add(){
        return "notice/notice-add";
    }

    @RequestMapping("/notice-save")
    @ResponseBody
    public String addsave(Notice notice,HttpSession session){
      Admin list= (Admin) session.getAttribute("list");
      notice.setAdminId(list.getId());
      notice.setAdminName(list.getName());
        int  i = noticeService.insert(notice);
        if (i>0){
            return "0";
        }else {
            return "1";
        }

    }
    @RequestMapping("/findNoticeByTitle")
    public String GetByName(Notice notice,HttpServletRequest request){
        List<Notice> list = noticeService.GetByName(notice);
        request.setAttribute("noticeList",list);
        return "notice/notice-list";


    }

}
