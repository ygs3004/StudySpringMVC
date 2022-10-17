<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>result1</title>
</head>
<body>
    <h1>result1</h1>
    <h3>application1.data1 : ${requestScope.applicationBean1.data1}</h3>
    <h3>application1.data1 : ${requestScope.applicationBean1.data2}</h3>

    <h3>application2.data3(applicationScope) : ${applicationScope.applicationBean2.data3}</h3>
    <h3>application2.data4(applicationScope) : ${applicationScope.applicationBean2.data4}</h3>

    <h3>application3.data5(applicationScope) : ${applicationScope.applicationBean3.data5}</h3>
    <h3>application3.data6(applicationScope) : ${applicationScope.applicationBean3.data6}</h3>

    <h3>application3.data5 : ${requestScope.applicationBean3.data5}</h3>
    <h3>application3.data6 : ${requestScope.applicationBean3.data6}</h3>

    <h3>application4.data7 : ${requestScope.applicationBean4.data7}</h3>
    <h3>application4.data8 : ${requestScope.applicationBean4.data8}</h3>
</body>
</html>
