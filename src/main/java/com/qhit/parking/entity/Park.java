package com.qhit.parking.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class Park {

    private Integer id;
    @Excel(name = "名字")
    private String name;
    @Excel(name = "价钱")
    private Double price;
    @Excel(name = "状态",replace = {"已预约_1","未预约_0"})
    private Integer status;
    @Excel(name = "地址")
    private String parkaddr;

    public Park(Integer id, String name, Double price, Integer status, String parkaddr) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
        this.parkaddr = parkaddr;
    }

    public Park() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getParkaddr() {
        return parkaddr;
    }

    public void setParkaddr(String parkaddr) {
        this.parkaddr = parkaddr == null ? null : parkaddr.trim();
    }
}