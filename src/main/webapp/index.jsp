<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="<%=request.getContextPath()%>/hello/hello.do">
	하이염ㅋ
	</a>
	<br>
	<a href="<%=request.getContextPath()%>/method/method.do">
	메쏘드
	</a>
	<br>
	<a href="<%=request.getContextPath()%>/form/joinForm.do">
	가입폼ㅋ
	</a>
	<br>
	<br>
	<a href="<%=request.getContextPath()%>/ajax/resBody.do">
	문자열 응답
	</a>
	<br>
	<a href="<%=request.getContextPath()%>/ajax/resVOBody.json">
	JSON VO 응답
	</a>
	<br>
	<a href="<%=request.getContextPath()%>/ajax/resStringListBody.json">
	JSON List(문자열) 응답
	</a>
	<br>
	<a href="<%=request.getContextPath()%>/ajax/resVOListBody.json">
	JSON List(VO) 응답
	</a>
	<br>
	<a href="<%=request.getContextPath()%>/file/uploadForm.do">
	파일업로드
	</a>
	
	
</body>
</html>