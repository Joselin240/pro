package Café;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;

public class Dulces extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Dulces() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menú Dulces");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setBounds(-5, -8, 1304, 66);
		add(lblNewLabel);
		
		JButton btnRegresar = new JButton("Regresar ");
		btnRegresar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnRegresar.setBackground(Color.GRAY);
		btnRegresar.setBounds(63, 71, 113, 23);
		add(btnRegresar);
		
		JButton btnReiniciar = new JButton("Reiniciar ");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReiniciar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnReiniciar.setBackground(Color.GRAY);
		btnReiniciar.setBounds(367, 71, 115, 24);
		add(btnReiniciar);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnTotal.setBackground(Color.GRAY);
		btnTotal.setBounds(766, 71, 115, 24);
		add(btnTotal);
		
		JButton btnRecibo = new JButton("Recibo");
		btnRecibo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnRecibo.setBackground(Color.GRAY);
		btnRecibo.setBounds(1028, 71, 115, 24);
		add(btnRecibo);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(39, 126, 179, 240);
		add(panel);
		
		JLabel lblNewLabel_32 = new JLabel("");
		lblNewLabel_32.setIcon(new ImageIcon(Dulces.class.getResource("/Imagenes/Brownie (1).jpg")));
		lblNewLabel_32.setBounds(0, 0, 184, 110);
		panel.add(lblNewLabel_32);
		
		JLabel lblNewLabel_2 = new JLabel("Brownie ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 116, 98, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_12 = new JLabel("\r\nPrecio");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12.setBounds(10, 150, 62, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("$30");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_13.setBounds(76, 150, 49, 14);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_19 = new JLabel("Cantidad ");
		lblNewLabel_19.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19.setBounds(7, 175, 88, 24);
		panel.add(lblNewLabel_19);
		
		JSpinner spinner1 = new JSpinner();
		spinner1.setBounds(86, 177, 41, 24);
		panel.add(spinner1);
		
		JLabel lblNewLabel_19_1 = new JLabel("Seleccionar");
		lblNewLabel_19_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1.setBounds(10, 205, 98, 24);
		panel.add(lblNewLabel_19_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(114, 208, 41, 23);
		panel.add(chckbxNewCheckBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(44, 403, 179, 240);
		add(panel_1);
		
		JLabel lblNewLabel_32_1 = new JLabel("");
		lblNewLabel_32_1.setIcon(new ImageIcon(Dulces.class.getResource("/Imagenes/Tarta de manzana (1).jpg")));
		lblNewLabel_32_1.setBounds(0, 0, 184, 110);
		panel_1.add(lblNewLabel_32_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tarta de manzana ");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(10, 116, 159, 24);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_12_1 = new JLabel("\r\nPrecio");
		lblNewLabel_12_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_1.setBounds(10, 150, 75, 14);
		panel_1.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_13_1 = new JLabel("$45");
		lblNewLabel_13_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_13_1.setBounds(76, 150, 49, 14);
		panel_1.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_19_2 = new JLabel("Cantidad ");
		lblNewLabel_19_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_2.setBounds(7, 175, 88, 24);
		panel_1.add(lblNewLabel_19_2);
		
		JSpinner spinner7 = new JSpinner();
		spinner7.setBounds(86, 177, 41, 24);
		panel_1.add(spinner7);
		
		JLabel lblNewLabel_19_1_1 = new JLabel("Seleccionar");
		lblNewLabel_19_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1_1.setBounds(10, 205, 98, 24);
		panel_1.add(lblNewLabel_19_1_1);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBounds(114, 208, 41, 23);
		panel_1.add(chckbxNewCheckBox_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(289, 126, 179, 240);
		add(panel_7);
		
		JLabel lblNewLabel_32_7 = new JLabel("");
		lblNewLabel_32_7.setIcon(new ImageIcon(Dulces.class.getResource("/Imagenes/Cupcake (1).jpg")));
		lblNewLabel_32_7.setBounds(0, 0, 184, 110);
		panel_7.add(lblNewLabel_32_7);
		
		JLabel lblNewLabel_2_7 = new JLabel("Cupcake");
		lblNewLabel_2_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_7.setBounds(10, 116, 98, 24);
		panel_7.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_12_7 = new JLabel("\r\nPrecio");
		lblNewLabel_12_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_7.setBounds(10, 150, 75, 14);
		panel_7.add(lblNewLabel_12_7);
		
		JLabel lblNewLabel_13_7 = new JLabel("$40");
		lblNewLabel_13_7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_13_7.setBounds(76, 150, 49, 14);
		panel_7.add(lblNewLabel_13_7);
		
		JLabel lblNewLabel_19_8 = new JLabel("Cantidad ");
		lblNewLabel_19_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_8.setBounds(7, 175, 88, 24);
		panel_7.add(lblNewLabel_19_8);
		
		JSpinner spinner2 = new JSpinner();
		spinner2.setBounds(86, 177, 41, 24);
		panel_7.add(spinner2);
		
		JLabel lblNewLabel_19_1_7 = new JLabel("Seleccionar");
		lblNewLabel_19_1_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1_7.setBounds(10, 205, 98, 24);
		panel_7.add(lblNewLabel_19_1_7);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("");
		chckbxNewCheckBox_7.setBounds(114, 208, 41, 23);
		panel_7.add(chckbxNewCheckBox_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBounds(549, 126, 179, 240);
		add(panel_8);
		
		JLabel lblNewLabel_32_8 = new JLabel("");
		lblNewLabel_32_8.setIcon(new ImageIcon(Dulces.class.getResource("/Imagenes/Galletas con chocolate (1).jpg")));
		lblNewLabel_32_8.setBounds(0, 0, 184, 110);
		panel_8.add(lblNewLabel_32_8);
		
		JLabel lblNewLabel_2_8 = new JLabel("Galletas con chocolate");
		lblNewLabel_2_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_8.setBounds(0, 121, 174, 24);
		panel_8.add(lblNewLabel_2_8);
		
		JLabel lblNewLabel_12_8 = new JLabel("\r\nPrecio");
		lblNewLabel_12_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_8.setBounds(10, 150, 75, 14);
		panel_8.add(lblNewLabel_12_8);
		
		JLabel lblNewLabel_13_8 = new JLabel("$20");
		lblNewLabel_13_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_13_8.setBounds(76, 150, 49, 14);
		panel_8.add(lblNewLabel_13_8);
		
		JLabel lblNewLabel_19_9 = new JLabel("Cantidad ");
		lblNewLabel_19_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_9.setBounds(7, 175, 88, 24);
		panel_8.add(lblNewLabel_19_9);
		
		JSpinner spinner3 = new JSpinner();
		spinner3.setBounds(86, 177, 41, 24);
		panel_8.add(spinner3);
		
		JLabel lblNewLabel_19_1_8 = new JLabel("Seleccionar");
		lblNewLabel_19_1_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1_8.setBounds(10, 205, 98, 24);
		panel_8.add(lblNewLabel_19_1_8);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("");
		chckbxNewCheckBox_8.setBounds(114, 208, 41, 23);
		panel_8.add(chckbxNewCheckBox_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBounds(803, 126, 179, 240);
		add(panel_9);
		
		JLabel lblNewLabel_32_9 = new JLabel("");
		lblNewLabel_32_9.setIcon(new ImageIcon(Dulces.class.getResource("/Imagenes/Cheesecake (1).jpg")));
		lblNewLabel_32_9.setBounds(0, 0, 184, 110);
		panel_9.add(lblNewLabel_32_9);
		
		JLabel lblNewLabel_2_9 = new JLabel("Cheesecake ");
		lblNewLabel_2_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_9.setBounds(10, 116, 98, 24);
		panel_9.add(lblNewLabel_2_9);
		
		JLabel lblNewLabel_12_9 = new JLabel("\r\nPrecio");
		lblNewLabel_12_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_9.setBounds(10, 150, 75, 14);
		panel_9.add(lblNewLabel_12_9);
		
		JLabel lblNewLabel_13_9 = new JLabel("$50");
		lblNewLabel_13_9.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_13_9.setBounds(76, 150, 49, 14);
		panel_9.add(lblNewLabel_13_9);
		
		JLabel lblNewLabel_19_10 = new JLabel("Cantidad ");
		lblNewLabel_19_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_10.setBounds(7, 175, 88, 24);
		panel_9.add(lblNewLabel_19_10);
		
		JSpinner spinner4 = new JSpinner();
		spinner4.setBounds(86, 177, 41, 24);
		panel_9.add(spinner4);
		
		JLabel lblNewLabel_19_1_9 = new JLabel("Seleccionar");
		lblNewLabel_19_1_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1_9.setBounds(10, 205, 98, 24);
		panel_9.add(lblNewLabel_19_1_9);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("");
		chckbxNewCheckBox_9.setBounds(114, 208, 41, 23);
		panel_9.add(chckbxNewCheckBox_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBounds(1064, 128, 179, 240);
		add(panel_10);
		
		JLabel lblNewLabel_32_10 = new JLabel("");
		lblNewLabel_32_10.setIcon(new ImageIcon(Dulces.class.getResource("/Imagenes/Panque de limón (1).jpg")));
		lblNewLabel_32_10.setBounds(0, 0, 184, 110);
		panel_10.add(lblNewLabel_32_10);
		
		JLabel lblNewLabel_2_10 = new JLabel("Panque de limón ");
		lblNewLabel_2_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_10.setBounds(10, 116, 145, 24);
		panel_10.add(lblNewLabel_2_10);
		
		JLabel lblNewLabel_12_10 = new JLabel("\r\nPrecio");
		lblNewLabel_12_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_10.setBounds(10, 150, 75, 14);
		panel_10.add(lblNewLabel_12_10);
		
		JLabel lblNewLabel_13_10 = new JLabel("$40");
		lblNewLabel_13_10.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_13_10.setBounds(76, 150, 49, 14);
		panel_10.add(lblNewLabel_13_10);
		
		JLabel lblNewLabel_19_11 = new JLabel("Cantidad ");
		lblNewLabel_19_11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_11.setBounds(7, 175, 88, 24);
		panel_10.add(lblNewLabel_19_11);
		
		JSpinner spinner5 = new JSpinner();
		spinner5.setBounds(86, 177, 41, 24);
		panel_10.add(spinner5);
		
		JLabel lblNewLabel_19_1_10 = new JLabel("Seleccionar");
		lblNewLabel_19_1_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1_10.setBounds(10, 205, 98, 24);
		panel_10.add(lblNewLabel_19_1_10);
		
		JCheckBox chckbxNewCheckBox_10 = new JCheckBox("");
		chckbxNewCheckBox_10.setBounds(114, 208, 41, 23);
		panel_10.add(chckbxNewCheckBox_10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(292, 403, 179, 240);
		add(panel_2);
		
		JLabel lblNewLabel_32_2 = new JLabel("");
		lblNewLabel_32_2.setIcon(new ImageIcon(Dulces.class.getResource("/Imagenes/macarons (1).jpg")));
		lblNewLabel_32_2.setBounds(0, 0, 184, 110);
		panel_2.add(lblNewLabel_32_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("macarons");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(10, 116, 98, 24);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_12_2 = new JLabel("\r\nPrecio");
		lblNewLabel_12_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_2.setBounds(10, 150, 75, 14);
		panel_2.add(lblNewLabel_12_2);
		
		JLabel lblNewLabel_13_2 = new JLabel("$20");
		lblNewLabel_13_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_13_2.setBounds(76, 150, 49, 14);
		panel_2.add(lblNewLabel_13_2);
		
		JLabel lblNewLabel_19_3 = new JLabel("Cantidad ");
		lblNewLabel_19_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_3.setBounds(7, 175, 88, 24);
		panel_2.add(lblNewLabel_19_3);
		
		JSpinner spinner8 = new JSpinner();
		spinner8.setBounds(86, 177, 41, 24);
		panel_2.add(spinner8);
		
		JLabel lblNewLabel_19_1_2 = new JLabel("Seleccionar");
		lblNewLabel_19_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1_2.setBounds(10, 205, 98, 24);
		panel_2.add(lblNewLabel_19_1_2);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
		chckbxNewCheckBox_2.setBounds(114, 208, 41, 23);
		panel_2.add(chckbxNewCheckBox_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(551, 403, 179, 240);
		add(panel_3);
		
		JLabel lblNewLabel_32_3 = new JLabel("");
		lblNewLabel_32_3.setIcon(new ImageIcon(Dulces.class.getResource("/Imagenes/Donas (1).jpg")));
		lblNewLabel_32_3.setBounds(0, 0, 184, 110);
		panel_3.add(lblNewLabel_32_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("Donas");
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_3.setBounds(10, 116, 98, 24);
		panel_3.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_12_3 = new JLabel("\r\nPrecio");
		lblNewLabel_12_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_3.setBounds(10, 150, 75, 14);
		panel_3.add(lblNewLabel_12_3);
		
		JLabel lblNewLabel_13_3 = new JLabel("$30");
		lblNewLabel_13_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_13_3.setBounds(76, 150, 49, 14);
		panel_3.add(lblNewLabel_13_3);
		
		JLabel lblNewLabel_19_4 = new JLabel("Cantidad ");
		lblNewLabel_19_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_4.setBounds(7, 175, 88, 24);
		panel_3.add(lblNewLabel_19_4);
		
		JSpinner spinner9 = new JSpinner();
		spinner9.setBounds(86, 177, 41, 24);
		panel_3.add(spinner9);
		
		JLabel lblNewLabel_19_1_3 = new JLabel("Seleccionar");
		lblNewLabel_19_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1_3.setBounds(10, 205, 98, 24);
		panel_3.add(lblNewLabel_19_1_3);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("");
		chckbxNewCheckBox_3.setBounds(114, 208, 41, 23);
		panel_3.add(chckbxNewCheckBox_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(809, 405, 179, 240);
		add(panel_4);
		
		JLabel lblNewLabel_32_4 = new JLabel("");
		lblNewLabel_32_4.setIcon(new ImageIcon(Dulces.class.getResource("/Imagenes/Rollos de canela (1).jpg")));
		lblNewLabel_32_4.setBounds(0, 0, 184, 110);
		panel_4.add(lblNewLabel_32_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("Rollos de canela");
		lblNewLabel_2_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_4.setBounds(10, 116, 145, 24);
		panel_4.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_12_4 = new JLabel("\r\nPrecio");
		lblNewLabel_12_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_4.setBounds(10, 150, 75, 14);
		panel_4.add(lblNewLabel_12_4);
		
		JLabel lblNewLabel_13_4 = new JLabel("$40");
		lblNewLabel_13_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_13_4.setBounds(76, 150, 49, 14);
		panel_4.add(lblNewLabel_13_4);
		
		JLabel lblNewLabel_19_5 = new JLabel("Cantidad ");
		lblNewLabel_19_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_5.setBounds(7, 175, 88, 24);
		panel_4.add(lblNewLabel_19_5);
		
		JSpinner spinner10 = new JSpinner();
		spinner10.setBounds(86, 177, 41, 24);
		panel_4.add(spinner10);
		
		JLabel lblNewLabel_19_1_4 = new JLabel("Seleccionar");
		lblNewLabel_19_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1_4.setBounds(10, 205, 98, 24);
		panel_4.add(lblNewLabel_19_1_4);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("");
		chckbxNewCheckBox_4.setBounds(114, 208, 41, 23);
		panel_4.add(chckbxNewCheckBox_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(1068, 403, 179, 240);
		add(panel_5);
		
		JLabel lblNewLabel_32_5 = new JLabel("");
		lblNewLabel_32_5.setIcon(new ImageIcon(Dulces.class.getResource("/Imagenes/Pastel de zanahoria (1).jpg")));
		lblNewLabel_32_5.setBounds(0, 0, 184, 110);
		panel_5.add(lblNewLabel_32_5);
		
		JLabel lblNewLabel_2_5 = new JLabel("Pastel de zanahoria ");
		lblNewLabel_2_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_5.setBounds(10, 116, 174, 24);
		panel_5.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_12_5 = new JLabel("\r\nPrecio");
		lblNewLabel_12_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_5.setBounds(10, 150, 75, 14);
		panel_5.add(lblNewLabel_12_5);
		
		JLabel lblNewLabel_13_5 = new JLabel("$40");
		lblNewLabel_13_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_13_5.setBounds(76, 150, 49, 14);
		panel_5.add(lblNewLabel_13_5);
		
		JLabel lblNewLabel_19_6 = new JLabel("Cantidad ");
		lblNewLabel_19_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_6.setBounds(7, 175, 88, 24);
		panel_5.add(lblNewLabel_19_6);
		
		JSpinner spinner11 = new JSpinner();
		spinner11.setBounds(86, 177, 41, 24);
		panel_5.add(spinner11);
		
		JLabel lblNewLabel_19_1_5 = new JLabel("Seleccionar");
		lblNewLabel_19_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1_5.setBounds(10, 205, 98, 24);
		panel_5.add(lblNewLabel_19_1_5);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("");
		chckbxNewCheckBox_5.setBounds(114, 208, 41, 23);
		panel_5.add(chckbxNewCheckBox_5);

	}

}
