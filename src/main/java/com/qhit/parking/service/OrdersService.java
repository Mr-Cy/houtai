package com.qhit.parking.service;

import com.qhit.parking.entity.Orders;

import java.util.List;

public interface OrdersService {

    List<Orders> selectAll();


    int deleteByPrimaryKey(Integer id);


    List<Orders> GetAllByName(Orders orders);
}
