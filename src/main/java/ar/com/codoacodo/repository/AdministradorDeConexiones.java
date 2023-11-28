package ar.com.codoacodo.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {
	
	public static Connection getConnection() {
		//logica para crear la conexion a la db
		
		//abrir una conexion a la db
		//java.sql.Connection > conexion fisica contra la db
		String host = "localhost";
		String username = "root";
		String password = "secret";
		String port = "33060";
		String dbName = "DB-23545";
		
		String dbUrl = "jdbc:mysql://"+host+":"+port+"/"+dbName + "?serverTimeZone=UTC&useSSL=false";
		
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try { //se ve en el avanzado!! 
			Class.forName(driver);
			return DriverManager.getConnection(dbUrl, username, password);
		} catch (Exception e) {
			throw new IllegalArgumentException("No se pudo obtener conexion: " + dbUrl + " - " + driver);
		}
	}
}
