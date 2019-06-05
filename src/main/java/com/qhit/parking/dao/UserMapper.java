package com.qhit.parking.dao;

import com.qhit.parking.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    int upByIdByUser (User user);


    List<User> GetAllByNameByUser(User user);

   User getBynameAndPwd(User user);
}