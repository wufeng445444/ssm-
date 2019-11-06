<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib  uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/student/saveInfo" method="post">
		<c:if test="${!empty student }">
		<input type="hidden" name="_method" value="put">
		<input type="hidden" name="sid" value="${student.sid }">
		</c:if>

	姓名:<input type="text" name="sname" value="${student.sname }"><br/>
	性别:
	<c:if test="${empty student }">
	<input type="radio" name="gender" value="1" >男
		<input type="radio" name="gender" value="0">女<br/>
	</c:if>
		<c:if test="${student.gender==true }">
		<input type="radio" name="gender" value="1" checked="checked">男
		<input type="radio" name="gender" value="0">女<br/>
		</c:if>
		<c:if test="${student.gender==false }">
		<input type="radio" name="gender" value="1" >男
		<input type="radio" name="gender" value="0" checked="checked">女<br/>
		</c:if>
		
	爱好:<input type="checkbox" name="hobby" value="唱歌" <c:if test="${student.hobby.contains('唱歌') }">checked</c:if>>唱歌
		<input type="checkbox" name="hobby" value="跳舞" <c:if test="${student.hobby.contains('跳舞') }">checked</c:if>>跳舞
		<input type="checkbox" name="hobby" value="rap" <c:if test="${student.hobby.contains('rap') }">checked</c:if>>rap
		<input type="checkbox" name="hobby" value="篮球" <c:if test="${student.hobby.contains('篮球') }">checked</c:if>>篮球<br/>
	简介：<textarea rows="5" cols="5" name="mark">${student.mark }</textarea><br/>
	<input type="submit" value="提交">

</form>
</body>
</html>