<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>글읽기</title>
</head>
<form>
<body>
	
	<p> <label>글번호</label>
	<input type="text" name = "bno" value = "${boardVO.bno}" readonly = "readonly"></p>
	<p> <label>제목</label>
	<input type="text" name = "title" value = "${boardVO.title}" readonly = "readonly"></p>
	<p> <label>작성자</label>
	<input type="text" name = "writer" value = "${boardVO.title}" readonly = "readonly"></p>
	<p> <label>내용</label> 
	<textarea name=content rows = "10" cols = "70" style = "background-color:#B0E0E6;"
	readonly = "readonly"> ${boardVO.content}</textarea> <br>
	
	<button type="submit" formaction="modify" frommethod="get">수정</button>
	<button type="submit" formaction="remove" frommethod="post">삭제</button>
	<button type="submit" formaction="listAll" frommethod="get">목록으로</button>
	
	
</body>
</form>
</html>