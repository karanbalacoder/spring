<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"   isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="item" items="${list}" >
<c:out value="${item.eno }"></c:out><br>
<c:out value="${item.name }"></c:out><br>
<c:out value="${item.salary }"></c:out>
</c:forEach>
</body>
</html>