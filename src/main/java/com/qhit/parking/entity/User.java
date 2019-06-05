package com.qhit.parking.entity;

import java.util.Date;

public class User {
    private Integer id;

    private String name;

    private String password;

    private String phone;

    private String plateNum;

    private Integer stauts;

    private Date createdate;

    private Integer point;

    public User(Integer id, String name, String password, String phone, String plateNum, Integer stauts, Date createdate, Integer point) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.plateNum = plateNum;
        this.stauts = stauts;
        this.createdate = createdate;
        this.point = point;
    }

    public User() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum == null ? null : plateNum.trim();
    }

    public Integer getStauts() {
        return stauts;
    }

    public void setStauts(Integer stauts) {
        this.stauts = stauts;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }
}