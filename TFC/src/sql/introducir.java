package sql;

import java.sql.*;


public class introducir {

	
	 
	  public void introducir(String nombre, int id, int cantidad, String tienda, int precio) {
		  
		    try{
		    	
		      String aajdriver = "com.mysql.cj.jdbc.Driver";
		      String aajurl = "jdbc:mysql://localhost/compras";
		      Class.forName(aajdriver);
		      Connection aajconn = DriverManager.getConnection(aajurl, "root", "");
		      
		      String aajquery = "insert into compras (nombre, ID_producto, Tienda, cantidad, Estado, precio )"
		        + " values (?, ?, ?, ?, ?, ?)";
		      PreparedStatement aajpreparedStmt = aajconn.prepareStatement(aajquery);
		      aajpreparedStmt.setString (1, nombre);
		      aajpreparedStmt.setInt (2, id);
		      aajpreparedStmt.setString(3, tienda);
		      aajpreparedStmt.setInt(4, cantidad);
		      aajpreparedStmt.setString(5, "En Proceso");
		      aajpreparedStmt.setInt(6,precio);
				
		      

		     
		      aajpreparedStmt.execute();
		      
		      aajconn.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("error");
		      System.err.println(e.getMessage());
		    }
		  }
		}


