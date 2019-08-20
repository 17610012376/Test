<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhaozhenhui
  Date: 2019-04-29
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>编号</th>
            <th>班级</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th colspan="3">操作</th>

        </tr>
        <c:forEach items="${stu}" var="s">
            <tr>
                <td>${s.stuId}</td>
                <td>${s.cls.claName}</td>
                <td>${s.name}</td>
                <td>${s.sex}</td>
                <td>${s.age}</td>
                <td>
                    <a href="#">删除</a>
                </td>




            </tr>
        </c:forEach>
    </table>
</body>
</html>
