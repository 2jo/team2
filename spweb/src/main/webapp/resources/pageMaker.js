/**
 * Created by Dany on 2015-12-04.
 */

function makePage(criteria){

    var startPage, endPage, prev, next;
    var str = "";

    var pageNo = criteria.pageNo;
    endPage = Math.ceil(pageNo/10.0) *10;

    startPage = endPage-9;

    var tempLast = Math.ceil(criteria.totalCount / criteria.perPage);

    endPage = tempLast < endPage ? tempLast : endPage;

    console.log(startPage,endPage,tempLast);

    prev = startPage == 1 ? false : true;
    next = tempLast > endPage ? true : false;

    if(prev){
        str +="<li><a href="+(startPage-1 ) + "> << </a></li>";
    }
    for(var i = startPage; i<= endPage; i++){
        str +="<li><a href="+i+"> "+i+" </a></li>";
    }
    if(next){
        str +="<li><a href="+(endPage +1 ) + "> >> </a></li>";
    }
    return str;

}
var cri = {
    pageNo:12,
    totalCount : 320,
    perPage : 10,
    searchType : 'w'
};
console.log(makePage(cri));