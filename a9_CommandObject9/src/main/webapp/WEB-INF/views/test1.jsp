<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>test1</title>
</head>
<body>
    <h1>test1</h1>
    <%-- 클래스 이름으로 request 영역에 저장되기 때문에 dataBean으로 해야한다.(클래스 이름 소문자 시작) --%>
    <h3>data1 : ${requestScope.dataBean.data1}</h3>
    <h3>data1 : ${requestScope.dataBean.data2}</h3>
</body>
</html>