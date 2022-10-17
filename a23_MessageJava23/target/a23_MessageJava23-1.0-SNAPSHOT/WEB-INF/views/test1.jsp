<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ygs30
  Date: 2022-10-17
  Time: 오후 3:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <title>test1</title>
</head>
<body>
    <h1>test1</h1>
    <h3>aaa.a1 : <spring:message code="aaa.a1"/></h3>
    <h3>bbb.b1 : <spring:message code="bbb.b1"/></h3>

    <h3>aaa.a2 : <spring:message code="aaa.a2" arguments="${args}"/></h3>
    <h3>aaa.a3 : <spring:message code="aaa.a3" /></h3>
</body>
</html>
