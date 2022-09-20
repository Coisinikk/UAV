package com.zjy.controller;

import com.zjy.dao.UserDao;
import com.zjy.entity.Users;
import com.zjy.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class UserAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        String userName,password;
        Users user = null;
        int result = 0;
        PrintWriter out = null;
        userName=request.getParameter("uname");
        password=request.getParameter("password");
        //2、调用UserDao,将用户信息填充到INSERT命令并借助JDBC规范到数据库服务器
        user = new Users(null,userName,password);
        result = dao.add(user);
        //3、调用响应对象，将处理结果以二进制的形式写入到响应体中
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        if(result==1){
            HttpSession session = request.getSession();
            response.sendRedirect("/local_module/register_win.html");

        }else{
            response.sendRedirect("/local_module/register_fall.html");

        }
        sqlSession.commit();
        sqlSession.close();
    }
    //Tomcat负责销毁请求对象和响应对象
    //Tomcat负责将Http请求协议包推送到发起请求的浏览器上
    //浏览器根据响应头中的content-type属性指定编译器对响应体二进制内容进行编译
    //浏览器将编译后的结果在窗口中展示给用户，此时互联网通信结束
}

