<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Landing</title>
</head>
<body>
	<h1>Danh sach class</h1>
	
	<a href="/UI_test11/lop/add">Them moi</a>
	<table>
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Block</td>
			<td>Type</td>
			<td>Action</td>
		</tr>

		<c:forEach items="${list}" var="lop">

			<tr>
				<td>${lop.id}</td>
				<td>${lop.name}</td>
				<td>${lop.block}</td>
				<td>${lop.type}</td>
					<td>
						<a href="/UI_test11/lop/update/${lop.id}">Update</a> |
								
							<a href="/UI_test11/lop/delete/${lop.id}">Delete</a>
					
					
					</td>

			</tr>
		</c:forEach>

	</table>
</body>
</html>