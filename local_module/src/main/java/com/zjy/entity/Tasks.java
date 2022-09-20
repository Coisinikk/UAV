package com.zjy.entity;

public class Tasks {
    private Integer task_id;//编号
    private String task_airid;//航空器编号
    private String task_name;//驾驶员
    private String task_type;//任务类型
    private String task_state;//任务状态
    private String task_time;//创建时间

    public Tasks(Integer task_id, String task_airid, String task_name, String task_type, String task_state, String task_time) {
        this.task_id = task_id;
        this.task_airid = task_airid;
        this.task_name = task_name;
        this.task_type = task_type;
        this.task_state = task_state;
        this.task_time = task_time;
    }

    public Tasks() {
    }

    public Integer getTask_id() {
        return task_id;
    }

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
    }

    public String getTask_airid() {
        return task_airid;
    }

    public void setTask_airid(String task_airid) {
        this.task_airid = task_airid;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getTask_type() {
        return task_type;
    }

    public void setTask_type(String task_type) {
        this.task_type = task_type;
    }

    public String getTask_state() {
        return task_state;
    }

    public void setTask_state(String task_state) {
        this.task_state = task_state;
    }

    public String getTask_time() {
        return task_time;
    }

    public void setTask_time(String task_time) {
        this.task_time = task_time;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "task_id=" + task_id +
                ", task_airid='" + task_airid + '\'' +
                ", task_name='" + task_name + '\'' +
                ", task_type='" + task_type + '\'' +
                ", task_state='" + task_state + '\'' +
                ", task_time='" + task_time + '\'' +
                '}';
    }
}
