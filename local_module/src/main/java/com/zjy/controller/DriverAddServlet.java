package com.zjy.controller;

import com.zjy.dao.DriverDao;
import com.zjy.dao.UserDao;
import com.zjy.entity.Drivers;
import com.zjy.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class DriverAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        DriverDao dao = sqlSession.getMapper(DriverDao.class);
        //1、调用请求对象，读取请求头参数信息，得到用户参数信息
        String driver_unit,driver_name,driver_phone,driver_card,driver_idcard,driver_type;
        Drivers drivers = null;
        int result = 0;
        PrintWriter out = null;
        driver_unit=request.getParameter("driver_unit");//单位
        driver_name=request.getParameter("driver_name");//姓名
        driver_phone=request.getParameter("driver_phone");//手机
        driver_card=request.getParameter("driver_card");//身份证号
        driver_idcard=request.getParameter("driver_idcard");//单位
        driver_type=request.getParameter("driver_type");//准驾机型
        //2、调用UserDao,将用户信息填充到INSERT命令并借助JDBC规范到数据库服务器
        drivers = new Drivers(null,driver_unit,driver_name,driver_phone,driver_card,driver_idcard,driver_type);
        result = dao.add(drivers);
        //3、调用响应对象，将处理结果以二进制的形式写入到响应体中
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        if(result==1){
            response.sendRedirect("/local_module/driver_add_win.html");

        }else{
            response.sendRedirect("/local_module/driver_add_fall.html");

        }
        sqlSession.commit();
        sqlSession.close();
    }
}
