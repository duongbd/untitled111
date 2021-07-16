<%--
  Created by IntelliJ IDEA.
  User: Black Diamond
  Date: 7/16/2021
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Success</title>
</head>
<body>
<h3>List Condiments:</h3>
<ol>
    <c:forEach var="emp" items="${list}">

        <li>${emp}</li>

    </c:forEach>
</ol>
</body>
</html>
