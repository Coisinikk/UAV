package com.zjy.entity;

public class Drivers {
    private Integer driver_id;//编号
    private String driver_unit;//单位
    private String driver_name;//姓名
    private String driver_phone;//手机
    private String driver_card;//身份证号
    private String driver_idcard;//驾照编号
    private String driver_type;//准驾机型

    public Integer getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(Integer driver_id) {
        this.driver_id = driver_id;
    }

    public String getDriver_unit() {
        return driver_unit;
    }

    public void setDriver_unit(String driver_unit) {
        this.driver_unit = driver_unit;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getDriver_phone() {
        return driver_phone;
    }

    public void setDriver_phone(String driver_phone) {
        this.driver_phone = driver_phone;
    }

    public String getDriver_card() {
        return driver_card;
    }

    public void setDriver_card(String driver_card) {
        this.driver_card = driver_card;
    }

    public String getDriver_idcard() {
        return driver_idcard;
    }

    public void setDriver_idcard(String driver_idcard) {
        this.driver_idcard = driver_idcard;
    }

    public String getDriver_type() {
        return driver_type;
    }

    public void setDriver_type(String driver_type) {
        this.driver_type = driver_type;
    }

    public Drivers(Integer driver_id, String driver_unit, String driver_name, String driver_phone, String driver_card, String driver_idcard, String driver_type) {
        this.driver_id = driver_id;
        this.driver_unit = driver_unit;
        this.driver_name = driver_name;
        this.driver_phone = driver_phone;
        this.driver_card = driver_card;
        this.driver_idcard = driver_idcard;
        this.driver_type = driver_type;
    }

    public Drivers() {
    }

    @Override
    public String toString() {
        return "Drivers{" +
                "driver_id=" + driver_id +
                ", driver_unit='" + driver_unit + '\'' +
                ", driver_name='" + driver_name + '\'' +
                ", driver_phone='" + driver_phone + '\'' +
                ", driver_card='" + driver_card + '\'' +
                ", driver_idcard='" + driver_idcard + '\'' +
                ", driver_type='" + driver_type + '\'' +
                '}';
    }
}
