<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/method/method.do"
		method="POST">
		<input type="submit" value="호출" />
	</form>
</body>
</html>
