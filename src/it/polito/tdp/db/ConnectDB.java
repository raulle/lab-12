package it.polito.tdp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	
	static private final String jdbcUrl = "jdbc:mysql://localhost/rivers?user=root&password=chiaretta<3";
	static private ConnectDB instance = null;

	private ConnectDB() {
		instance = this;
	}

	public static ConnectDB getInstance() {
		if (instance == null)
			return new ConnectDB();
		else {
			return instance;
		}
	}

	public Connection getConnection() {
		try {
			
			Connection conn = DriverManager.getConnection(jdbcUrl);
			return conn;
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Errore di connessione al database");
		}
	}

}
