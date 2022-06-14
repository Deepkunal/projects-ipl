package com.contactUs;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.contactUs.RequestDao;


@WebServlet(asyncSupported = true, urlPatterns = { "/ContctUsServlet" })
public class ContctUsServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String Message= request.getParameter("Message");
        
        
        try 
        {
        	RequestDao sc = new RequestDao();
        	sc.insert(fullname, email, Message);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
        System.out.println("fullname.." + fullname);
        System.out.println("email.." + email);
        System.out.println("Message.." + Message);
        
      
        response.sendRedirect("contact.jsp");
        
       
        
       
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
	
		String email = request.getParameter("email");
		
		 try 
	        {
	        	RequestDao sc = new RequestDao();
	        	sc.update(email);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		 catch (SQLException e) 
		 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 response.sendRedirect("DashboardServlet");
	}

}
