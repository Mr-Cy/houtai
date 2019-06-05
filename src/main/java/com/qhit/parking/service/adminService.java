package com.qhit.parking.service;

import com.qhit.parking.entity.Admin;

import java.util.List;

public interface adminService {

    Admin selNameByPwd(Admin admin);

    List<Admin> selectAll();

    int  upda (Admin admin);

    Admin GetAllById(Integer id);


    int updaadmin (Admin admin);

    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    List<Admin> getByName(Admin admin);


    int updateByPrimaryKey(Admin record);
}
