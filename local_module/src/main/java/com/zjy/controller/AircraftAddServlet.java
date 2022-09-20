package com.zjy.controller;

import com.zjy.dao.AircraftDao;
import com.zjy.dao.UserDao;
import com.zjy.entity.Aircrafts;
import com.zjy.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class AircraftAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        AircraftDao dao = sqlSession.getMapper(AircraftDao.class);
        //1、调用请求对象，读取请求头参数信息，得到用户参数信息
        String aircraft_unit,aircraft_card,aircraft_idcard,aircraft_time,aircraft_type,aircraft_long;
        Aircrafts aircrafts = null;
        int result = 0;
        PrintWriter out = null;
        aircraft_unit=request.getParameter("aircraft_unit");//单位
        aircraft_card=request.getParameter("aircraft_card");//姓名
        aircraft_idcard=request.getParameter("aircraft_idcard");//手机
        aircraft_time=request.getParameter("aircraft_time");//身份证号
        aircraft_type=request.getParameter("aircraft_type");//单位
        aircraft_long=request.getParameter("aircraft_long");//准驾机型
        //2、调用,将用户信息填充到INSERT命令并借助JDBC规范到数据库服务器
        aircrafts = new Aircrafts(null,aircraft_unit,aircraft_card,aircraft_idcard,aircraft_time,aircraft_type,aircraft_long);
        result = dao.add(aircrafts);
        //3、调用响应对象，将处理结果以二进制的形式写入到响应体中
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        if(result==1){
            response.sendRedirect("/local_module/aircraft_add_win.html");
        }else{
            response.sendRedirect("/local_module/aircraft_add_fall.html");

        }
        sqlSession.commit();
        sqlSession.close();
    }
}
