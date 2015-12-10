<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>

<select id="searchType">
    <option value="n">---</option>
    <option value="t">제 목</option>
    <option value="c">내 용</option>
    <option value="w">작성자</option>
    <option value="tc">제목+내용</option>
    <option value="tw">제목+작성자</option>
</select>
<input id="keyword" type="text" name="keyword">

<ul class="pagination" id="pageUL">

</ul>

<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="pageMaker.js"></script>
<script>

    $(document).ready(function(){
        var cri = {
            pageNo:12,
            totalCount : 320,
            perPage : 10,
            searchType : 'w',
            keyword : "홍길동"
        };

        $("#pageUL").html(makePage(cri));

        $("#pageUL").on("click","li a", function(event){
            event.preventDefault();
            var targetPage = $(this).attr("href");

            console.log(targetPage);
        });

        var options = $("#searchType option")

        console.log(options.size());

        console.log($("#searchType option[value="+cri.searchType+" ]"));

        $("#searchType option[value="+cri.searchType+" ]").attr("selected","true");
        $("#keyword").val(cri.keyword);
    });


</script>
</body>

</html>