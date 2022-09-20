<%@ page import="java.util.List" %>
<%@ page import="com.zjy.entity.Aircrafts" %><%--
  Created by IntelliJ IDEA.
  User: zjy18
  Date: 2021/11/13
  Time: 15:31
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
        <td>编号</td>
        <td>单位</td>
        <td>航空器编号</td>
        <td>识别编码</td>
        <td>最后离线</td>
        <td>飞行状态</td>
        <td>飞行时间</td>
        <td colspan="2" align="center">操作</td>
            <%
            List list=(List)request.getAttribute("key");
            for(int i=0;i<list.size();i++){
                Aircrafts aircrafts=(Aircrafts)list.get(i);
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
        <td><%=aircrafts.getAircraft_id()%></td>
        <td><%=aircrafts.getAircraft_unit()%></td>
        <td><%=aircrafts.getAircraft_card()%></td>
        <td><%=aircrafts.getAircraft_idcard()%></td>
        <td><%=aircrafts.getAircraft_time()%></td>
        <td><%=aircrafts.getAircraft_type()%></td>
        <td><%=aircrafts.getAircraft_long()%></td>
        <td>
            <a href="/local_module/driver/delete?aircraft_id=<%=aircrafts.getAircraft_id()%>">删除航空器</a>
        </td>
    </tr>
    <%
        }
    %>
    </tr>
</table>
</body>
</html>
