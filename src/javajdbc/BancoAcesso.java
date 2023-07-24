package javajdbc;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;



public class BancoAcesso {
	
		
	public static void main(String[] args)
	{

		try {
		//Class.forName("oracle.jbdc.driver.OracleDriver");
		Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "050404");
	System.out.println("Conectado");
		Statement	stmt = conexao.createStatement();
			String SQL = "SELECT * FROM PESSOA";
			ResultSet rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				System.out.println("");
				System.out.println("Codigo: ");
				System.out.println(rs.getInt("CODIGO"));
				System.out.println("Nome: ");
				System.out.println(rs.getString("NOME"));
				System.out.println("Sexo: ");
				System.out.println(rs.getString("SEXO"));
			}
		rs.close();
		stmt.close();
		conexao.close();
		
		
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("erro nome");
			
	}
		

		System.out.println("Open database sucesso");
 }
	}



	
	

	

		






