package EntornoGraficoAWT1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;



import sql.eliminar;
import sql.introducir;
import sql.update;



import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.Statement;


import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import javax.swing.ImageIcon;



import java.awt.SystemColor;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;


public class MenuP {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;

	private JTextField tf5;
	private JTextField consulta1;

	private JTextField consulta2;
	private JTextField consulta3;
	private JTextField consulta4;
	private JTextField Teliminar;
	private JTextField textField;
	private JTextField textField_1;

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
		
		
		
		JTextArea txtrHola = new JTextArea();
		txtrHola.setEnabled(false);
		
		txtrHola.setFont(new Font("Monospaced", Font.BOLD, 16));
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
		
		
		tf5.setColumns(10);
		tf5.setBounds(114, 152, 174, 20);
		panel_1.add(tf5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alvro\\Downloads\\carrito-de-supermercado (1).png"));
		lblNewLabel.setBounds(238, 314, 148, 119);
		panel_1.add(lblNewLabel);
		PrecioT.setText("0€");
		JButton btnNewButton_2 = new JButton("Calcular");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrecioT.setText("");
				String x = tf3.getText();
				String y = tf5.getText();
				int x1 = Integer.parseInt(x);
				int y1 = Integer.parseInt(y);
				int suma = x1 * y1;
				String Sumat = suma + "€";
				PrecioT.setText(Sumat);
				
			}
		});
		btnNewButton_2.setBounds(127, 243, 89, 23);
		panel_1.add(btnNewButton_2);
		
	
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
		
		JLabel lblNewLabel_4 = new JLabel("Nombre:");
		lblNewLabel_4.setBounds(10, 11, 50, 14);
		panel_2.add(lblNewLabel_4);
		
		consulta1 = new JTextField();
		
		
		
		consulta1.setBounds(70, 8, 152, 20);
		panel_2.add(consulta1);
		consulta1.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 107, 610, 281);
		panel_2.add(scrollPane);
		
		JTextArea txtrHola_1 = new JTextArea();
		scrollPane.setViewportView(txtrHola_1);
		txtrHola_1.setText("");
		txtrHola_1.setFont(new Font("Monospaced", Font.BOLD, 16));
		txtrHola_1.setColumns(1);
		txtrHola_1.setEnabled(false);
		
		JButton Buscar1 = new JButton("Buscar");
		Buscar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrHola_1.setText("");
				String x = consulta1.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection aajcon = DriverManager.getConnection
							("jdbc:mysql://localhost:3306/compras","root","");
					
					String sql = "Select * from empleados where nombre = " + "'" + x + "'"  + ";";
					Statement stm = aajcon.createStatement();
					ResultSet rs = stm.executeQuery(sql);
					while(rs.next()) {
						String nom = rs.getString(1);
						String DNI = rs.getString(2);
						String Apellido = rs.getString(3);
						String Dpto = rs.getString(4);
						int tlf = rs.getInt(5);
					 txtrHola_1.append(nom + "\t" + DNI + "\t" +  Apellido+ "\t" + Dpto + "\t" + tlf + "" + "\n");
						
					}
					
					
					
					aajcon.close();
					
				}catch(Exception e1) {
					System.out.println(e1);
				}
			}
		});
		Buscar1.setBounds(232, 7, 89, 23);
		panel_2.add(Buscar1);
		
		consulta2 = new JTextField();
		consulta2.setColumns(10);
		consulta2.setBounds(70, 38, 152, 20);
		panel_2.add(consulta2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Apellido:");
		lblNewLabel_4_1.setBounds(10, 41, 50, 14);
		panel_2.add(lblNewLabel_4_1);
		
		JButton Buscar1_1 = new JButton("Buscar");
		Buscar1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrHola_1.setText("");
				String x = consulta2.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection aajcon = DriverManager.getConnection
							("jdbc:mysql://localhost:3306/compras","root","");
					
					String sql = "Select * from empleados where Apellido = " + "'" + x + "'"  + ";";
					Statement stm = aajcon.createStatement();
					ResultSet rs = stm.executeQuery(sql);
					while(rs.next()) {
						String nom = rs.getString(1);
						String DNI = rs.getString(2);
						String Apellido = rs.getString(3);
						String Dpto = rs.getString(4);
						int tlf = rs.getInt(5);
					 txtrHola_1.append(nom + "\t" + DNI + "\t" +  Apellido+ "\t" + Dpto + "\t" + tlf + "" + "\n");
						
					}
					
					
					
					aajcon.close();
					
				}catch(Exception e1) {
					System.out.println(e1);
				}
			
				
			}
		});
		Buscar1_1.setBounds(232, 37, 89, 23);
		panel_2.add(Buscar1_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Dpto:");
		lblNewLabel_4_2.setBounds(331, 11, 46, 14);
		panel_2.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Tlf:");
		lblNewLabel_4_3.setBounds(331, 41, 46, 14);
		panel_2.add(lblNewLabel_4_3);
		
		consulta3 = new JTextField();
		consulta3.setColumns(10);
		consulta3.setBounds(380, 8, 152, 20);
		panel_2.add(consulta3);
		
		consulta4 = new JTextField();
		consulta4.setColumns(10);
		consulta4.setBounds(380, 38, 152, 20);
		panel_2.add(consulta4);
		
		JButton Buscar1_2 = new JButton("Buscar");
		Buscar1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrHola_1.setText("");
				String x = consulta3.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection aajcon = DriverManager.getConnection
							("jdbc:mysql://localhost:3306/compras","root","");
					
					String sql = "Select * from empleados where Dpto = " + "'" + x + "'"  + ";";
					Statement stm = aajcon.createStatement();
					ResultSet rs = stm.executeQuery(sql);
					while(rs.next()) {
						String nom = rs.getString(1);
						String DNI = rs.getString(2);
						String Apellido = rs.getString(3);
						String Dpto = rs.getString(4);
						int tlf = rs.getInt(5);
					 txtrHola_1.append(nom + "\t" + DNI + "\t" +  Apellido+ "\t" + Dpto + "\t" + tlf + "" + "\n");
						
					}
					
					
					
					aajcon.close();
					
				}catch(Exception e1) {
					System.out.println(e1);
				}
			
				
			
				
			}
		});
		Buscar1_2.setBounds(541, 7, 89, 23);
		panel_2.add(Buscar1_2);
		
		JButton Buscar1_3 = new JButton("Buscar");
		Buscar1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrHola_1.setText("");
				String x = consulta2.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection aajcon = DriverManager.getConnection
							("jdbc:mysql://localhost:3306/compras","root","");
					
					String sql = "Select * from empleados where Tlf = " +  x  + ";";
					Statement stm = aajcon.createStatement();
					ResultSet rs = stm.executeQuery(sql);
					while(rs.next()) {
						String nom = rs.getString(1);
						String DNI = rs.getString(2);
						String Apellido = rs.getString(3);
						String Dpto = rs.getString(4);
						int tlf = rs.getInt(5);
					 txtrHola_1.append(nom + "\t" + DNI + "\t" +  Apellido+ "\t" + Dpto + "\t" + tlf + "" + "\n");
					}
					
					
					
					aajcon.close();
					
				}catch(Exception e1) {
					System.out.println(e1);
				}
			
				
			
			}
		});
		Buscar1_3.setBounds(542, 37, 89, 23);
		panel_2.add(Buscar1_3);
		
		JButton Actualizar = new JButton("Actualizar");
		Actualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrHola_1.setText("");
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection aajcon = DriverManager.getConnection
							("jdbc:mysql://localhost:3306/compras","root","");
					
					String sql = "Select * from empleados;";
					Statement stm = aajcon.createStatement();
					ResultSet rs = stm.executeQuery(sql);
					
					
					while(rs.next()) {
						String nom = rs.getString(1);
						String DNI = rs.getString(2);
						String Apellido = rs.getString(3);
						String Dpto = rs.getString(4);
						int tlf = rs.getInt(5);
					 txtrHola_1.append(nom + "\t" + DNI + "\t" +  Apellido+ "\t" + Dpto + "\t" + tlf + "" + "\n");
						
					}
					
					
					
					aajcon.close();
					
				}catch(Exception e1) {
					System.out.println(e1);
				}
				
			}
		});
		Actualizar.setBounds(253, 71, 100, 23);
		panel_2.add(Actualizar);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Eliminar por Nombre: ");
		lblNewLabel_4_1_1.setBounds(10, 416, 131, 14);
		panel_2.add(lblNewLabel_4_1_1);
		
		Teliminar = new JTextField();
		Teliminar.setColumns(10);
		Teliminar.setBounds(140, 413, 152, 20);
		panel_2.add(Teliminar);
		
		JButton Borrar = new JButton("Borrar");
		Borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = Teliminar.getText();
				ob3.eliminar(x);
				
			}
		});
		Borrar.setBounds(302, 412, 89, 23);
		panel_2.add(Borrar);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection aajcon = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/compras","root","");
			
			String sql = "Select * from empleados;";
			Statement stm = aajcon.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			
			while(rs.next()) {
				String nom = rs.getString(1);
				String DNI = rs.getString(2);
				String Apellido = rs.getString(3);
				String Dpto = rs.getString(4);
				int tlf = rs.getInt(5);
			 txtrHola_1.append(nom + "\t" + DNI + "\t" +  Apellido+ "\t" + Dpto + "\t" + tlf + "" + "\n");
				
			}
			
			
			
			aajcon.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Pendientes", null, panel_3, null);
		panel_3.setLayout(null);
		
		

		 
		
		JLabel lblNewLabel_5 = new JLabel("Cambiar estado a realizado por id:");
		lblNewLabel_5.setFont(new Font("Verdana Pro Cond", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(10, 267, 321, 43);
		panel_3.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(341, 282, 126, 20);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 32, 608, 224);
		panel_3.add(scrollPane_2);
		
		
	
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 16));
		scrollPane_2.setViewportView(textArea);
		textArea.setEnabled(false);
		
		JLabel lblNewLabel_6 = new JLabel("Nombre");
		lblNewLabel_6.setBounds(10, 11, 50, 14);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("ID");
		lblNewLabel_6_1.setBounds(97, 11, 50, 14);
		panel_3.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Tienda");
		lblNewLabel_6_2.setBounds(183, 11, 50, 14);
		panel_3.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("Precio");
		lblNewLabel_6_3.setBounds(270, 11, 50, 14);
		panel_3.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_6_4 = new JLabel("Estado");
		lblNewLabel_6_4.setBounds(375, 11, 50, 14);
		panel_3.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_6_5 = new JLabel("Cantidad");
		lblNewLabel_6_5.setBounds(444, 11, 50, 14);
		panel_3.add(lblNewLabel_6_5);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = "update compras set estado = 'Realizado' where id_producto =";
				String y = textField.getText();
				String z = x +  y + ";";
				ob1.update(z);
			}
		});
		btnNewButton.setBounds(501, 281, 89, 23);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Actualizar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection aajcon1 = DriverManager.getConnection
							("jdbc:mysql://localhost:3306/compras","root","");
					
					String sql2 = "Select * from compras where estado = 'En Proceso';";
					Statement stm3 = aajcon1.createStatement();
					ResultSet rs = stm3.executeQuery(sql2);
					
					
					while(rs.next()) {
						String nom = rs.getString(1);
						int id = rs.getInt(2);
						String tiend = rs.getString(3);
						int preci = rs.getInt(4);
						String Estado = rs.getString(5);
						int cantidad = rs.getInt(6);
						textArea.append(nom + "\t" + id + "\t" +  tiend+ "\t" + preci + "€" + "\t" + Estado + "\t" + cantidad + "\n");
						
					}
					
					
					
					aajcon1.close();
					
				}catch(Exception e3) {
					System.out.println(e3);
				}
				
				
			}
		});
		btnNewButton_1.setBounds(258, 376, 107, 23);
		panel_3.add(btnNewButton_1);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		tabbedPane.addTab("Realizados", null, panel_3_1, null);
		
		JLabel lblNewLabel_5_1 = new JLabel("Cambiar estado a pendiente por id:");
		lblNewLabel_5_1.setFont(new Font("Verdana Pro Cond", Font.PLAIN, 20));
		lblNewLabel_5_1.setBounds(10, 267, 321, 43);
		panel_3_1.add(lblNewLabel_5_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(341, 282, 126, 20);
		panel_3_1.add(textField_1);
		
		JLabel lblNewLabel_6_6 = new JLabel("Nombre");
		lblNewLabel_6_6.setBounds(10, 11, 50, 14);
		panel_3_1.add(lblNewLabel_6_6);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("ID");
		lblNewLabel_6_1_1.setBounds(112, 11, 50, 14);
		panel_3_1.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("Tienda");
		lblNewLabel_6_2_1.setBounds(187, 11, 50, 14);
		panel_3_1.add(lblNewLabel_6_2_1);
		
		JLabel lblNewLabel_6_3_1 = new JLabel("Precio");
		lblNewLabel_6_3_1.setBounds(315, 11, 50, 14);
		panel_3_1.add(lblNewLabel_6_3_1);
		
		JLabel lblNewLabel_6_4_1 = new JLabel("Estado");
		lblNewLabel_6_4_1.setBounds(420, 11, 50, 14);
		panel_3_1.add(lblNewLabel_6_4_1);
		
		JLabel lblNewLabel_6_5_1 = new JLabel("Cantidad");
		lblNewLabel_6_5_1.setBounds(540, 11, 50, 14);
		panel_3_1.add(lblNewLabel_6_5_1);
		
		JButton enviar2 = new JButton("Enviar");
		enviar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = "update compras set estado = 'En Proceso' where id_producto = ";
				String y = textField_1.getText();
				String z = x +  y + ";";
				ob1.update(z);
			}
		});
		enviar2.setBounds(501, 281, 89, 23);
		panel_3_1.add(enviar2);
		frame.setResizable(false);
		
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 36, 596, 207);
		panel_3_1.add(scrollPane_3);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_3.setViewportView(textArea_1);
		textArea_1.setFont(new Font("Monospaced", Font.BOLD, 16));
		textArea_1.setEnabled(false);
		JButton btnNewButton_1_1 = new JButton("Actualizar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textArea_1.setText("");
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection aajcon1 = DriverManager.getConnection
						("jdbc:mysql://localhost:3306/compras","root","");
				
				String sql2 = "Select * from compras where estado = 'Realizado';";
				Statement stm3 = aajcon1.createStatement();
				ResultSet rs = stm3.executeQuery(sql2);
				
				
				while(rs.next()) {
					String nom = rs.getString(1);
					int id = rs.getInt(2);
					String tiend = rs.getString(3);
					int preci = rs.getInt(4);
					String Estado = rs.getString(5);
					int cantidad = rs.getInt(6);
					textArea_1.append(nom + "\t" + id + "\t" +  tiend+ "\t" + preci + "€" + "\t" + Estado + "\t" + cantidad + "\n");
					
				}
				
				
				
				aajcon1.close();
				
			}catch(Exception e3) {
				System.out.println(e3);
			}
			}
		});
		btnNewButton_1_1.setBounds(258, 376, 107, 23);
		panel_3_1.add(btnNewButton_1_1);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection aajcon1 = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/compras","root","");
			
			String sql2 = "Select * from compras where estado = 'En Proceso';";
			Statement stm3 = aajcon1.createStatement();
			ResultSet rs = stm3.executeQuery(sql2);
			
			
			while(rs.next()) {
				String nom = rs.getString(1);
				int id = rs.getInt(2);
				String tiend = rs.getString(3);
				int preci = rs.getInt(4);
				String Estado = rs.getString(5);
				int cantidad = rs.getInt(6);
				textArea.append(nom + "\t" + id + "\t" +  tiend+ "\t" + preci + "€" + "\t" + Estado + "\t" + cantidad + "\n");
				
			}
			
			
			
			aajcon1.close();
			
		}catch(Exception e3) {
			System.out.println(e3);
		}
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection aajcon1 = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/compras","root","");
			
			String sql2 = "Select * from compras where estado = 'Realizado';";
			Statement stm3 = aajcon1.createStatement();
			ResultSet rs = stm3.executeQuery(sql2);
			
			
			while(rs.next()) {
				String nom = rs.getString(1);
				int id = rs.getInt(2);
				String tiend = rs.getString(3);
				int preci = rs.getInt(4);
				String Estado = rs.getString(5);
				int cantidad = rs.getInt(6);
				textArea_1.append(nom + "\t" + id + "\t" +  tiend+ "\t" + preci + "€" + "\t" + Estado + "\t" + cantidad + "\n");
				
			}
			
			
			
			aajcon1.close();
			
		}catch(Exception e3) {
			System.out.println(e3);
		}
		
		
		
	}
	

}
