<%@ page import="java.util.List" %>
<%@ page import="com.zjy.entity.Users" %><%--
  Created by IntelliJ IDEA.
  User: zjy18
  Date: 2021/10/27
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>无人机在线管理平台</title>
</head>
<body>


<table border="2px" align="center">
    <tr>
        <td>用户编号</td>
        <td>用户姓名</td>
        <td>用户密码</td>
        <td colspan="2" align="center">操作</td>
            <%
            List list=(List)request.getAttribute("key");
            for(int i=0;i<list.size();i++){
                Users users =(Users) list.get(i);
         %>
            <%
            if(i%2==0){
        %>
    <tr style="background-color: cornflowerblue">
            <%
            }else {
        %>
    <tr style="background-color: darkkhaki">
        <%
            }
        %>
        <td><%=users.getUserId()%></td>
        <td><%=users.getUserName()%></td>
        <td><%=users.getPassword()%></td>
        <td>
            <a href="/local_module/user/delete?userId=<%=users.getUserId()%>">删除用户</a>
        </td>
    </tr>
    <%
        }
    %>
    </tr>
</table>
</body>
</html>