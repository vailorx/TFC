package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class visualizarid {
	public int visualizarid(String sql) {
		Integer numero = 0;
		Integer resultado = -1;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection aajcon = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/compras","root","");
			
			Statement aajstmt = aajcon.createStatement();
			
			numero = aajstmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			
			ResultSet rs = aajstmt.getGeneratedKeys();
			if(rs.next()) {
				resultado=rs.getInt(1);
			}
			rs.close();
			aajstmt.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			e.getMessage();
			resultado=-1;
		}
		return resultado;
		
}
}

