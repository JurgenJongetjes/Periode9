package dataAccesObject;

import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;

import util.DBConnection;

public class UserDao {
	private static Logger LOGGER = Logger.getLogger(UserDao.class.getName());
	
	public static ArrayList<String> getUsers() {
		
		// Initialiseer een Arraylist van Strings
		ArrayList<String> list = new ArrayList<String>();
		
		try {
			// Zet de database connectie op
			Connection connection = DBConnection.getConnection();
			
			//Bereid de query voor en voer deze uit.
			String query = "SELECT * FROM users";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			// Voeg de resultaten toe aan de ArrayList
			while (resultSet.next()) {
				list.add(resultSet.getString("username"));
			}
			
			// Vergeet je logmeldingen niet...
			LOGGER.log(Level.INFO, "Retrieved " + list.size() + " users drom database.");
			
		} catch (SQLException e) {
			// En handel excepties netjes af
			LOGGER.log(Level.WARNING, "Error while retrieving " + " users: " + e.getMessage());
		}
		return list;
	}
}
