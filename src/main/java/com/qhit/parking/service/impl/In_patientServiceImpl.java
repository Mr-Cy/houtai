package com.qhit.parking.service.impl;

import com.qhit.parking.dao.In_patientMapper;
import com.qhit.parking.entity.In_patient;
import com.qhit.parking.service.In_patientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class In_patientServiceImpl implements In_patientService {
    @Autowired
    In_patientMapper in_patientMapper;

    @Override
    public List<In_patient> selectAll() {
        return in_patientMapper.selectAll();
    }

    @Override
    public List<In_patient> GetAllByName(In_patient in_patient) {
        return in_patientMapper.GetAllByName(in_patient);
    }

    @Override
    public int insert(In_patient record) {
        return in_patientMapper.insert(record);
    }

    @Override
    public List<In_patient> GetBed() {
        return in_patientMapper.GetBed();
    }
}
