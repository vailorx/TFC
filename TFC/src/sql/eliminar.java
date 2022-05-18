package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class eliminar {
	//@param asignamos los valos de tanto nuestra conexion, como el usuario que vamos utilizar y contraseña  

	
	public void eliminar(String nombre, String apellido, int edad){

	    try{
	        
	        String aajdriver = "com.mysql.cj.jdbc.Driver";
	        String aajurl = "jdbc:mysql://localhost/aajhospital";
	        Class.forName(aajdriver);
	        Connection aajconn = DriverManager.getConnection(aajurl, "root", "");

	    
	        String aajquery = " delete from pacientes where nombre, apellido, edad"
	          + " values (?, ?, ?)";
	        PreparedStatement aajpreparedStmt = aajconn.prepareStatement(aajquery);
	        aajpreparedStmt.setString (1, nombre);
	        aajpreparedStmt.setString   (2, apellido);
	        aajpreparedStmt.setInt(3, edad);

	       
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