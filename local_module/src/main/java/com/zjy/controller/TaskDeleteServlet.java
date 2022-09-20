package com.zjy.controller;

import com.zjy.dao.TaskDao;
import com.zjy.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TaskDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        TaskDao dao = sqlSession.getMapper(TaskDao.class);
        String task_id;
        int result =0;
        PrintWriter out = null;
        //1、调用请求对象，读取请求头中的请求参数，拿到用户编号
        task_id = request.getParameter("task_id");
        //2、调用Dao，将用户编号填充到delete命令并发送到数据库服务器
        result=dao.delete(Integer.valueOf(task_id));
        //3、调用响应对象，将处理结果以二进制形式写入到响应体最终交给浏览器
        response.setContentType("text/html;charset=utf-8");
        out=response.getWriter();
        if(result==1){
            out.print("<font style='color:red;font-size:40'>任务删除成功</font>");
        }else{
            out.print("<font style='color:red;font-size:40'>任务删除失败</font>");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
