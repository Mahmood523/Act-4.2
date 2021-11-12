package com.thp.project.vintud.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.thp.project.vintud.entity.Announcement;



public interface AnnonceDAO {
	
	public abstract ArrayList<Announcement> afficherAnnonces();
	public abstract void addAnnonce(Announcement A) ;
	public abstract void DeleteAnnoce(Announcement A) throws SQLException;
	public abstract void ModifAnnonce(Announcement A) throws SQLException;
	
	

}
