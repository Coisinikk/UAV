package com.zjy.dao;

import com.zjy.entity.Aircrafts;


import java.util.List;

public interface AircraftDao {
    //添加航空器
    int add(Aircrafts aircraft);
    //查询航空器
    List findAll();
    //删除航空器
    int delete(Integer aircraft_id);
}
