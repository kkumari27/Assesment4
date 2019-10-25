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

import com.form.DetailModel;
import com.form.ConnectionManager;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
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
		MongoCollection<Document> collection = db.getCollection("details");

		MongoCursor<Document> cursor = collection.find().iterator();

		List<DetailModel> deets = new LinkedList<>();
		while (cursor.hasNext()) {
			Document d = (Document) cursor.next();

			DetailModel dy = new DetailModel(d.getString("title"), d.getString("city"), d.getString("pc"),
					d.getString("description"),d.getString("email"),d.getString("phonenumber"),d.getString("extension"),
					d.getString("contactname"));
			deets.add(dy);
			//System.out.println(dy.getAuthor());
		}

		// ConnectionManager.close();

		request.setAttribute("list", deets);
		request.getRequestDispatcher("form.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String title = request.getParameter("title");
		//System.out.println(name + " Name");
		String city = request.getParameter("city");
		String pc= request.getParameter("pc");
		String description = request.getParameter("description");
		String email = request.getParameter("email");
		String phonenumber = request.getParameter("phonenumber");
		String extension = request.getParameter("extension");
		String contactname = request.getParameter("contactname");
		
		
		
		MongoClient connection = ConnectionManager.getMongo();

		MongoDatabase db = ConnectionManager.getDb("Ad");
		MongoCollection<Document> collection = db.getCollection("details");

		Document d1 = new Document("title", title).append("city", city).append("pc", pc).append("description", description)
				.append("email",email).append("phonenumber", phonenumber).append("extension", extension).append("contactname", contactname);
		System.out.println("inside add if");
		collection.insertOne(d1);
		MongoCursor<Document> cursor = collection.find().iterator();

		List<DetailModel> deets = new LinkedList<>();
		while (cursor.hasNext()) {
			Document d = (Document) cursor.next();
			DetailModel dy = new DetailModel(d.getString("title"), d.getString("city"), d.getString("pc"),
					d.getString("description"),d.getString("email"),d.getString("phonenumber"),d.getString("extension"),
					d.getString("contactname"));
			deets.add(dy);
			
		}

		// ConnectionManager.close();

		request.setAttribute("list", deets);
		request.getRequestDispatcher("form.jsp").forward(request, response);
		//doGet(request, response);
	}

}
