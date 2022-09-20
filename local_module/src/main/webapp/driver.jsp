<%@ page import="java.util.List" %>
<%@ page import="com.zjy.entity.Drivers" %><%--
  Created by IntelliJ IDEA.
  User: zjy18
  Date: 2021/10/27
  Time: 10:45
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
        <td>单位</td>
        <td>姓名</td>
        <td>手机</td>
        <td>身份证号</td>
        <td>驾照编号</td>
        <td>准驾机型</td>
        <td colspan="2" align="center">操作</td>
            <%
            List list=(List)request.getAttribute("key");
            for(int i=0;i<list.size();i++){
                Drivers drivers =(Drivers) list.get(i);
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
        <td><%=drivers.getDriver_id()%></td>
        <td><%=drivers.getDriver_unit()%></td>
        <td><%=drivers.getDriver_name()%></td>
        <td><%=drivers.getDriver_phone()%></td>
        <td><%=drivers.getDriver_card()%></td>
        <td><%=drivers.getDriver_idcard()%></td>
        <td><%=drivers.getDriver_type()%></td>
        <td>
            <a href="/local_module/driver/delete?driver_id=<%=drivers.getDriver_id()%>">删除驾驶员</a>
        </td>
    </tr>
    <%
        }
    %>
    </tr>
</table>
</body>
</html>
