package com.thp.project.vintud.dao;

import java.sql.SQLException;

import com.thp.project.vintud.entity.Announcement;

public interface FavorisDAO {
	
	public abstract void addAnnonce(Announcement A) throws SQLException;
	public abstract void DeleteAnnoce(Announcement A) throws SQLException;
	
	public abstract void ModifAnnonce(Announcement A) throws SQLException;

}
