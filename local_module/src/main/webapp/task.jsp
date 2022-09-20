<%@ page import="java.util.List" %>
<%@ page import="com.zjy.entity.Tasks" %><%--
  Created by IntelliJ IDEA.
  User: zjy18
  Date: 2021/10/27
  Time: 9:21
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
        <td>航空器编号</td>
        <td>驾驶员</td>
        <td>任务类型</td>
        <td>任务状态</td>
        <td>创建时间</td>
        <td>航线</td>
        <td>飞行数据</td>
        <td>成果展示</td>
        <td colspan="2" align="center">操作</td>
        <%
            List list=(List)request.getAttribute("key");
            for(int i=0;i<list.size();i++){
                Tasks tasks =(Tasks) list.get(i);
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
    <td><%=tasks.getTask_id()%></td>
    <td><%=tasks.getTask_airid()%></td>
    <td><%=tasks.getTask_name()%></td>
    <td><%=tasks.getTask_type()%></td>
    <td><%=tasks.getTask_state()%></td>
    <td><%=tasks.getTask_time()%></td>
    <td><a href="controller.html"><input type="button" value="查看航线"></a></td>
    <td><a href="video.html"><input type="button" value="飞行数据"></a></td>
    <td><a href="video.html"><input type="button" value="成果展示"></a></td>
    <td>
        <a href="/local_module/task/delete?task_id=<%=tasks.getTask_id()%>">删除任务</a>
    </td>
</tr>
    <%
        }
    %>
    </tr>
</table>
</body>
</html>
