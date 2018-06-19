<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.myin.team25.domain.*" %>

<%@include file="../include/header.jsp" %>
<%
	String smemberId = "";	
    if (session.getAttribute("sMemberId") != null) {
	smemberId = (String)session.getAttribute("sMemberId");
    }    
%> 

<script type="text/javascript">
$(function(){		
		$.boardList(1); 
		
		$("#pageNavi").on("click","li a",function(event){
			
			event.preventDefault();
			
			page = $(this).attr("href");
			alert(page+"페이지 입니다.");
			
			$.boardList(page); 
			
		});
		
});

$.boardList = function(page){
	
	$.ajax({
		type : "GET",
		url  : "/BoardListAjaxController/"+page,
		datatype : "text",
		cache : false,
		error : function(){				
			alert("error");
		},
		success : function(data){
			if (data == null){
				alert("Empty DATA");
			}			
			boardList(data.alist);			
			
			pageNavigation(data.pm);
			}			
	});	 	
}

function boardList(data){
	
	var str = '';
	
	$(data).each(function(){		
		
		str += "<tr style='text-align:center;'>"
		 	+ "<td>"+this.bbidx+"</td>"
			+ "<td width='50%'>"+this.subject+"</td>" 
			+ "<td>"+this.writer+"</td>"
         	+ "<td>"+this.writeday+"</td>" 
		 	+ "</tr>";					
	});
	
	$('#tbl').html("<table border='1' width='100%' style='text-align:center;'>"
				 + "<tr style='text-align:center;background-color:green;'>"
	 			 + "<td>글번호</td>"
	 			 + "<td width='50%'>제목</td>" 
	 			 + "<td>작성자</td>"
	             + "<td>작성일</td>" 
	   		 	 + "</tr>" 
	 			 + str
	 			 + "</table>");				

}

function pageNavigation(data){	

	var str="";
	var prev="";
	var next="";
	var list="";
	
	if (data.prev == true) {
	prevli = "<a href='"+data.startPage-1+"'>" 			
		 + "<span class='glyphicon glyphicon-chevron-left'></span>"
 		 + "</a>"; 
	}else{
		prevli = "";
	}
	
	if (data.next = true){
		for(var i= data.startPage; i<data.endPage; i++){
		list +="<li>"   
        	 + "<a href='"+i+"'>"+i+"</a>"
        	 + "</li>"			 
		}			
	}
	
	if (data.next && data.endPage > 0) { 
	nextli = "<a href='"+data.endPage+1+"'>"
	 	+  "<span class='glyphicon glyphicon-chevron-right'></span>"
		+  "</a>"
	}else{
	   nextli = "";
	} 	
	
	str = "<div style='text-align:center;'>"
	 	+ "<div class='jb-center'>"
		+ "<ul class='pagination'>"
		+ "<li>"
		+ prevli		
		+ "</li>"
		+ list
		+ "<li>"
		+ nextli
		+ "</li>"
		+ "</ul>"
	 	+ "</div>"
		+ "</div>";	
		
		$("#pageNavi").html(str);
}
</script>
 
<div id="tbl"></div>  

<div id="pageNavi"></div>

<%@include file="../include/footer.jsp" %>