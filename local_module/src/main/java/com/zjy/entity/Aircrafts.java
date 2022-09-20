package com.zjy.entity;

public class Aircrafts {
    private Integer aircraft_id;//编号
    private String aircraft_unit;//单位
    private String aircraft_card;//航空器编号
    private String aircraft_idcard;//识别编码
    private String aircraft_time;//离线时间
    private String aircraft_type;//飞行状态
    private String aircraft_long;//飞行时间

    public Aircrafts() {
    }

    public Aircrafts(Integer aircraft_id, String aircraft_unit, String aircraft_card, String aircraft_idcard, String aircraft_time, String aircraft_type, String aircraft_long) {
        this.aircraft_id = aircraft_id;
        this.aircraft_unit = aircraft_unit;
        this.aircraft_card = aircraft_card;
        this.aircraft_idcard = aircraft_idcard;
        this.aircraft_time = aircraft_time;
        this.aircraft_type = aircraft_type;
        this.aircraft_long = aircraft_long;
    }

    public Integer getAircraft_id() {
        return aircraft_id;
    }

    public void setAircraft_id(Integer aircraft_id) {
        this.aircraft_id = aircraft_id;
    }

    public String getAircraft_unit() {
        return aircraft_unit;
    }

    public void setAircraft_unit(String aircraft_unit) {
        this.aircraft_unit = aircraft_unit;
    }

    public String getAircraft_card() {
        return aircraft_card;
    }

    public void setAircraft_card(String aircraft_card) {
        this.aircraft_card = aircraft_card;
    }

    public String getAircraft_idcard() {
        return aircraft_idcard;
    }

    public void setAircraft_idcard(String aircraft_idcard) {
        this.aircraft_idcard = aircraft_idcard;
    }

    public String getAircraft_time() {
        return aircraft_time;
    }

    public void setAircraft_time(String aircraft_time) {
        this.aircraft_time = aircraft_time;
    }

    public String getAircraft_type() {
        return aircraft_type;
    }

    public void setAircraft_type(String aircraft_type) {
        this.aircraft_type = aircraft_type;
    }

    public String getAircraft_long() {
        return aircraft_long;
    }

    public void setAircraft_long(String aircraft_long) {
        this.aircraft_long = aircraft_long;
    }

    @Override
    public String toString() {
        return "Aircrafts{" +
                "aircraft_id=" + aircraft_id +
                ", aircraft_unit='" + aircraft_unit + '\'' +
                ", aircraft_card='" + aircraft_card + '\'' +
                ", aircraft_idcard='" + aircraft_idcard + '\'' +
                ", aircraft_time='" + aircraft_time + '\'' +
                ", aircraft_type='" + aircraft_type + '\'' +
                ", aircraft_long='" + aircraft_long + '\'' +
                '}';
    }
}
