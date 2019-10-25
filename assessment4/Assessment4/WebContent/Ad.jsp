<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form method="get" action="FormServlet">
<c:forEach var="zips" items="${list}">
						<span class="border border-info">
						<table>
						<tr>
						<td>${zips.title}</td>
						<td>${zips.city}</td>
						<td>${zips.pc}</td>
						<td>${zips.description}</td>
						</tr></table>
						</span>
					</c:forEach>
					
					 <a href="http://localhost:8080/Assessment4/Reply.jsp"> <button type="submit" class="btn btn-dark">continue</a></button>
					</form>


</body>
</html>