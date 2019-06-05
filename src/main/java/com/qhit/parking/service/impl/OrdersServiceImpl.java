package com.qhit.parking.service.impl;

import com.qhit.parking.dao.OrdersMapper;
import com.qhit.parking.entity.Orders;
import com.qhit.parking.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    OrdersMapper ordersMapper;
    @Override
    public List<Orders> selectAll() {
        return ordersMapper.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ordersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Orders> GetAllByName(Orders orders) {
        return ordersMapper.GetAllByName(orders);
    }
}
