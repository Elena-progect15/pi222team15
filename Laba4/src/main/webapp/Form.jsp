<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Калькулятор - расчет периметра прямоугольника</title>
</head>
<body>
<h1>Калькулятор - расчет периметра прямоугольника</h1>>
    <form action="${pageContext.request.contextPath}/JavaCalc" method="post">
        <label for="first">Сторона а:</label>
        <input type="text" name="first" id="first" value="${first}">
        <label for="second">Сторона b: </label>
        <input type="text" name="second" id="second" value="${second}">
        <input type="submit" name="sign" value="Calculate">
    </form>
    </body>
</html>