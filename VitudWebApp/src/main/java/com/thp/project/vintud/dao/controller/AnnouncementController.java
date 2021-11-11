package com.thp.project.vintud.dao.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.thp.project.vintud.dao.AnnonceDAO;
import com.thp.project.vintud.dao.factory.FactoryDAO;
import com.thp.project.vintud.entity.Announcement;

public class AnnouncementController {
	AnnonceDAO annonceDao = FactoryDAO.getAnnonceDAO();
	
	public AnnouncementController() {
		
	}
	
	public ArrayList<Announcement> getAnnonces()  {
		return annonceDao.afficherAnnonces();
		
	}

}
