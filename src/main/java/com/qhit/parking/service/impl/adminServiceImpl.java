package com.qhit.parking.service.impl;

import com.qhit.parking.dao.AdminMapper;
import com.qhit.parking.entity.Admin;
import com.qhit.parking.service.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class adminServiceImpl implements adminService {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public Admin selNameByPwd(Admin admin) {
        return adminMapper.selNameByPwd(admin);
    }

    @Override
    public List<Admin> selectAll() {
        return adminMapper.selectAll();
    }

    @Override
    public int upda(Admin admin) {
        return adminMapper.upda(admin);
    }

    @Override
    public Admin GetAllById(Integer id) {
        return adminMapper.GetAllById(id);
    }

    @Override
    public int updaadmin(Admin admin) {
        return adminMapper.updaadmin(admin);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return adminMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Admin record) {
        return adminMapper.insert(record);
    }

    @Override
    public List<Admin> getByName(Admin admin) {
        return adminMapper.getByName(admin);
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return adminMapper.updateByPrimaryKey(record);
    }
}
