<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="../include/header.jsp" %>

      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            작업 할 게시판 입니다.
            <small>Control panel</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Dashboard</li>
          </ol>
        </section>
		
        <!------------------------------ Main content -------------------------------->
   		<table border="1" width:100% align="center" cellpadding="10">
   		<tr>
   			<th>번 호</th>
   			<th>제 목</th>
   			<th>작성자</th>
   			<th>등록일</th>
   		</tr>
   		<c:forEach var="list" items="${list }">
   		<tr>
   			<td>${list.bno}</td>
   			<td><a href="../board/view?bno=${list.bno }">${list.title}</a></td>
   			<td>${list.writer}</td> 
   		<td><fmt:formatDate value="${list.regDate}" pattern="yy년 MM월 dd일"/></td>
   		</tr>
   		</c:forEach>
   		</table>
      </div><!-- /.content-wrapper -->
<%@include file="../include/footer.jsp" %>
<script>
</script>
  </body>
</html>