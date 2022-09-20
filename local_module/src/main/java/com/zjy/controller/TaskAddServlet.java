package com.zjy.controller;

import com.zjy.dao.TaskDao;
import com.zjy.dao.UserDao;
import com.zjy.entity.Tasks;
import com.zjy.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class TaskAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        TaskDao dao = sqlSession.getMapper(TaskDao.class);
        String task_airid,task_name,task_type,task_state,task_time;
        Tasks task = null;
        int result = 0;
        PrintWriter out = null;
        task_airid=request.getParameter("task_airid");
        task_name=request.getParameter("task_name");
        task_type=request.getParameter("task_type");
        task_state=request.getParameter("task_state");
        task_time=request.getParameter("task_time");
        //2、调用UserDao,将用户信息填充到INSERT命令并借助JDBC规范到数据库服务器
        task = new Tasks(null,task_airid,task_name,task_type,task_state,task_time);
        result = dao.add(task);
        //3、调用响应对象，将处理结果以二进制的形式写入到响应体中
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        if(result==1){
            response.sendRedirect("/local_module/task_win.html");

        }else{
            response.sendRedirect("/local_module/task_fall.html");

        }
        sqlSession.commit();
        sqlSession.close();
    }
}
