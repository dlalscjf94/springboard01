<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>글수정</title>
</head>
<body>
글수정 페이지 
<form action = "modify" method = "post">
	<body>
	
	<p> <label>글번호</label>
	<input type="text" name = "bno" value = "${boardVO.bno}" readonly = "readonly"></p>
	<p> <label>제목</label>
	<input type="text" name = "title" value = "${boardVO.title}" ></p>
	<p> <label>작성자</label>
	<input type="text" name = "writer" value = "${boardVO.title}" readonly = "readonly"></p>
	<p> <label>내용</label> 
	<textarea name=content rows = "10" cols = "70" style = "background-color:#B0E0E6;"> ${boardVO.content}</textarea> <br>
	
	<button type = "submit"> 수정 완료 </button>
	
	</body>

</form>


</body>
</html>