package com.qhit.parking.dao;

import com.qhit.parking.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    Admin selectByPrimaryKey(Integer id);

    List<Admin> selectAll();

    int updateByPrimaryKey(Admin record);

   Admin selNameByPwd(Admin admin);


    int  upda (Admin admin);

   Admin GetAllById(Integer id);


   int updaadmin (Admin admin);

   List<Admin> getByName(Admin admin);
}