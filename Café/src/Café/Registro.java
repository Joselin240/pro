package Café;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import conexion.conexionMysql;

//import cofeSoft.Inicio;

import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Registro extends JFrame {
	
	conexion.conexionMysql con = new conexionMysql();
	Connection cn= con.conectar();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtEmail;
	private JTextField txtTelefono;
	private JTextField txtContraseña;
	private JTextField txtApellido;
	private JTextField txtDireccion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
					frame.setExtendedState(MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registro() {
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1164, 703);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/86cc89545770198c9b93414385ef811b.jpg")));
		lblNewLabel.setBounds(678, 0, 603, 744);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CoffeSoft");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 45));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(201, 40, 197, 68);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/usuario.png")));
		//lblNewLabel_2.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/usuario.png")));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(7, 151, 171, 51);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/gmail.png")));
		//lblEmail.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/gmail.png")));
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblEmail.setBounds(10, 232, 143, 51);
		contentPane.add(lblEmail);
		
		JLabel lblTeleoo = new JLabel("Teléfono ");
		lblTeleoo.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/telefono.png")));
		//lblTeleoo.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/telefono.png")));
		lblTeleoo.setForeground(Color.BLACK);
		lblTeleoo.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblTeleoo.setBounds(9, 303, 171, 51);
		contentPane.add(lblTeleoo);
		
		JLabel lblNewLabel_3 = new JLabel("Contraseña:");
		lblNewLabel_3.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/clave.png")));
		//lblNewLabel_3.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/clave.png")));
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(14, 376, 202, 57);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido");
		lblNewLabel_4.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/acceso-con-contrasena.png")));
		//lblNewLabel_4.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/acceso-con-contrasena.png")));
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_4.setBounds(-1, 444, 301, 68);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Dirección");
		lblNewLabel_5.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/id-del-paciente (1).png")));
		//lblNewLabel_5.setIcon(new ImageIcon(Registro.class.getResource("/Imagenes/id-del-paciente (1).png")));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_5.setBounds(17, 523, 210, 59);
		contentPane.add(lblNewLabel_5);
		
		txtNombre = new JTextField();
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNombre.setColumns(10);
		txtNombre.setBorder(null);
		txtNombre.setBackground(Color.LIGHT_GRAY);
		txtNombre.setBounds(217, 166, 252, 34);
		contentPane.add(txtNombre);
		
		txtEmail = new JTextField();
		txtEmail.setForeground(Color.BLACK);
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBackground(Color.LIGHT_GRAY);
		txtEmail.setBounds(237, 242, 252, 34);
		contentPane.add(txtEmail);
		
		txtTelefono = new JTextField();
		txtTelefono.setForeground(Color.BLACK);
		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTelefono.setColumns(10);
		txtTelefono.setBorder(null);
		txtTelefono.setBackground(Color.LIGHT_GRAY);
		txtTelefono.setBounds(237, 299, 252, 34);
		contentPane.add(txtTelefono);
		
		txtContraseña = new JTextField();
		txtContraseña.setForeground(Color.BLACK);
		txtContraseña.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtContraseña.setColumns(10);
		txtContraseña.setBorder(null);
		txtContraseña.setBackground(Color.LIGHT_GRAY);
		txtContraseña.setBounds(254, 368, 252, 34);
		contentPane.add(txtContraseña);
		
		txtApellido = new JTextField();
		txtApellido.setForeground(Color.BLACK);
		txtApellido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtApellido.setColumns(10);
		txtApellido.setBorder(null);
		txtApellido.setBackground(Color.LIGHT_GRAY);
		txtApellido.setBounds(320, 444, 197, 34);
		contentPane.add(txtApellido);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(227, 211, 311, 20);
		contentPane.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBackground(Color.BLACK);
		separator_1_1.setBounds(224, 279, 311, 20);
		contentPane.add(separator_1_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setForeground(Color.BLACK);
		separator_1_2.setBackground(Color.BLACK);
		separator_1_2.setBounds(224, 344, 312, 20);
		contentPane.add(separator_1_2);
		
		JSeparator separator_1_3 = new JSeparator();
		separator_1_3.setForeground(Color.BLACK);
		separator_1_3.setBackground(Color.BLACK);
		separator_1_3.setBounds(236, 413, 304, 20);
		contentPane.add(separator_1_3);
		
		JSeparator separator_1_4 = new JSeparator();
		separator_1_4.setForeground(Color.BLACK);
		separator_1_4.setBackground(Color.BLACK);
		separator_1_4.setBounds(304, 489, 234, 20);
		contentPane.add(separator_1_4);
		
		JSeparator separator_1_5 = new JSeparator();
		separator_1_5.setForeground(Color.BLACK);
		separator_1_5.setBackground(Color.BLACK);
		separator_1_5.setBounds(259, 562, 210, 20);
		contentPane.add(separator_1_5);
		
		txtDireccion = new JTextField();
		txtDireccion.setForeground(Color.BLACK);
		txtDireccion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDireccion.setColumns(10);
		txtDireccion.setBorder(null);
		txtDireccion.setBackground(Color.LIGHT_GRAY);
		txtDireccion.setBounds(250, 517, 219, 34);
		contentPane.add(txtDireccion);
		
		JComboBox cmbBox = new JComboBox();
		cmbBox.setModel(new DefaultComboBoxModel(new String[] {"---Seleccione---", "Hombre ", "Mujer"}));
		cmbBox.setToolTipText("");
		cmbBox.setForeground(Color.BLACK);
		cmbBox.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cmbBox.setBackground(Color.LIGHT_GRAY);
		cmbBox.setBounds(482, 523, 186, 34);
		contentPane.add(cmbBox);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Inicio frame = new Inicio();//VOLVER A VENTANA INICIO
				frame.setVisible(true);
				frame.setExtendedState(MAXIMIZED_BOTH);
				dispose();
				
			}
		});
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnVolver.setBackground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnVolver.setBackground(Color.gray);
			}
		});
		btnVolver.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		btnVolver.setBackground(Color.GRAY);
		btnVolver.setBounds(53, 618, 154, 31);
		contentPane.add(btnVolver);
		
		JButton btnRegistrar = new JButton("Registrar usuario");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*Inicio frame = new Inicio();
				frame.setExtendedState(MAXIMIZED_BOTH); //VER MEJOR LA VENTANA
				frame.setVisible(true);
				dispose();
				*/
				
				String nombre = txtNombre.getText();
				String apellido = txtApellido.getText();
				String email = txtEmail.getText();
				String contraseña = txtContraseña.getText();
				String telefono = txtTelefono.getText();
				String direccion = txtDireccion.getText();
				
				if (nombre.isEmpty() ||apellido.isEmpty() || email.isEmpty() || contraseña.isEmpty() || telefono.isEmpty()||direccion.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Debe completar los datos");
				} else {
					
					try{
						String consulta ="INSERT INTO cliente (nombre,Apellido, contraseña, direccion, telefono, email)VALUES (?, ?, ?, ?, ?, ?)";
								
								
						PreparedStatement ps=cn.prepareStatement(consulta);
						
						    ps.setString(1, nombre);
			                ps.setString(2, apellido);
			                ps.setString(3, contraseña);
			                ps.setString(4, direccion);
			                ps.setString(5, telefono);
			                ps.setString(6, email);

						
						ps.executeUpdate();
						limpiar();
						JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
						} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "No se pudo guardar usuario"+ e1);
						}
				}		
			}
			void limpiar() {
		        txtNombre.setText("");
		        txtApellido.setText(""); 
		        txtEmail.setText("");
		        txtContraseña.setText("");
		        txtTelefono.setText("");
		        txtDireccion.setText("");
		    }

		});
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRegistrar.setBackground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnRegistrar.setBackground(Color.GRAY);
			}
		});
		btnRegistrar.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		btnRegistrar.setBackground(Color.GRAY);
		btnRegistrar.setBounds(289, 613, 265, 37);
		contentPane.add(btnRegistrar);
	}
}
