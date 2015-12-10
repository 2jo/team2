<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp" %>

      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
          조회 게시판 입니다
            <small>Control panel</small>
          </h1>
          
          <br>제목: ${VO.title}
          <br>작성자: ${VO.writer}
          <br>내용: ${VO.content}
          
          <a href="/board/delete?bno=${VO.bno}"><input type="submit" value="삭제"></a>
          <a href="/board/update?bno=${VO.bno}"><input type="submit" value="수정"></a>
          
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