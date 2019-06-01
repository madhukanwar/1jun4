<%@ page language="java" contentType="text/html" %>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
    <%@ taglib uri="http://springframework.org/form/" prefix="f" %>
 --%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet"  href="/mvc/mystyle.css"/>
</head>
<body>

        <%= "you can write any text message"%>
        <%! int i=10; %>

        <form action="demo.jsp">
            <input type="text" name="name">
            <input type="submit" value="Submit">
        </form>

        <h1>index.jsp</h1>

        <h1>${welcome_msg}</h1>

        <c:forEach var="ob" items="${lst}">
            <h1>${ob}</h1>
        </c:forEach>

</body>
</html>