package Café;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import conexion.conexionMysql;

//import cofeSoft.Registro;

//import cofeSoft.Menu;
//import cofeSoft.Registro;

import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {
	
	
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField txtpass;
	private JTextField txtUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setExtendedState(MAXIMIZED_BOTH); //VER MEJOR LA VENTANA
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public void validar() {
		String usuario=txtUsuario.getText();
		
		String contraseña= new String(txtpass.getPassword());

		if ((usuario.equals("jos")) && contraseña.equals("198")) {
			JOptionPane.showMessageDialog(null, "Bienvenido a CafeSoft");
			//abrirInicio();
			//abrirMenu();
			//dispose();//abrir ventana de inicio y cerrar la actual
             
			Menu men = new Menu(); //lo manda al menu si tiene los datos correctos 
			men.setExtendedState(MAXIMIZED_BOTH); 
			men.setVisible(true);
			dispose();  //cerrar la ventana de registro------
			
		} else {
			int option = JOptionPane.showConfirmDialog(null, "Error, ¿Desea registrarse?", "Error", JOptionPane.YES_NO_OPTION);
			
			if (option == JOptionPane.YES_NO_OPTION ) {
				//abrir ventana registro
				Registro registro = new Registro();
				registro.setExtendedState(MAXIMIZED_BOTH);
				registro.setVisible(true);
				dispose();
			}else {
		
			
			//limpiar
		      txtpass.setText("");
			  txtUsuario.setText("");
			
		}		
		}
	}
	
	/*
	/**
	 * Create the frame.
	 */
	public Inicio() {
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1166, 701);
		setLocationRelativeTo(null);//--------------------en medio
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/img4.jpg")));
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setBounds(622, -38, 669, 774);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Inicio de sesión ");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblNewLabel_4.setBounds(0, 58, 612, 31);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(89, 222, 108, 42);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(89, 304, 287, 12);
		contentPane.add(separator);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblContrasea.setBounds(89, 361, 164, 42);
		contentPane.add(lblContrasea);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(99, 452, 287, 18);
		contentPane.add(separator_1);
		
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validar();
			}
		});
		btnAcceder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAcceder.setBackground(Color.white);//poner el boton en azul al presionar
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAcceder.setBackground(Color.GRAY); //volver al olo espues e presionar
			}
		});
		btnAcceder.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		btnAcceder.setBackground(Color.GRAY);
		btnAcceder.setBounds(38, 567, 147, 49);
		contentPane.add(btnAcceder);
		
		JButton btnRegistrarme = new JButton("Registrarme");
		btnRegistrarme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Registro registro =  new Registro();
				registro.setExtendedState(MAXIMIZED_BOTH); 
		     	registro.setVisible(true);
		     	dispose();
			}
		});
		btnRegistrarme.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRegistrarme.setBackground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnRegistrarme.setBackground(Color.GRAY);
			}
		});
		btnRegistrarme.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		btnRegistrarme.setBackground(Color.GRAY);
		btnRegistrarme.setBounds(260, 566, 199, 51);
		contentPane.add(btnRegistrarme);
		
		txtpass = new JPasswordField();
		txtpass.setBackground(Color.LIGHT_GRAY);
		txtpass.setBounds(99, 424, 309, 27);
		txtpass.setBorder(null);
		contentPane.add(txtpass);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBorder(null);
		txtUsuario.setBackground(Color.LIGHT_GRAY);
		txtUsuario.setBounds(89, 262, 287, 31);
		contentPane.add(txtUsuario);
	}
}
