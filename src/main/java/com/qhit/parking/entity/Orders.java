package com.qhit.parking.entity;

import java.util.Date;

public class Orders {
    private Integer id;

    private String code;

    private Integer userId;

    private Integer parkId;

    private Date createdate;

    private Integer status;

    private Double total;

    private Date enddate;

    private Integer sumpark;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private  User user;

    public Orders(Integer id, String code, Integer userId, Integer parkId, Date createdate, Integer status, Double total, Date enddate, Integer sumpark) {
        this.id = id;
        this.code = code;
        this.userId = userId;
        this.parkId = parkId;
        this.createdate = createdate;
        this.status = status;
        this.total = total;
        this.enddate = enddate;
        this.sumpark = sumpark;
    }

    public Orders() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getParkId() {
        return parkId;
    }

    public void setParkId(Integer parkId) {
        this.parkId = parkId;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getSumpark() {
        return sumpark;
    }

    public void setSumpark(Integer sumpark) {
        this.sumpark = sumpark;
    }
}