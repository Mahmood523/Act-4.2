package com.thp.project.vintud.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.thp.project.vintud.dao.AnnonceDAO;
import com.thp.project.vintud.dao.UtilisateurDAO;
import com.thp.project.vintud.dao.factory.FactoryDAO;
import com.thp.project.vintud.entity.Announcement;



public class AnnonceDAOImpl implements AnnonceDAO {
	
	UtilisateurDAO userDAO = FactoryDAO.getUtilisateurDAO();
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
	public ArrayList<Announcement> afficherAnnonces()  {
		ArrayList<Announcement> annonces =new ArrayList<>();
	   	try {
	   	String requete = "select * from vintud.announcement ;";
	   	PreparedStatement pr_stmt = con.prepareStatement(requete);
	   	resultats = pr_stmt.executeQuery();
	   	
	   	System.out.println("Affichage des Annonces :"+ " \n");
	   	 
	   	while(resultats.next()) {
	    Announcement A = new Announcement();
	    A.setId(resultats.getInt(1));
	    A.setTitle(resultats.getString(2));
	    A.setDescription(resultats.getString(3));
	    A.setCategory_id(resultats.getInt(4));
	    A.setPrice(resultats.getDouble(5));
	    A.setPicture(resultats.getBytes(6));
	    A.setPublication_date(resultats.getDate(7));
	    A.setIs_available(resultats.getBoolean(8));
	    A.setView_number(resultats.getInt(9));
	    A.setLocalisation(resultats.getString(10));
	        
	    annonces.add(A);
	       
	   	}
	   	resultats.close();
	   	System.out.println(annonces);

	   	} catch (SQLException e) {

	   		arret("Anomalie lors de l'execution de la requête");
	   	}
	    
	   	return annonces;
}
		
		
	

	@Override
	public void addAnnonce(Announcement A) throws SQLException {
		
		try {
    		String requete= "INSERT INTO vintud.announcement VALUES (?,?,?,?,?,?,?,?,? );";
    		PreparedStatement pr_stmt = con.prepareStatement(requete);
	        pr_stmt.setInt(1,A.getId() );
	        pr_stmt.setString(2,A.getTitle());
	        pr_stmt.setString(3, A.getDescription());
	        pr_stmt.setInt(4, A.getCategory_id());
	        pr_stmt.setDouble(5, A.getPrice());
	        pr_stmt.setBytes(6, A.getPicture());
	        pr_stmt.setDate(7, A.getPublication_date());
	        pr_stmt.setBoolean(8, A.getIs_available());
	        pr_stmt.setString(9, A.getLocalisation());
	        
	        pr_stmt.executeUpdate();
	         System.out.println("Annonce ajouté avec succés");
	         
			} catch (SQLException e) {
				arret("Anomalie lors de l'execution de la requête") ;
			}
		
	      System.exit(0);
    		

		
	}

	@Override
	public void DeleteAnnoce(Announcement A) throws SQLException {
		
		
    	try {
    	String requete = "DELETE FROM vintud.announcement WHERE title= ?";
    	PreparedStatement pr_stmt = con.prepareStatement(requete);
    	pr_stmt.setString(1, A.getTitle());
    	pr_stmt.execute();
           	
    	System.out.println(" Annonce supprime ");
    	
    	con.close();
    	}
    	catch (SQLException e)
    	{
    		arret("Anomalie lors de l'execution de la requête");
    	}
		
		
	}

	@Override
	public void ModifAnnonce(Announcement A) throws SQLException {
		
		try {
			String requete = "UPDATE vintud.announcement SET title =? where id =? ;";	
			PreparedStatement pr_stmt = con.prepareStatement(requete);
			pr_stmt.setString(1,A.getTitle() );
			pr_stmt.setInt(2,A.getId());
				
			pr_stmt.executeUpdate();
			System.out.println("Mise a jour de l'annonce avec succes ");
			
			con.close();
			}
			catch (SQLException e)
			{
				arret("Anomalie lors de l'execution de la requête");
			
			}
		
		
	}
	
	

}
