package com.thp.project.vintud.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {

	private static ConnectionManager instance;
	private static String url = "jdbc:postgresql://localhost:5432/vintud";
    private static String driverName = "org.postgresql.Driver";
    private static String username = "postgres";
    private static String password = "RaMa53861!?#";
    private static Connection con;
	
	
    
    
    
    
    public Connection getConnection()  {
		try {
			Class.forName(driverName);
			if (con==null) {
			try {
                con = DriverManager.getConnection(url,username, password);
			} 
			 catch (SQLException ex) {
 
                System.out.println("Failed to create the database connection.");
            }
			}
			}
		 catch (ClassNotFoundException e) {
            System.out.println("Driver not found.");
			e.printStackTrace();
		
		 }
		return con;
	
	}		
	
	public static ConnectionManager getInstance()  {
		
		if(instance==null) {
			instance = new ConnectionManager();
		}
		return instance;
	}
	
	
	
	

	

}
