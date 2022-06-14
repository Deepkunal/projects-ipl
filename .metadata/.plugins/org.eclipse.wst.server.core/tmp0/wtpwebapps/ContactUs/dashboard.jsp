<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>Dashboard Application</title>
</head>
<body>



	<div class="row">
		<div class="container">
			<h3 class="text-center">List of Messages</h3>
			<hr>
			<div class="container text-left">

			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>fullname</th>
						<th>email</th>
						<th>Message</th>
						<th>status</th>
					</tr>
				</thead>
				<tbody>
					
					<c:forEach var="todo" items="${RequestList}">

						<tr>
							<td><c:out value="${todo.fullname}" /></td>
							<td><c:out value="${todo.email}" /></td>
							<td><c:out value="${todo.getMessage()}" /></td>
							<td><c:out value="${todo.status}" /></td>
							<td><a href="ContctUsServlet?email=<c:out value='${todo.email}' />">Edit</a></td>
						</tr>
					</c:forEach>
					
				</tbody>

			</table>
			
			
			
	
	
			
		</div>
	</div>

	
</body>
</html>