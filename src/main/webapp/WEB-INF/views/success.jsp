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
<p>${file}</p>
<br>
<img src="<c:url value="http://127.0.0.1:8081/images/${file.originalFilename}"/>" height="300" width="300"/>
<br>
</body>
</html>
