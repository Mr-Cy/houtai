package com.qhit.parking.service.impl;

import com.qhit.parking.dao.MessageMapper;
import com.qhit.parking.entity.Message;
import com.qhit.parking.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageMapper messageMapper;

    @Override
    public List<Message> selectAll() {
        return messageMapper.selectAll();
    }
}
