package com.qhit.parking.comtroller;

import com.qhit.parking.entity.Park;
import com.qhit.parking.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/tuxing")
public class TuxComtroller {
@Autowired
    ParkService parkService;
    @RequestMapping("/demo")
    @ResponseBody
    public List all(){
        List<Park> list = parkService.getall();
        return list;
    }
    @RequestMapping("/demoo")
    public String alll(){
        return "tuxing/demo";
    }

    @RequestMapping("/demo1")
    public String alll1(){
        return "tuxing/zhexian";
    }
}
