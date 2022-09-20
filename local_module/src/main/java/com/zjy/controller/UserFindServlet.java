package com.zjy.controller;

import com.zjy.dao.UserDao;
import com.zjy.entity.Users;
import com.zjy.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserFindServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        //1、调用Dao推送查询命令得到所有的任务
        List<Users> userList = dao.findAll();
        //2、将得到的试题添加到请求作用域对象作为共享数据
        request.setAttribute("key",userList);
        //3、请求转发向tomcat调用question.jsp将结果与html标签写入到响应体
        request.getRequestDispatcher("/user.jsp").forward(request,response);
        sqlSession.commit();
        sqlSession.close();
    }
}
