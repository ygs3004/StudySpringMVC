<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ygs30
  Date: 2022-10-19
  Time: 오전 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>input_data</title>
</head>
<body>
    <h1>input_data</h1>
    <h1>input_data</h1>
    <form:form action='input_pro' modelAttribute="dataBean1" method='post'>

        data1 : <form:input path="data1" type="text"/><br/>
                <form:errors path="data1"/><br/>

        data2 : <form:input path="data2" type="text"/><br/>
                <form:errors path="data2"/><br/>

        data3 : <form:input path="data3" type="text"/><br/>
                <form:errors path="data3"/><br/>

        <form:button type='submit'>확인</form:button>

    </form:form>
</body>
</html>
