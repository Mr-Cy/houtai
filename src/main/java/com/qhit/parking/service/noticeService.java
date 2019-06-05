package com.qhit.parking.service;

import com.qhit.parking.entity.Notice;

import java.util.List;

public interface noticeService {


    List<Notice> selectAll();


    Notice selectByPrimaryKey(Integer id);


    int insert(Notice record);



    int yodateByID(Notice notice);


    int deleteByPrimaryKey(Integer id);


    List<Notice> GetByName(Notice notice);
}
