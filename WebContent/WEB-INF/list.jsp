<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- ${pageContext.request.contextPath }当前项目下 -->
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.7.2.js"></script>

<script type="text/javascript">
/* 为一组元素绑定事件，相当于为这一组元素中的每一个元素绑定事件  
		id^=delete表示：这个id属性以delete开头
		获取属性值用attr
 */
$(function(){
	$("a[id^=delete]").click(function(){
		var href=$(this).attr("href");
		$("#form").attr("action",href);
		$("#form").submit();
		/* 取消了href的默认行为 */
		return false;
	});
});
</script>
</head>
<body>
<form id="form" action="" method="post">
	<input  type="hidden" name="_method" value="delete">
</form>
<table border="1px" align="center" style="width:70%" cellspacing="0px" cellpadding="10px">
	<tr>
		<th>序号</th>
		<th>姓名</th>
		<th>性别</th>
		<th>爱好</th>
		<th>简介</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${studentList }" var="student" varStatus="i">
		<tr align="center">
		<td>${i.count }</td>
		<td>${student.sname }</td>
		<td>${student.gender==true?"男":"女" }</td>
		<td>${student.hobby }</td>
		<td>${student.mark }</td>
		<td>
		<!--javascript:void（0） void是无返回值的操作，点击这个时候没有任何反应。而且如果在a标签中，
		如果href="#"，点击后会回到网页顶部，javascript:void(0)会没有任何反应   -->
			<a href="${pageContext.request.contextPath }/student/info/${student.sid}">编辑</a>
			<a id="delete-${i.count }" href="${pageContext.request.contextPath }/student/del/${student.sid}">删除</a>
		</td>
	</tr>
	</c:forEach>
	<tr align="center"> 
		<td colspan="6"><a href="${pageContext.request.contextPath }/add">添加</a></td>
	</tr>

</table>
</body>
</html>