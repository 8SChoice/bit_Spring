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
	<h1>회원정보</h1>
	id : ${ memberVO.id }<br>
	password: ${ memberVO.password }<br>
	name : ${ memberVO.name }<br>
</body>
</html>