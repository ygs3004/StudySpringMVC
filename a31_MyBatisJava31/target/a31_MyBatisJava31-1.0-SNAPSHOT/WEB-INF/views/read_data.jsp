<%--
  Created by IntelliJ IDEA.
  User: ygs30
  Date: 2022-10-20
  Time: 오후 2:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>read_data</title>
</head>
<body>
    <c:forEach var="obj" items="${list}">
        ${obj.data1}, ${obj.data2}, ${obj.data3}
    </c:forEach>
</body>
</html>

