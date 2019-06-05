package com.qhit.parking.comtroller;

import com.qhit.parking.entity.Orders;
import com.qhit.parking.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersComtroller {
@Autowired
    OrdersService ordersService;

    @RequestMapping("/order-list")
    public String selectAll(HttpServletRequest request) {
        List<Orders> list = ordersService.selectAll();
        request.setAttribute("orderList",list);
        return "order/order-list";
    }

    @RequestMapping("/delOrder")
    @ResponseBody
    public String deleteByPrimaryKey(Integer id){
        int i = ordersService.deleteByPrimaryKey(id);
        if (i>0){
            return "0";
        }else {
            return "1";
        }
    }
    @RequestMapping("/findOrderByKey")
   public String GetAllByName(Orders orders,HttpServletRequest request){
       List<Orders> list =ordersService.GetAllByName(orders);
       request.setAttribute("orderList",list);
        return "order/order-list";
    };
}
