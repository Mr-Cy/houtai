package com.qhit.parking.dao;

import com.qhit.parking.entity.In_patient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface In_patientMapper {
    int deleteByPrimaryKey(Integer patientId);

    int insert(In_patient record);

    In_patient selectByPrimaryKey(Integer patientId);

    List<In_patient> selectAll();

    int updateByPrimaryKey(In_patient record);

    List<In_patient> GetAllByName(In_patient in_patient);

    List<In_patient> GetBed();
}