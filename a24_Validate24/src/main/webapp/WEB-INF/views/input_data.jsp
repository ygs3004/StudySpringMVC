<%--
  Created by IntelliJ IDEA.
  User: ygs30
  Date: 2022-10-18
  Time: 오전 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>input_data</title>
</head>
<body>
    <h1>input_data</h1>
    <form action="input_pro" method="post">
        data1 : <input type="text" name="data1"><br>
        <spring:hasBindErrors name="dataBean1">
            <c:if test="${errors.hasFieldErrors('data1')}">
                ${errors.getFieldError('data1').defaultMessage}<br>
            </c:if>
        </spring:hasBindErrors>
        data2 : <input type="text" name="data2"><br>
        <spring:hasBindErrors name="dataBean1">
            <c:if test="${errors.hasFieldErrors('data2')}">
                ${errors.getFieldError('data2').defaultMessage}<br>
            </c:if>
        </spring:hasBindErrors>
        <button type="submit">확인</button>
    </form>
</body>
</html>