package com.qhit.parking.service;

import com.qhit.parking.entity.Admin;
import com.qhit.parking.entity.User;

import java.util.List;

public interface UserService {

    List<User> selectAll();


    int updateByPrimaryKey(User record);

    int upByIdByUser (User user);

    int deleteByPrimaryKey(Integer id);

    List<User> GetAllByNameByUser(User user);

    User getBynameAndPwd(User user);
}
