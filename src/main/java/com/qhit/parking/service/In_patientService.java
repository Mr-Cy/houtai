package com.qhit.parking.service;

import com.qhit.parking.entity.In_patient;

import java.util.List;

public interface In_patientService {

    List<In_patient> selectAll();


    List<In_patient> GetAllByName(In_patient in_patient);


    int insert(In_patient record);


    List<In_patient> GetBed();
}
