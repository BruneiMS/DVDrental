package com.qintess.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao implements AutoCloseable {

	private static String url = "jdbc:postgresql://localhost:5432/dvd_rental";
	private static String banco = "postgres";
	private static String pass = "admin";
	private static Connection conn;

	public static Connection conecta() throws SQLException {
		return conn = DriverManager.getConnection(url, banco, pass);
	}

	@Override
	public void close() throws Exception {
		conn.close();	
	}

}
