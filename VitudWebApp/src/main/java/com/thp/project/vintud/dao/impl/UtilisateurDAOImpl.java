package com.thp.project.vintud.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.thp.project.vintud.dao.UtilisateurDAO;
import com.thp.project.vintud.dao.factory.FactoryDAO;
import com.thp.project.vintud.entity.Announcement;
import com.thp.project.vintud.entity.User;



public class UtilisateurDAOImpl implements UtilisateurDAO {

	static Connection con = FactoryDAO.connect();
	static ResultSet resultats = null;
    static String requete = "";
    ResultSetMetaData rsmd;
    
    
    
	private static void arret(String message) {
        System.err.println(message);
        System.exit(99);
     }
    
    private static void affiche(String message) {
        System.out.println(message);
     }
	
	@Override
   public  void addUser(User U) throws SQLException{
    	
    	
    
    	
    	try {
    		String requete= "INSERT INTO vintud.user VALUES (?,?,?,?,?,?,?,?,? );";
    		PreparedStatement pr_stmt = con.prepareStatement(requete);
	        pr_stmt.setInt(1,U.getId() );
	        pr_stmt.setString(2,U.getFirstname());
	        pr_stmt.setString(3, U.getName());
	        pr_stmt.setString(4, U.getPseudo());
	        pr_stmt.setString(5, U.getMail());
	        pr_stmt.setString(6, U.getU_password());
	        pr_stmt.setString(7, U.getPhone());
	        pr_stmt.setString(8, U.getAddress());
	        pr_stmt.setInt(9, U.getRole_id());
	        
	        pr_stmt.executeUpdate();
	         System.out.println("User ajouté avec succés");
	         
			} catch (SQLException e) {
				arret("Anomalie lors de l'execution de la requête") ;
			}
		
	      System.exit(0);
    		   		  	
    }
   
   @Override
   public void seConnecter (User U) throws SQLException{
   	
	    
	    	boolean repeter = true;
	    	while (repeter) {
	    	
	    	try {
	    	String requete = "SELECT * FROM vintud.user WHERE u_password = ?  AND mail = ? ; ";	
	    	PreparedStatement pr_stmt = con.prepareStatement(requete);
	    	pr_stmt.setString(1,U.getU_password() );
	    	pr_stmt.setString(2,U.getMail());
	    	resultats =pr_stmt.executeQuery(); 
			boolean encore = resultats.next();
			
			if (encore) 
			{	  
	         
				System.out.println("Connexion avec succes");
	            repeter = false;
	  
	          }
			else {
				System.out.println(("Connexion echouee"));
			    repeter=false;
			}
			resultats.close();
			} catch (SQLException e ){
				e.printStackTrace();
						
			}
	    }
	    }
   
   @Override
   public void ModifUser(User U) throws SQLException {
		
		try {
		String requete = "UPDATE vintud.user SET firstname =? where id =? ;";	
		PreparedStatement pr_stmt = con.prepareStatement(requete);
		pr_stmt.setString(1,U.getFirstname() );
		pr_stmt.setInt(2,U.getId());
			
		int resultat = pr_stmt.executeUpdate();

		if (resultat>0)
		{
		System.out.println("Mise a jour de user avec succes ");
		}
		con.close();
		}
		catch (SQLException e)
		{
			arret("Anomalie lors de l'execution de la requête");
		
		}
		}
   @Override
   public List<User> afficherVendeur(Announcement A) throws SQLException {

   	
      List<User> vendeur =new ArrayList<>();
   	try {
   	String requete = "select * from vintud.announcement , vintud.user WHERE id = ? ;";
   	PreparedStatement pr_stmt = con.prepareStatement(requete);
   	pr_stmt.setInt(1, A.getUser_id());
   	resultats = pr_stmt.executeQuery(requete);
   	
   	System.out.println("Affichage du vendeur :"+ " \n");
   	User U = new User(); 
   	while(resultats.next()) {
    U.setId(resultats.getInt(1));
    U.setFirstname(resultats.getString(2));
    U.setName(resultats.getString(3));
    U.setPseudo(resultats.getString(4));
    U.setMail(resultats.getString(5));
    U.setPhone(resultats.getString(7));
    U.setAddress(resultats.getString(8));
    
    vendeur.add(U);
    
   	}
   	
   	
	
   	resultats.close();


   	} catch (SQLException e) {

   		arret("Anomalie lors de l'execution de la requête");
   	}
   	return vendeur;
   	}
   
   
   
   
   
   
   
   
}
