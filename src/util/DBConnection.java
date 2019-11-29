package util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBConnection {
	private static Logger LOGGER = Logger.getLogger(DBConnection.class.getName());
	private static DataSource dataSource;
	
	
	public static Connection getConnection() {
		if (dataSource == null) {
			try {
				Context initContext = new InitialContext();
				dataSource = (DataSource) initContext.lookup("java:/comp/env/java");
			} catch (NamingException e) {
				LOGGER.log(Level.WARNING, "Error while retrieving application context: " + e.getMessage());
			}
		}
		
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			LOGGER.log(Level.WARNING, "Error while connection to database: " + e.getMessage());
		}
		return null;
	}

}
// Made by Chiel //
