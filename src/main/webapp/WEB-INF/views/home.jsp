<%--
  Created by IntelliJ IDEA.
  User: Black Diamond
  Date: 7/16/2021
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<h3 style="color: red">${message}</h3>
<form>
    <input type="text"  name="number1" placeholder="0" value=${number1}>
    <input type="text"  name="number2" placeholder="0" value=${number2}>
    <br> <br>
    <input type="submit" value="+" formaction="/add" formmethod="post" >
    <input type="submit" value="-" formaction="/sub" formmethod="post" >
    <input type="submit" value="*" formaction="/mul" formmethod="post" >
    <input type="submit" value="/" formaction="/div" formmethod="post" >
</form>
<h3>Result: </h3><p>${result}</p>
</body>
</html>
