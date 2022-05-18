package otros;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class jtable {
  public jtable(){
    try 
  {
      String url = "jdbc:mysql://localhost:3306/compras";
      String user = "root";
      String password = "";
    
      Connection con = DriverManager.getConnection(url, user, password);
    
      String query = "SELECT * FROM empleados";
    
      Statement stm = con.createStatement();
      ResultSet res = stm.executeQuery(query);
    
      String columns[] = { "Nombre", "DNI", "Apellido", "Dpto", "Tlf" };
      String data[][] = new String[8][5];
    
      int i = 0;
      while (res.next()) {
        String Nombre = res.getString("Nombre");
        String DNI = res.getString("DNI");
        String Apellido = res.getString("Apellido");
        String Dpto = res.getString("Dpto");
        int tlf = res.getInt("tlf");
        data[i][0] = Nombre;
        data[i][1] = DNI;
        data[i][2] = Apellido;
        data[i][3] = Dpto;
        data[i][4] = tlf + "";
        
        i++;
      }
    
      DefaultTableModel model = new DefaultTableModel(data, columns);
      JTable table = new JTable(model);
      table.setShowGrid(true);
      table.setShowVerticalLines(true);
      JScrollPane pane = new JScrollPane(table);
      JFrame f = new JFrame("Populate JTable from Database");
      JPanel panel = new JPanel();
      panel.add(pane);
      f.add(panel);
      f.setBounds(43, 70, 481, 380);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    
    } catch(SQLException e) {
      e.printStackTrace();
    }
  }
}