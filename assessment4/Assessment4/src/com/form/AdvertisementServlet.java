package com.form;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

/**
 * Servlet implementation class AdServlet
 */
@WebServlet("/AdServlet")
public class AdvertisementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdvertisementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
//		 PrintWriter out = response.getWriter();
//	        HttpSession session = request.getSession();
//	        String title = (String)session.getAttribute("title");
//	        String city = (String)session.getAttribute("city");
//	        String pc = (String)session.getAttribute("pc");
//	        String email = (String)session.getAttribute("email");
//	        String phonenumber = (String)session.getAttribute("phonenumber");
//	        String extension = (String)session.getAttribute("extension");
//	        String contactname = (String)session.getAttribute("contactname");
//	        
//	        
//	        out.println(title);out.println(city);out.println(pc);out.println(email);out.println(phonenumber);out.println(extension);
//	        out.println(contactname);
	        

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
