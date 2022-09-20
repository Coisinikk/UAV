package com.zjy.dao;

import com.zjy.entity.Tasks;

import java.util.List;

public interface TaskDao {
    //添加任务
    int add(Tasks task);
    //查询任务
    List findAll();
    //删除任务
    int delete(Integer task_id);
}