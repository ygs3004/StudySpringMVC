<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <h1>Hello Spring MVC</h1>
    <img src="image/icon-spring-framework.svg">

    <form action="test1" method="post">
        data1 : <input type="text" name="data1"><br>
        data2 : <input type="text" name="data2"><br>
        <button type="submit">확인</button>
    </form>
    <hr>
    <form action="test2" method="post">
        data1 : <input type="text" name="data1"><br>
        data2 : <input type="text" name="data2"><br>
        <button type="submit">확인</button>
    </form>
</body>
</html>