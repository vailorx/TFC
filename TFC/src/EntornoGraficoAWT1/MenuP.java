package EntornoGraficoAWT1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JToolBar;

import sql.eliminar;
import sql.introducir;
import sql.update;
import sql.visualizar;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import otros.jtable;

import java.awt.SystemColor;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MenuP {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private final Action action = new SwingAction();
	private JTextField tf5;
	private JTextField consulta1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuP window = new MenuP();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		introducir ob2 = new introducir();
		update ob1 = new update();
		eliminar ob3 = new eliminar();
		visualizar ob4 = new visualizar();
		jtable ob5 = new jtable();
		frame = new JFrame();
		frame.setBounds(100, 100, 651, 528);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 635, 489);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_0 = new JPanel();
		tabbedPane.addTab("Inicio", null, panel_0, null);
		panel_0.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 630, 461);
		panel_0.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\alvro\\Downloads\\shop (1).png"));
		lblNewLabel_2.setBounds(275, 88, 67, 79);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\alvro\\Downloads\\online-shop (1).png"));
		lblNewLabel_2_1.setBounds(184, 189, 67, 79);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setIcon(new ImageIcon("C:\\Users\\alvro\\Downloads\\online-shopping.png"));
		lblNewLabel_2_2.setBounds(362, 189, 67, 79);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("New label");
		lblNewLabel_2_1_1.setIcon(new ImageIcon("C:\\Users\\alvro\\Downloads\\online-shop (2).png"));
		lblNewLabel_2_1_1.setBounds(58, 105, 67, 79);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("New label");
		lblNewLabel_2_1_2.setIcon(new ImageIcon("C:\\Users\\alvro\\Downloads\\affogato.png"));
		lblNewLabel_2_1_2.setBounds(519, 105, 67, 79);
		panel.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("Material Empresarial");
		lblNewLabel_3.setForeground(Color.ORANGE);
		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 28));
		lblNewLabel_3.setBounds(173, 337, 291, 79);
		panel.add(lblNewLabel_3);
		
	
		
		JPanel panel_1 = new JPanel();
		
		panel_1.setBackground(SystemColor.controlHighlight);
		tabbedPane.addTab("Compras", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel productoT = new JLabel("Producto:");
		productoT.setBounds(44, 45, 59, 14);
		panel_1.add(productoT);
		
		JLabel idT = new JLabel("ID:");
		idT.setBounds(44, 70, 46, 14);
		panel_1.add(idT);
		
		JLabel cantidaT = new JLabel("Cantidad:");
		cantidaT.setBounds(44, 95, 59, 14);
		panel_1.add(cantidaT);
		
		JLabel tiendaT = new JLabel("Tienda:");
		tiendaT.setBounds(44, 124, 59, 14);
		panel_1.add(tiendaT);
		
		tf1 = new JTextField();
		tf1.setBounds(114, 39, 174, 20);
		panel_1.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(114, 67, 174, 20);
		panel_1.add(tf2);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(113, 92, 174, 20);
		panel_1.add(tf3);
		
		tf4 = new JTextField();
		tf4.setColumns(10);
		tf4.setBounds(114, 121, 174, 20);
		panel_1.add(tf4);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblPrecio.setBounds(43, 202, 74, 45);
		panel_1.add(lblPrecio);
		
		JLabel PrecioT = new JLabel("");
		PrecioT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		PrecioT.setBounds(155, 218, 59, 14);
		panel_1.add(PrecioT);
		
		JButton Enviar1 = new JButton("Enviar");
		Enviar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = tf1.getText();
				String y = tf2.getText();
				int y1 = Integer.parseInt(y);
				String c = tf3.getText();
				String v = tf4.getText();
				String j = tf5.getText();
				int j1 = Integer.parseInt(j);
				int c1 = Integer.parseInt(c);
				ob2.introducir(x, y1, c1, v, j1);
			}
		});
		Enviar1.setBounds(43, 275, 89, 23);
		panel_1.add(Enviar1);
		
		JButton Reiniciar1 = new JButton("Reiniciar");
		Reiniciar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
			}
		});
		Reiniciar1.setBounds(209, 275, 89, 23);
		panel_1.add(Reiniciar1);
		
		JList list = new JList();
		list.setBounds(394, 279, 174, -234);
		panel_1.add(list);
		
		JTextArea txtrHola = new JTextArea();
		
		txtrHola.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtrHola.setColumns(1);
		txtrHola.setBounds(347, 23, 247, 242);
		panel_1.add(txtrHola);
		txtrHola.setText("");
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(347, 0, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID");
		lblNewLabel_1_1.setBounds(439, 0, 46, 14);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Precio");
		lblNewLabel_1_1_2.setBounds(505, 0, 46, 14);
		panel_1.add(lblNewLabel_1_1_2);
		
		JLabel lblPrecioUnitario = new JLabel("Precio Unitario");
		lblPrecioUnitario.setBounds(29, 155, 74, 14);
		panel_1.add(lblPrecioUnitario);
		
		tf5 = new JTextField();
		tf5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(tf5.getText() != "") {
				String x = tf3.getText();
				int cantidad = Integer.parseInt(x);
				String y = tf5.getText();
				int precio = Integer.parseInt(y);
				int total = precio * cantidad;
				String totalt = total + "€";
				PrecioT.setText(totalt);
			}else {
				PrecioT.setText("0€");
			}
			} 
		});
		
		tf5.setColumns(10);
		tf5.setBounds(114, 152, 174, 20);
		panel_1.add(tf5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alvro\\Downloads\\carrito-de-supermercado (1).png"));
		lblNewLabel.setBounds(238, 314, 148, 119);
		panel_1.add(lblNewLabel);
		
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection aajcon = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/compras","root","");
			
			String sql = "Select * from productos;";
			Statement stm = aajcon.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			
			while(rs.next()) {
				String nom = rs.getString(1);
				int id = rs.getInt(2);
				String tiend = rs.getString(3);
				int preci = rs.getInt(4);
			 txtrHola.append(nom + "\t" + id + "\t" +  preci+ "€" + "\n");
				
			}
			
			
			
			aajcon.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Empleados", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Consulta");
		lblNewLabel_4.setBounds(49, 11, 46, 14);
		panel_2.add(lblNewLabel_4);
		
		consulta1 = new JTextField();
		consulta1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String s = consulta1.getText();
				 try 
				  {
				      String url = "jdbc:mysql://localhost:3306/compras";
				      String user = "root";
				      String password = "";
				    
				      Connection con = DriverManager.getConnection(url, user, password);
				    
				      String query = s + ";";
				    
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
						table = new JTable(model);
						table.setBounds(63, 51, 481, 380);
						table.setShowGrid(true);
					      table.setShowVerticalLines(true);
					      
						panel_2.add(table);
						
				  } catch(SQLException e1) {
				      e1.printStackTrace();
				    }
				 
			}
		});
		
		
		consulta1.setBounds(128, 8, 385, 20);
		panel_2.add(consulta1);
		consulta1.setColumns(10);
		
		
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Consulta", null, panel_3, null);
		panel_3.setLayout(null);
		frame.setResizable(false);
		
		
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
