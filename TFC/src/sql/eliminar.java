package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class eliminar {
	//@param asignamos los valos de tanto nuestra conexion, como el usuario que vamos utilizar y contraseña  

	
	public void eliminar(String nombre){

	    try{
	        
	        String aajdriver = "com.mysql.cj.jdbc.Driver";
	        String aajurl = "jdbc:mysql://localhost/compras";
	        Class.forName(aajdriver);
	        Connection aajconn = DriverManager.getConnection(aajurl, "root", "");

	    
	        String aajquery = " delete from empleados where nombre"
	          + " values (?)";
	        PreparedStatement aajpreparedStmt = aajconn.prepareStatement(aajquery);
	        aajpreparedStmt.setString (1, nombre);
	       

	       
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