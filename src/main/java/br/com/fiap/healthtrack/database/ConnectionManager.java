package br.com.fiap.healthtrack.database;

import java.sql.Connection;

public interface ConnectionManager {

	public Connection getConnection();
	public void closeConnection();
	
}
