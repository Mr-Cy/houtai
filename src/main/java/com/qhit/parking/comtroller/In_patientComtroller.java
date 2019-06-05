package com.qhit.parking.comtroller;

import com.qhit.parking.entity.In_patient;
import com.qhit.parking.service.In_patientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/Inpatient")
public class In_patientComtroller {
    @Autowired
    In_patientService in_patientService;
    @RequestMapping("/list")
    public String selectAll(HttpServletRequest request){
        List<In_patient> list= in_patientService.selectAll();
        request.setAttribute("Inpatient",list);

        return "inpatient/inpatient-list";
    }
    @RequestMapping("/list-all")
     public    String GetAllByName(In_patient in_patient,HttpServletRequest request){
         List<In_patient> list = in_patientService.GetAllByName(in_patient);
        request.setAttribute("Inpatient",list);
        return "inpatient/inpatient-list";

    }

    @RequestMapping("/inpatient-add")
    public    String add(In_patient in_patient, HttpServletRequest request, Model model){
        List<In_patient> list= in_patientService.selectAll();
//        request.setAttribute("list",list);
        model.addAttribute("list",list);
        return "inpatient/inpatient-add";

    }
    @RequestMapping("/park-save")
    @ResponseBody
    public String insert(In_patient record){
       int i =  in_patientService.insert(record);
        if (i>0){
            return "0";
        }else {
            return "1";
        }
    }

    public  String  GetBed(){
        List<In_patient> list = in_patientService.GetBed();
        return "";
    }
}
