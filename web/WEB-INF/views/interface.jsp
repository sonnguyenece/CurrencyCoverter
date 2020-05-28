<%--
  Created by IntelliJ IDEA.
  User: sonnguyen
  Date: 5/28/2020
  Time: 4:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Currency Converter</h1>
<form action="/result" method="post">
    <p>USD</p>
    <input type="text" name="usd" value="${input}">
    <p>Result</p>
    <input type="text" name="result" value="${result}">
    <br>
    <br>
    <input type="submit">
</form>


</body>
</html>
