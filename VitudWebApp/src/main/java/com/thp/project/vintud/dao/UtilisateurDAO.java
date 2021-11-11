package com.thp.project.vintud.dao;

import java.sql.SQLException;
import java.util.List;

import com.thp.project.vintud.entity.Announcement;
import com.thp.project.vintud.entity.User;

public interface UtilisateurDAO {

	public abstract void addUser(User U) throws SQLException;
	public abstract void seConnecter (User U) throws SQLException;
	public abstract void ModifUser(User U) throws SQLException; 
	public abstract List<User> afficherVendeur(Announcement A) throws SQLException;
	
	
	
	
}
