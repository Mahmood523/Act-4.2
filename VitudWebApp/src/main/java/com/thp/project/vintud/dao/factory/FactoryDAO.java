package com.thp.project.vintud.dao.factory;

import java.sql.Connection;

import com.thp.project.vintud.dao.AnnonceDAO;
import com.thp.project.vintud.dao.FavorisDAO;
import com.thp.project.vintud.dao.RechercheDAO;
import com.thp.project.vintud.dao.UtilisateurDAO;
import com.thp.project.vintud.dao.impl.AnnonceDAOImpl;
import com.thp.project.vintud.dao.impl.FavorisDAOImpl;
import com.thp.project.vintud.dao.impl.RechercheDAOImpl;
import com.thp.project.vintud.dao.impl.UtilisateurDAOImpl;
import com.thp.project.vintud.db.ConnectionManager;



public class FactoryDAO {

	
	public static AnnonceDAO getAnnonceDAO() {
		return new AnnonceDAOImpl();
	}
	
	public static UtilisateurDAO getUtilisateurDAO() {
		return new UtilisateurDAOImpl();
	}
	
	public static FavorisDAO getFavorisDAO() {
		return new FavorisDAOImpl();
	}
	
	public static RechercheDAO getRechercheDAO() {
		return new RechercheDAOImpl();
	}
	
	
	
	
	public static Connection connect () {
		return ConnectionManager.getInstance().getConnection() ;
		
	}
}
