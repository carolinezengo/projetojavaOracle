package com.javaodbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class AcessoBanco {
	public static void main(String[] args) throws Exception{
		
		String sql = "SELECT codigo, nome, sexo from Pessoa";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try (
			Connection con = DriverManager.getConnection(url, "curso", "curso1234");
		
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery())
				{
			

				while(rs.next()) {
					System.out.println(rs.getString("nome"));
					
				}
			}
		
	}

}
