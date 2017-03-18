<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="add.do" modelAttribute="calcbean">
		<p>Provide a number</p>
		<form:input type="number" path="firstVal" />
		<form:errors path="firstVal" />
		</br>
		<p>Provide a number</p>
		<form:input type="number" path="secondVal" />
		<form:errors path="secondVal" />
</br>
		<input type="submit" value="Add" name="add" />


	</form:form>
	<c:if test="${not empty result}">
		<p>Result is: ${result}</p>
	</c:if>
</body>
</html>