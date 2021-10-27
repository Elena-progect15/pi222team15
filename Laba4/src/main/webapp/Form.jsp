<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Калькулятор</title>
</head>
<body>
<h1 align="center">Расчёт периметра прямоугольника</h1>
<hr>
    <p align="center">
        <font size="5">Введите данные для расчёта:</font></p>
    <form action="${pageContext.request.contextPath}/JavaCalc" method="post">
        <p align="center">
        <label for="first">Длина (a):</label>
        <input type="text" name="first" id="first" value="${first}" onkeyup="this.value = this.value.replace(/[^0-9\.\,]/g,'');">
        </p>
		<p align="center"></p>
		<div align="center">
        <dt></dt></dt><label for="second">Ширина (b): </label>
		<input type="text" name="second" id="second" value="${second}" onkeyup="this.value = this.value.replace(/[^0-9\.\,]/g,'');">
        </div>
		<div align="center">
        <dd>
		<p align="center"></dd>
        </div>
		<div align="center">
			<dd>
			<p align="center"></dd>
		</div>
		<div align="center">
        <dt></dt><input type="submit" name="sign" value="Calculate"></div>
        </form>
        </body>
        <div style="border-style: solid; border-width: 1px; padding-left: 4px; padding-right: 4px; padding-top: 1px; padding-bottom: 1px">
        <p align="center"><font size="5">Формула для расчета </font> </p>
<p align="center"><a href="https://ibb.co/5GzFnRY">
<img src="https://i.ibb.co/4KDdYVs/23.jpg" alt="23" border="0" width="302" height="226"></a>
</p>
</div>

</html>