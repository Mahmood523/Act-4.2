package com.thp.project.vintud.entity;

import java.sql.Date;

import com.thp.project.vintud.entity.impl.FavorisImpl;

public class Favoris implements FavorisImpl {
	
	
	private Date dateAjout;
	private int id;
	private int annonce_id;
	private int user_id;

	public Favoris() {
		
	}

	
	
	
	

	public Date getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}



	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public int getAnnonce_id() {
		return annonce_id;
	}






	public void setAnnonce_id(int annonce_id) {
		this.annonce_id = annonce_id;
	}






	public int getUser_id() {
		return user_id;
	}






	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
	

}
