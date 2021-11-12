package com.thp.project.vintud.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.thp.project.vintud.dao.controller.AnnouncementController;
import com.thp.project.vintud.entity.Announcement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/AfficheAnnouncements")
public class AfficheAnnouncements extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public AfficheAnnouncements() {
    	super();
    }
     
    AnnouncementController annonceController = new AnnouncementController();
    ArrayList<Announcement> annonces = annonceController.getAnnonces();
    
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
	    request.setAttribute("ListAnnonces", annonces);
	    
		this.getServletContext().getRequestDispatcher("/WEB-INF/Announcements.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
