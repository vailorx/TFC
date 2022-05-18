package sql;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class visualizar {


	public void visualizar1(String sql) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection aajcon = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/compras","root","");
			
			Statement aajstmt = aajcon.createStatement();
			
			ResultSet aajrs = aajstmt.executeQuery(sql);
		
			// Imprimir
			while( aajrs.next() ) {
				System.out.println(aajrs.getString(1) + " " + aajrs.getInt(2) + " " + aajrs.getString(3) + " " + aajrs.getInt(4));
				
			}
			
			aajcon.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

