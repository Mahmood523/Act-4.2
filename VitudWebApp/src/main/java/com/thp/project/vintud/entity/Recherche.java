package com.thp.project.vintud.entity;

import com.thp.project.vintud.entity.impl.RechercheImpl;

public class Recherche implements RechercheImpl {
	
	private int id;
	private String couleur;
	private String taille;
	private String type_habit;
	private float prix;
	private int user_id;
	
	
	
	
	
	public Recherche() {
	
	}





	public Recherche(int id, String couleur, String taille, String type_habit, float prix, int user_id) {
		
		this.id = id;
		this.couleur = couleur;
		this.taille = taille;
		this.type_habit = type_habit;
		this.prix = prix;
		this.user_id = user_id;
		
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getCouleur() {
		return couleur;
	}





	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}





	public String getTaille() {
		return taille;
	}





	public void setTaille(String taille) {
		this.taille = taille;
	}





	public String getType_habit() {
		return type_habit;
	}





	public void setType_habit(String type_habit) {
		this.type_habit = type_habit;
	}





	public double getPrix() {
		return prix;
	}





	public void setPrix(float prix) {
		this.prix = prix;
	}





	public int getUser_id() {
		return user_id;
	}





	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
	
	
	
	

}
