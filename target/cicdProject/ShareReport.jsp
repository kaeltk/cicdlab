<%@page import="com.org.model.ShareVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<h1 align="center"> List Of Share Details</h1> <br>
<% List<ShareVO> shareList= (List<ShareVO>)request.getAttribute("shareList"); %>
 <table align="center" border="2">
  <tr>
   <th>Company </th>
   <th>Bonus Ratio</th>
    <th>Announcement date</th>
     <th>Extra Bonus Date</th>
 </tr>
<% for (ShareVO  share : shareList)
{
	
   
     out.println("<tr><td> "+share.getCompanyName()+"</td><td>"+share.getBonusRatio()+"</td><td>"+share.getAnnouncementDate()+"</td><td>"+share.getExBonusDate()+"</td><td></tr>");
   
}
   
    %>
 </table>
</body>
</html>