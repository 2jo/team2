<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp" %>

      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
           생성 게시판 입니다.
            <small>Control panel</small>
          </h1>
          <form action="/board/create" method="post">
          <p> 제목 <input type="text" name="title"></p>
          <p> 내용 <input type="text" name="content"></p>
          <p> 글쓴이 <input type="text" name="writer"></p>
          <p><input type="submit" value="등록완료"></p> 
          </form>
          
          <a href="/board/list"><input type="submit" value="취소"></a>
          
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