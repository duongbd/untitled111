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
<form action="/postCondiments" method="post">
    <input type="checkbox" id="condiments1" name="condiments" value="Lettuce">
    <label for="condiments1"> Lettuce</label><br>
    <input type="checkbox" id="condiments2" name="condiments" value="Tomato">
    <label for="condiments1"> Tomato</label><br>
    <input type="checkbox" id="condiments3" name="condiments" value="Mustard">
    <label for="condiments3"> Mustard</label><br>
    <input type="submit" value="submit">
</form>

</body>
</html>
