package myFormController;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DBConnection;

@WebServlet("/MyFormController")
public class MyFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyFormController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	try {	
		Connection connection = DBConnection.getConnection();
		if (connection != null) {
			// Debug
			System.out.println("Connection: " + connection.toString());
			String username = "";
			String password = "";
			username = request.getParameter("username");
			password = request.getParameter("password");
			
			String Registreer = "INSERT INTO `users` (`userid`, `username`, `password`) VALUES (NULL, '" + username + "', '"+ password +"')";
			Statement statement = connection.createStatement();
			statement.executeUpdate(Registreer);
			System.out.println("Nieuw account is aangemaakt");
		}
	} catch (SQLException e) {
		e.printStackTrace();
		
	}finally{ 
		
	}
}
}
//Made by Jurgen en Chiel//



