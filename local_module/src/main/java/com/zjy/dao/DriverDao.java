package com.zjy.dao;

import com.zjy.entity.Drivers;
import java.util.List;

public interface DriverDao {
    //增加驾驶员
    int add(Drivers driver);
    //查询驾驶员
    List findAll();
    //删除驾驶员
    int delete(Integer driver_id);
}
