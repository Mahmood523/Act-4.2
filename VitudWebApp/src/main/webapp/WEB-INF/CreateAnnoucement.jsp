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
     <tr>
     <td><label for="title">Titre : </label></td> 
     <td><input type="text" name ="title" id ="title"></td>
     </tr> 
  </section>
  
  <section>
     <tr>   
     <td><label for="description">Description : </label></td> 
     <td><input type="text" name ="description" id ="description"></td>
     </tr>
  </section>
  
  <section class="categories">
     <label for="category">Categorie :</label>
     <select name="category" id="category">  
     <option value="client"> Client </option> 
     <option value="admin"> Administrateur </option> 
     </select>
     </section>
  
  <section>   
     <label for="price">Prix :  </label> 
     <input type="number" name ="price" id ="price">
  </section>
  
  <section>   
     <label for="localisation">Localisation : : </label> 
     <input type="text" name ="localisation" id ="localisation">
  </section>
</body>
</html>