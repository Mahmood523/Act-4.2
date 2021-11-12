package com.thp.project.vintud.web.servlet;

import java.io.IOException;

import com.thp.project.vintud.entity.Announcement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/CreateAnnouncement")
public class CreateAnnouncement extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public CreateAnnouncement() {
    	super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/CreateAnnoucement.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String titre = request.getParameter("title");
		String description = request.getParameter("description");
		String categorie = request.getParameter("category");
		String prix = request.getParameter("price");
		String localisation = request.getParameter("localisation");
		
		Announcement annonce = new Announcement();
		annonce.setTitle(titre);
		annonce.setDescription(description);
		
		annonce.setPrice(Float.parseFloat(prix));
		annonce.setLocalisation(localisation);
		
	}

}
