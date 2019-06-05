package com.qhit.parking.dao;

import com.qhit.parking.entity.Park;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ParkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Park record);

    Park selectByPrimaryKey(Integer id);

    List<Park> selectAll();

    int updateByPrimaryKey(Park record);

    List<Park> GetAllByName(Park park);


    int delById(List list);

    List<Park> getall();

    int insertpark(List list);

    List getname (Integer id);
}