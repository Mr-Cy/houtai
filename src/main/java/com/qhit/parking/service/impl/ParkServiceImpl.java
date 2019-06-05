package com.qhit.parking.service.impl;

import com.qhit.parking.dao.ParkMapper;
import com.qhit.parking.entity.Park;
import com.qhit.parking.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkServiceImpl implements ParkService {
    @Autowired
    ParkMapper parkMapper;
    @Override
    public List<Park> selectAll() {
        return parkMapper.selectAll();
    }

    @Override
    public int insert(Park record) {
        return parkMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return parkMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Park> GetAllByName(Park park) {
        return parkMapper.GetAllByName(park);
    }

    @Override
    public Park selectByPrimaryKey(Integer id) {
        return parkMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Park record) {
        return parkMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delById(List list) {
        return parkMapper.delById(list);
    }

    @Override
    public List<Park> getall() {
        return parkMapper.getall();
    }

    @Override
    public int insertpark(List list) {
        return parkMapper.insertpark(list);
    }

    @Override
    public List getname(Integer id) {
        return parkMapper.getname(id);
    }
}
