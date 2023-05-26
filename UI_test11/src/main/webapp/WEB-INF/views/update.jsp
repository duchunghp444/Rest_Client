<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="/UI_test11/lop/update" method="post">
			
				<input type="hidden"   name="id"   value=${lop.id}> <br>
				<label>Name</label> <br>
				<input type="text"   name="name"  value="${lop.name}"  > <br>
					<label>Block</label> <br>
				<input type="text"   name="block"   value="${lop.block}"  > <br>
					<label>Type</label> <br>
				<input type="text"   name="type"   value="${lop.type}"  > <br>
				<br>
				<input type="submit"   value="Them"   >
				
		
		
		
		</form>
</body>
</html>