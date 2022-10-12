<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>test1</title>
</head>
<body>
    <h1>test1</h1>
    <form:form action="result" modelAttribute="dataBean">
        <form:select path="a1">
            <form:option value="data1">항목1</form:option>
            <form:option value="data2">항목2</form:option>
            <form:option value="data3">항목3</form:option>
        </form:select>
        <hr>
        <form:select path="a2">
            <form:options items="${requestScope.data_list1}"/>
        </form:select>
        <hr>
        <form:select path="a3">
            <form:options items="${requestScope.data_list2}"/>
        </form:select>
        <hr>
        <form:select path="a4">
            <form:options items="${requestScope.data_list3 }" itemLabel="key" itemValue="value"/>
        </form:select>
        <hr>
        <form:checkbox path="a5" value="data1"/>항목1
        <form:checkbox path="a5" value="data2"/>항목2
        <form:checkbox path="a5" value="data3"/>항목3
        <hr>
        <form:checkboxes path="a6" items="${requestScope.data_list1}"/>
        <hr>
        <from:checkboxes path="a7" items="${requestScope.data_list2}"/>
        <hr>
        <from:checkboxes path="a8" items="${requestScope.data_list3}" itemLabel="key" itemValue="value"/>
        <hr>
        <form:radiobutton path="a9" value="data1"/>항목1
        <form:radiobutton path="a9" value="data1"/>항목2
        <form:radiobutton path="a9" value="data1"/>항목3
        <hr>
        <form:radiobuttons path="a10" items="${requestScope.data_list1}"/>
        <hr>
        <form:radiobuttons path="a11" items="${requestScope.data_list2}"/>
        <hr>
        <form:radiobuttons path="a12" items="${requestScope.data_list3}"/>

    </form:form>
</body>
</html>
