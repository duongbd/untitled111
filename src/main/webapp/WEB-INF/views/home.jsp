<%--
  Created by IntelliJ IDEA.
  User: Black Diamond
  Date: 7/16/2021
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h3>Home</h3>
<form:form method="POST" action="/uploadFile" enctype="multipart/form-data">
    <table>
        <tr>
            <td><label>Select a file to upload</label></td>
            <td><input type="file" name="file" accept="image/jpeg,image/png"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
