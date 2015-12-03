<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@include file="../include/header.jsp" %>

      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1> 리스트 게시판 입니다. </h1>
	<table border="1" width: 100% align="center">
   		<tr bgcolor="#3c8dbc">
   			<th>번 호</th>
   			<th>제 목</th>
   			<th>작성자</th>
   			<th>등록일</th>
   			<th>조 회</th>
   		</tr>
   		<c:forEach var="list" items="${list}">
   		<tr>
   			<td align="center">${list.bno}</td>
   			<td><a href="/board/view?bno=${list.bno}"> ${list.title}</a></td>
   			<td align="center">${list.writer}</td> 
   			<td align="center"><fmt:formatDate value="${list.regDate}" pattern="yy년 MM월 dd일"/></td>
   			<td align="center">${list.viewCount }</td>
   		</tr>
   		</c:forEach>
   		</table>
          	<a href="/board/create"><input type="submit" value="글쓰기"></a>
          
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Dashboard</li>
          </ol>
        </section>
		</div><!-- /.content-wrapper -->
        <!------------------------------ Main content -------------------------------->
   
<%@include file="../include/footer.jsp" %>
<script>
</script>
  </body>
</html>