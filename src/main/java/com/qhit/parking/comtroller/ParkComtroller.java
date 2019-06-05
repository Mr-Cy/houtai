package com.qhit.parking.comtroller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.qhit.parking.entity.Park;
import com.qhit.parking.service.ParkService;
import com.qhit.parking.utils.ExcelUtiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/park")
public class ParkComtroller {
    @Autowired
    ParkService parkService;
    @RequestMapping("/list")
    public String selectAll(HttpServletRequest request) {
        List<Park> list = parkService.selectAll();
        request.setAttribute("parkList",list);
        return "park/park-list";
    }


    @RequestMapping("/park-add")
    public String add(HttpServletRequest request) {
        return "park/park-add";
    }
    @RequestMapping("/park-save")
    @ResponseBody
   public   String insert(Park record){
        int i = parkService.insert(record);
        if (i>0){
            return "0";
        }else {
            return "1";
        }


    }
    @RequestMapping("/park-delete")
    @ResponseBody
    public String deleteByPrimaryKey(Integer id){
        int i = parkService.deleteByPrimaryKey(id);
        if (i>0){
            return "0";
        }else {
            return "1";
        }
    }
    @RequestMapping("/findCarByKey")
    public   String GetAllByName(Park park,HttpServletRequest request){
        List<Park> list =parkService.GetAllByName(park);
        request.setAttribute("parkList",list);
        return "park/park-list";
    }

    @RequestMapping("/park-load")
    public String up(Integer id, HttpServletRequest request) {
        Park list= parkService.selectByPrimaryKey(id);
        request.setAttribute("park",list);
        return "park/park-edit";
    }
    @RequestMapping("/park-edit")
    @ResponseBody
    public String updateByPrimaryKey(Park record){
        int i = parkService.updateByPrimaryKey(record);
        if (i>0){
            return "0";
        }else {
            return "1";
        }
    }
    @RequestMapping("/delete-batch")
    @ResponseBody
    public String delById(Integer id, List list, HttpServletRequest request, HttpServletResponse response){
        String[] id1 = request.getParameterValues("id");
        List<Park> list1 = new ArrayList<>();
        Park park ;
        for (int a= 0; a<id1.length; a++){
            park = new Park();
            park.setId(new Integer(id1[a]));
            list1.add(park);
        }
        int i = parkService.delById(list1);
        if (i>0){
            return "0";
        }else {
            return "1";
        }

    }
    @RequestMapping("/export")
    public void export(HttpServletResponse response){
        List<Park> parkList = parkService.selectAll();
        ExcelUtiles.exportExcel(parkList,"车位列表","第一页",Park.class,"车位列表.xls",response);
    }


    @RequestMapping("/importfile")
    public String daoru(HttpServletResponse response){
        return "importfile/import";
    }

    @RequestMapping("/exportTemplate")
    public void exportt(HttpServletResponse response){
       List parkList =  new ArrayList();
        ExcelUtiles.exportExcel(parkList,"车位列表","第一页",Park.class,"车位列表.xls",response);
    }

    @RequestMapping("/import")
    @ResponseBody
    public HashMap importt(@RequestParam("file")MultipartFile file) throws Exception {
        HashMap map = new  HashMap();
        ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(1);
        List<Park> list = ExcelImportUtil.importExcel(file.getInputStream(),Park.class,params);
        int i = parkService.insertpark(list);
        if (i>0){
            map.put("res","0");
        }
        return map;
    }


}
