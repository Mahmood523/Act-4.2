<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Announcement</title>
</head>
<body>
     <%@ include file="Header.jsp" %>
  <section>   
     <label for="title">Titre : </label> 
     <input type="text" name ="title" id ="title">
  </section>
  
  <section>   
     <label for="description">Description : </label> 
     <input type="text" name ="description" id ="description">
  </section>
  
  <section class="categories">
     <span>Categorie :</span>   
     <label for="client"> Client </label> 
     <input type="checkbox" name ="client" id ="client">
     <label for="admin"> Administrateur </label> 
     <input type="checkbox" name ="admin" id ="admin">
  </section>
  
  <section>   
     <label for="price">Prix : : </label> 
     <input type="number" name ="price" id ="price">
  </section>
  
  <section>   
     <label for="localisation">Localisation : : </label> 
     <input type="text" name ="localisation" id ="localisation">
  </section>
</body>
</html>