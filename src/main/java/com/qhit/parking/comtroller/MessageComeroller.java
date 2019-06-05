package com.qhit.parking.comtroller;

import com.qhit.parking.entity.Message;
import com.qhit.parking.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/")
public class MessageComeroller {
@Autowired
    MessageService messageService;
    @RequestMapping("/")
    public String selectAll(HttpServletRequest request){
        List<Message> list = messageService.selectAll();
        request.setAttribute("",list);
    return "";
    }
}
