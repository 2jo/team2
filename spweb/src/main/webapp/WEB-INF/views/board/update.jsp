<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp" %>

      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
           수정 게시판 입니다.
            <small>Control panel</small>
          </h1>
          
          <form action="/board/update" method="post">
          <input type="hidden" name="bno" value="${VO.bno}">
          <p> 제목 <input type="text" name="title" value="${VO.title}"></p>
          <p> 내용 <input type="text" name="content" value="${VO.content}"></p>
          <p> 글쓴이 <input type="text" name="writer" disabled="disabled" value="${VO.writer}"></p>
          <p><input type="submit" value="수정완료"></p>
          </form>
          
          <a href="/board/view?bno=${VO.bno}"><input type="submit" value="취소"></a>
          
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