<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	if("${msg}"){
		alert("${msg}");
	}
</script>
</head>
<body>
	<form action="<%= request.getContextPath() %>/form/join.do" method="post">
		아이디 : <input type="text" name="id" size="20"><br>
		암호 : <input type="text" name="password" size="20"><br>
		이름 : <input type="text" name="name" size="20"><br>
		<input type="submit" value="저장">
	</form>
</body>
</html>