package com.qhit.parking.service.impl;

import com.qhit.parking.dao.UserMapper;
import com.qhit.parking.entity.Admin;
import com.qhit.parking.entity.User;
import com.qhit.parking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public int upByIdByUser(User user) {
        return userMapper.upByIdByUser(user);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<User> GetAllByNameByUser(User user) {
        return userMapper.GetAllByNameByUser(user);
    }

    @Override
    public User getBynameAndPwd(User user) {
        return userMapper.getBynameAndPwd(user);
    }

}
