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
     <h1> Ajouter une annonce</h1>
     <form action="CreateAnnouncement" method="post" >
     <table>
     
     <tr>
     <td>Titre :</td> 
     <td><input type="text" name ="title" ></td>
     </tr> 
  
  
  
     <tr>   
     <td><label for="description">Description : </label></td> 
     <td><input type="text" name ="description" ></td>
     </tr>
  
  
  
     <tr><td>Categorie :</td>
     <td>
     <select name="category" >  
     <option value=""></option>
     <option value="T-SHIRT"> T-SHIRT </option> 
     <option value="Pantalon"> Pantalon </option>
     <option value="Veste"> Veste </option> 
     </select>
     </td>
     </tr>
     
  
     <tr>
     <td><label for="price">Prix :  </label></td> 
     <td><input type="number" name ="price" ></td>
     </tr>
  
     <tr>
     <td><label for="localisation">Localisation :  </label></td> 
     <td><input type="text" name ="localisation" ></td>
     </tr>
     <tr><td></td><td colspan="2"><input type="submit" value="Ajouter"/></td></tr>
     </table>
     </form>
</body>
</html>