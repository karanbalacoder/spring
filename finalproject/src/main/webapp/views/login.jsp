<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="emp"  modelAttribute="employee">
 Eno:<form:input path="eno"/>
<form:errors path="eno"/><br>

 Name:<form:input path="name"/>
<form:errors path="name"/><br>

 Salary:<form:input path="salary"/>
<form:errors path="salary"/><br>

<button>submit</button>
</form:form>

</body>
</html>