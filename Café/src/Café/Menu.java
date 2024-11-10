package Café;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setLocationRelativeTo(null);
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
	public Menu() {
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1327, 737);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JMenu btnInicio = new JMenu("Inicio ");
		btnInicio.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/hogar.png")));
		btnInicio.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		menuBar.add(btnInicio);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Salir\r\n");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio frame = new Inicio();
				frame.setExtendedState(MAXIMIZED_BOTH); //VER MEJOR LA VENTANA
				frame.setVisible(true);
			}
		});
		mntmNewMenuItem_4.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnInicio.add(mntmNewMenuItem_4);
		
		JMenu btnMenu = new JMenu("Menú ");
		btnMenu.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/alimento (1).png")));
		btnMenu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		menuBar.add(btnMenu);
		
		JMenuItem opPostres = new JMenuItem("Postres\r\n");
		opPostres.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		opPostres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Postres po = new Postres();
				nuevoPanel(po);
				
			}
			
			
		});
		btnMenu.add(opPostres);
		
		JMenuItem opDulces = new JMenuItem("Dulces ");
		opDulces.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		opDulces.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dulces du = new Dulces();
				nuevoPanel(du);
			}
		});
		
		JMenuItem opBebidas = new JMenuItem("Bebidas ");
		opBebidas.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		opBebidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bebidas be = new Bebidas();
				nuevoPanel(be);
			}
		});
		btnMenu.add(opBebidas);
		btnMenu.add(opDulces);
		
		JMenuItem opComidad = new JMenuItem("Comida");
		opComidad.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		opComidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comida co = new Comida();
				nuevoPanel(co);
			}
		});
		btnMenu.add(opComidad);
		
		JMenu btnCanasta = new JMenu("Canasta");
		btnCanasta.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/carro-de-la-compra (1).png")));
		btnCanasta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		menuBar.add(btnCanasta);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Mis compras ");
		mntmNewMenuItem_5.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnCanasta.add(mntmNewMenuItem_5);
		
		JMenu btnUsuario = new JMenu("Usuario");
		btnUsuario.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/grupo-de-trabajo.png")));
		btnUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		menuBar.add(btnUsuario);
		
		JMenuItem btnMiinformación = new JMenuItem("Mi información ");
		btnMiinformación.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnUsuario.add(btnMiinformación);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Nuevo");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Registro frame = new Registro();
				frame.setExtendedState(MAXIMIZED_BOTH);
				frame.setVisible(true);
			}
		});
		mntmNewMenuItem_7.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnUsuario.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Eliminar");
		mntmNewMenuItem_8.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnUsuario.add(mntmNewMenuItem_8);
		
		JMenu btnInformacion = new JMenu("Información ");
		btnInformacion.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/informacion (1).png")));
		btnInformacion.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		menuBar.add(btnInformacion);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Acerca de CofeSoft");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Información in = new Información();
				nuevoPanel(in);
			}
		});
		mntmNewMenuItem_9.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnInformacion.add(mntmNewMenuItem_9);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/im8 (1).jpg")));
		lblNewLabel.setBounds(-32, 0, 1319, 673);
		contentPane.add(lblNewLabel);
	}

	private void nuevoPanel(JPanel panelActual) {
		contentPane.removeAll();
		panelActual.setBounds(0, 0, contentPane.getWidth(), contentPane.getHeight()); // Ajusta el tamaño del panel
        contentPane.add(panelActual);
		contentPane.repaint();
		contentPane.revalidate();
		
		}
	
}
