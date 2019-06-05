package com.qhit.parking.service;

import com.qhit.parking.entity.Park;

import java.util.List;

public interface ParkService {


    List<Park> selectAll();


    int insert(Park record);


    int deleteByPrimaryKey(Integer id);


    List<Park> GetAllByName(Park park);

    Park selectByPrimaryKey(Integer id);


    int updateByPrimaryKey(Park record);

    int delById(List list);

    List<Park> getall();

    int insertpark(List list);

    List getname (Integer id);

}
