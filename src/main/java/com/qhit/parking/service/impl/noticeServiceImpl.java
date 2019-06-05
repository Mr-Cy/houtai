package com.qhit.parking.service.impl;

import com.qhit.parking.dao.NoticeMapper;
import com.qhit.parking.entity.Notice;
import com.qhit.parking.service.noticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class noticeServiceImpl implements noticeService {
    @Autowired
    NoticeMapper noticeMapper;
    @Override
    public List<Notice> selectAll() {
        return noticeMapper.selectAll();
    }

    @Override
    public Notice selectByPrimaryKey(Integer id) {
        return noticeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(Notice record) {
        return noticeMapper.insert(record);
    }

    @Override
    public int yodateByID(Notice notice) {
        return noticeMapper.yodateByID(notice);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return noticeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Notice> GetByName(Notice notice) {
        return noticeMapper.GetByName(notice);
    }
}
