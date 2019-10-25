package com.form;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

import com.form.Rep;
import com.form.ConnectionManager;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/ReplyServlet")
public class RepServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RepServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MongoClient connection = ConnectionManager.getMongo();

		MongoDatabase db = ConnectionManager.getDb("Ad");
		MongoCollection<Document> collection = db.getCollection("replies");

		MongoCursor<Document> cursor = collection.find().iterator();

		List<Rep> reps = new LinkedList<>();
		while (cursor.hasNext()) {
			Document d2 = (Document) cursor.next();

			Rep  dy = new Rep(d2.getString("username"), d2.getString("email1"), d2.getString("phone"));
			reps.add(dy);
			//System.out.println(dy.getAuthor());
		}

		// ConnectionManager.close();

		request.setAttribute("list", reps);
		request.getRequestDispatcher("Reply.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//String pc= request.getParameter("pc");
		String username = request.getParameter("username");
		String email1 = request.getParameter("email1");
		String phone = request.getParameter("phone");
		
		
	
		MongoClient connection = ConnectionManager.getMongo();

		MongoDatabase db = ConnectionManager.getDb("Ad");
		MongoCollection<Document> collection = db.getCollection("replies");

		Document d2 = new Document("username", username).append("email", email1).append("phone", phone);
	//	System.out.println("inside add if");
		collection.insertOne(d2);
		MongoCursor<Document> cursor = collection.find().iterator();

		List<Rep> reps = new LinkedList<>();
		while (cursor.hasNext()) {
			Document d3 = (Document) cursor.next();

			Rep  dy = new Rep(d2.getString("username"), d2.getString("email1"), d2.getString("phone"));
			reps.add(dy);
			
		}

	
	
	request.setAttribute("list", reps);
	request.getRequestDispatcher("Reply.jsp").forward(request, response);
	
}
}