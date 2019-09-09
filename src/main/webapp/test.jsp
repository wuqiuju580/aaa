<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
function testutil() {
	$.post("testutil.do",$("form").serialize(),function(data){
		if (data==0) {
			alert("不能为空")
		} else {
			alert("验证成功")
		}
	},"json")
}
</script>
</head>
<body>
<form action="#">
内容:<textarea rows="10" cols="10" name="test"></textarea><br>
电话号码:<input type="text" name="phone"><br>
邮箱:<input type="text" name="email"><br>
<input type="button" value="验证" onclick="testutil()">
</form>
</body>
</html>