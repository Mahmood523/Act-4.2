<%@page import="com.thp.project.vintud.entity.Announcement"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Announcements</title>
</head>
<body>
     <%@ include file="Header.jsp" %>
     <table border='1' width='100%'>
       <thead>
         <tr>
           <th scope="col">Titre</th>
           <th scope="col">Description</th>
           <th scope="col">Categorie</th>
           <th scope="col">Prix</th>
           <th scope="col">Localisation</th>
         </tr>
       </thead>
       <%
       ArrayList<Announcement> annonces = (ArrayList<Announcement>)request.getAttribute("ListAnnonces");
       
       for (Announcement an:annonces){
    	   
  
    	   
    	   out.print("<tr> <th>"+an.getTitle()+"</th><th>"+an.getDescription()+"</th><th>"+an.getCategory_id()+"</th><th>"+an.getPrice()+"</th><th>"+an.getLocalisation()+"</th></tr>");
       }
       %>
     </table>

</body>
</html>