package Café;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bebidas extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Bebidas() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Menú bebidas\r\n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(-2, 0, 1209, 51);
		add(lblNewLabel_1);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegresar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnRegresar.setBackground(Color.GRAY);
		btnRegresar.setBounds(62, 71, 115, 24);
		add(btnRegresar);
		
		JButton btnReiniciar = new JButton("Reiniciar ");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnReiniciar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnReiniciar.setBackground(Color.GRAY);
		btnReiniciar.setBounds(368, 71, 115, 24);
		add(btnReiniciar);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTotal.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnTotal.setBackground(Color.GRAY);
		btnTotal.setBounds(742, 71, 115, 24);
		add(btnTotal);
		
		JButton btnRecibo = new JButton("Recibo");
		btnRecibo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRecibo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnRecibo.setBackground(Color.GRAY);
		btnRecibo.setBounds(1040, 71, 115, 24);
		add(btnRecibo);
		
		JPanel panel_1_2_2_1_1 = new JPanel();
		panel_1_2_2_1_1.setLayout(null);
		panel_1_2_2_1_1.setBounds(46, 405, 179, 240);
		add(panel_1_2_2_1_1);
		
		JLabel lblNewLabel_32_1_2_2_1_1 = new JLabel("");
		lblNewLabel_32_1_2_2_1_1.setIcon(new ImageIcon(Bebidas.class.getResource("/Imagenes/cafe frio latte (1).jpg")));
		lblNewLabel_32_1_2_2_1_1.setBounds(0, 0, 184, 110);
		panel_1_2_2_1_1.add(lblNewLabel_32_1_2_2_1_1);
		
		JLabel lblNewLabel_12_1_2_2_1_1 = new JLabel("\r\nPrecio");
		lblNewLabel_12_1_2_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_1_2_2_1_1.setBounds(10, 150, 75, 14);
		panel_1_2_2_1_1.add(lblNewLabel_12_1_2_2_1_1);
		
		JLabel lblNewLabel_19_2_2_2_1_1 = new JLabel("Cantidad ");
		lblNewLabel_19_2_2_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_2_2_2_1_1.setBounds(7, 175, 88, 24);
		panel_1_2_2_1_1.add(lblNewLabel_19_2_2_2_1_1);
		
		JLabel lblNewLabel_19_1_1_2_2_1_1 = new JLabel("Seleccionar");
		lblNewLabel_19_1_1_2_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1_1_2_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1_1_2_2_1_1.setBounds(10, 205, 98, 24);
		panel_1_2_2_1_1.add(lblNewLabel_19_1_1_2_2_1_1);
		
		JCheckBox CheckBoxcaferioatte = new JCheckBox("");
		CheckBoxcaferioatte.setBounds(114, 208, 41, 23);
		panel_1_2_2_1_1.add(CheckBoxcaferioatte);
		
		JLabel lblNewLabel_8 = new JLabel("cafe frio latte");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(10, 121, 132, 14);
		panel_1_2_2_1_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_13_1_1 = new JLabel("$40");
		lblNewLabel_13_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_13_1_1.setBounds(86, 150, 49, 14);
		panel_1_2_2_1_1.add(lblNewLabel_13_1_1);
		
		JSpinner spinner6 = new JSpinner();
		spinner6.setBounds(96, 177, 41, 24);
		panel_1_2_2_1_1.add(spinner6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(null);
		panel_1.setBounds(47, 132, 179, 240);
		add(panel_1);
		
		JLabel lblNewLabel_32_1 = new JLabel("");
		lblNewLabel_32_1.setIcon(new ImageIcon(Bebidas.class.getResource("/Imagenes/Capuchino (1).jpg")));
		lblNewLabel_32_1.setBounds(0, 0, 184, 110);
		panel_1.add(lblNewLabel_32_1);
		
		JLabel lblNewLabel_12_1 = new JLabel("\r\nPrecio");
		lblNewLabel_12_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_1.setBounds(10, 150, 75, 14);
		panel_1.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_13_1 = new JLabel("$40");
		lblNewLabel_13_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_13_1.setBounds(76, 150, 49, 14);
		panel_1.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_19_2 = new JLabel("Cantidad ");
		lblNewLabel_19_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_2.setBounds(7, 175, 88, 24);
		panel_1.add(lblNewLabel_19_2);
		
		JLabel lblNewLabel_19_1_1 = new JLabel("Seleccionar");
		lblNewLabel_19_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1_1.setBounds(10, 205, 98, 24);
		panel_1.add(lblNewLabel_19_1_1);
		
		JCheckBox CheckBoxCapuchino = new JCheckBox("");
		CheckBoxCapuchino.setBounds(114, 208, 41, 23);
		panel_1.add(CheckBoxCapuchino);
		
		JLabel lblNewLabel_3 = new JLabel("Capuchino");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(10, 121, 98, 14);
		panel_1.add(lblNewLabel_3);
		
		JSpinner spinner1 = new JSpinner();
		spinner1.setBounds(86, 175, 41, 24);
		panel_1.add(spinner1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(291, 129, 179, 240);
		add(panel_1_1);
		
		JLabel lblNewLabel_32_1_1 = new JLabel("");
		lblNewLabel_32_1_1.setIcon(new ImageIcon(Bebidas.class.getResource("/Imagenes/Cafe americano (1).jpg")));
		lblNewLabel_32_1_1.setBounds(0, 0, 184, 110);
		panel_1_1.add(lblNewLabel_32_1_1);
		
		JLabel lblNewLabel_12_1_1 = new JLabel("\r\nPrecio");
		lblNewLabel_12_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_1_1.setBounds(10, 150, 75, 14);
		panel_1_1.add(lblNewLabel_12_1_1);
		
		JLabel lblNewLabel_13_1_2 = new JLabel("$40");
		lblNewLabel_13_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_13_1_2.setBounds(76, 150, 49, 14);
		panel_1_1.add(lblNewLabel_13_1_2);
		
		JLabel lblNewLabel_19_2_1 = new JLabel("Cantidad ");
		lblNewLabel_19_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_2_1.setBounds(7, 175, 88, 24);
		panel_1_1.add(lblNewLabel_19_2_1);
		
		JLabel lblNewLabel_19_1_1_1 = new JLabel("Seleccionar");
		lblNewLabel_19_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1_1_1.setBounds(10, 205, 98, 24);
		panel_1_1.add(lblNewLabel_19_1_1_1);
		
		JCheckBox CheckBoxCafeamericano = new JCheckBox("");
		CheckBoxCafeamericano.setBounds(114, 210, 41, 23);
		panel_1_1.add(CheckBoxCafeamericano);
		
		JLabel lblNewLabel_5 = new JLabel("Cafe americano\r\n");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(10, 121, 127, 14);
		panel_1_1.add(lblNewLabel_5);
		
		JSpinner spinner2 = new JSpinner();
		spinner2.setBounds(96, 177, 41, 24);
		panel_1_1.add(spinner2);
		
		JPanel panel_1_2_2_1 = new JPanel();
		panel_1_2_2_1.setLayout(null);
		panel_1_2_2_1.setBounds(534, 132, 179, 240);
		add(panel_1_2_2_1);
		
		JLabel lblNewLabel_32_1_2_2_1 = new JLabel("");
		lblNewLabel_32_1_2_2_1.setIcon(new ImageIcon(Bebidas.class.getResource("/Imagenes/cafe mocha (1).jpg")));
		lblNewLabel_32_1_2_2_1.setBounds(0, 0, 184, 110);
		panel_1_2_2_1.add(lblNewLabel_32_1_2_2_1);
		
		JLabel lblNewLabel_12_1_2_2_1 = new JLabel("\r\nPrecio");
		lblNewLabel_12_1_2_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_1_2_2_1.setBounds(10, 150, 75, 14);
		panel_1_2_2_1.add(lblNewLabel_12_1_2_2_1);
		
		JLabel lblNewLabel_19_2_2_2_1 = new JLabel("Cantidad ");
		lblNewLabel_19_2_2_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_2_2_2_1.setBounds(7, 175, 88, 24);
		panel_1_2_2_1.add(lblNewLabel_19_2_2_2_1);
		
		JSpinner spinner3 = new JSpinner();
		spinner3.setBounds(86, 177, 41, 24);
		panel_1_2_2_1.add(spinner3);
		
		JLabel lblNewLabel_19_1_1_2_2_1 = new JLabel("Seleccionar");
		lblNewLabel_19_1_1_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1_1_2_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1_1_2_2_1.setBounds(10, 205, 98, 24);
		panel_1_2_2_1.add(lblNewLabel_19_1_1_2_2_1);
		
		JCheckBox CheckBoxcafemocha = new JCheckBox("");
		CheckBoxcafemocha.setBounds(114, 208, 41, 23);
		panel_1_2_2_1.add(CheckBoxcafemocha);
		
		JLabel lblNewLabel_11 = new JLabel("cafe mocha");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_11.setBounds(10, 125, 99, 14);
		panel_1_2_2_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_28_1 = new JLabel("$35\r\n");
		lblNewLabel_28_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_28_1.setBounds(78, 150, 49, 14);
		panel_1_2_2_1.add(lblNewLabel_28_1);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBounds(783, 131, 184, 240);
		add(panel_1_2_1);
		
		JLabel lblNewLabel_32_1_2_1 = new JLabel("");
		lblNewLabel_32_1_2_1.setIcon(new ImageIcon(Bebidas.class.getResource("/Imagenes/cafe frio (1).jpg")));
		lblNewLabel_32_1_2_1.setBounds(0, 0, 184, 110);
		panel_1_2_1.add(lblNewLabel_32_1_2_1);
		
		JLabel lblNewLabel_12_1_2_1 = new JLabel("\r\nPrecio");
		lblNewLabel_12_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_1_2_1.setBounds(10, 150, 75, 14);
		panel_1_2_1.add(lblNewLabel_12_1_2_1);
		
		JLabel lblNewLabel_19_2_2_1 = new JLabel("Cantidad ");
		lblNewLabel_19_2_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_2_2_1.setBounds(7, 175, 88, 24);
		panel_1_2_1.add(lblNewLabel_19_2_2_1);
		
		JLabel lblNewLabel_19_1_1_2_1 = new JLabel("Seleccionar");
		lblNewLabel_19_1_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1_1_2_1.setBounds(10, 205, 98, 24);
		panel_1_2_1.add(lblNewLabel_19_1_1_2_1);
		
		JCheckBox CheckBoxcafefrio = new JCheckBox("");
		CheckBoxcafefrio.setBounds(114, 208, 41, 23);
		panel_1_2_1.add(CheckBoxcafefrio);
		
		JLabel lblNewLabel_15 = new JLabel("cafe frio");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_15.setBounds(10, 121, 75, 14);
		panel_1_2_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_4_1 = new JLabel("$30");
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(71, 150, 27, 14);
		panel_1_2_1.add(lblNewLabel_4_1);
		
		JSpinner spinner4 = new JSpinner();
		spinner4.setBounds(96, 177, 41, 24);
		panel_1_2_1.add(spinner4);
		
		JPanel panel_1_2_2 = new JPanel();
		panel_1_2_2.setLayout(null);
		panel_1_2_2.setBounds(1050, 133, 179, 240);
		add(panel_1_2_2);
		
		JLabel lblNewLabel_32_1_2_2 = new JLabel("");
		lblNewLabel_32_1_2_2.setIcon(new ImageIcon(Bebidas.class.getResource("/Imagenes/cafe frapucchino (1).jpg")));
		lblNewLabel_32_1_2_2.setBounds(0, 0, 184, 110);
		panel_1_2_2.add(lblNewLabel_32_1_2_2);
		
		JLabel lblNewLabel_12_1_2_2 = new JLabel("\r\nPrecio");
		lblNewLabel_12_1_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_1_2_2.setBounds(10, 150, 75, 14);
		panel_1_2_2.add(lblNewLabel_12_1_2_2);
		
		JLabel lblNewLabel_19_2_2_2 = new JLabel("Cantidad ");
		lblNewLabel_19_2_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_2_2_2.setBounds(7, 175, 88, 24);
		panel_1_2_2.add(lblNewLabel_19_2_2_2);
		
		JLabel lblNewLabel_19_1_1_2_2 = new JLabel("Seleccionar");
		lblNewLabel_19_1_1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1_1_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1_1_2_2.setBounds(10, 205, 98, 24);
		panel_1_2_2.add(lblNewLabel_19_1_1_2_2);
		
		JCheckBox chckbxNewCheckBox_1_2_2 = new JCheckBox("");
		chckbxNewCheckBox_1_2_2.setBounds(114, 208, 41, 23);
		panel_1_2_2.add(chckbxNewCheckBox_1_2_2);
		
		JLabel lblNewLabel_18 = new JLabel("cafe frapucchino");
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_18.setBounds(10, 125, 132, 14);
		panel_1_2_2.add(lblNewLabel_18);
		
		JLabel lblNewLabel_30 = new JLabel("$45");
		lblNewLabel_30.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_30.setBounds(95, 150, 49, 14);
		panel_1_2_2.add(lblNewLabel_30);
		
		JSpinner spinner5 = new JSpinner();
		spinner5.setBounds(101, 177, 41, 24);
		panel_1_2_2.add(spinner5);
		
		JPanel panel_1_2_2_1_2 = new JPanel();
		panel_1_2_2_1_2.setLayout(null);
		panel_1_2_2_1_2.setBounds(297, 408, 179, 240);
		add(panel_1_2_2_1_2);
		
		JLabel lblNewLabel_32_1_2_2_1_2 = new JLabel("");
		lblNewLabel_32_1_2_2_1_2.setIcon(new ImageIcon(Bebidas.class.getResource("/Imagenes/Malteda chocolate (1).jpg")));
		lblNewLabel_32_1_2_2_1_2.setBounds(0, 0, 184, 110);
		panel_1_2_2_1_2.add(lblNewLabel_32_1_2_2_1_2);
		
		JLabel lblNewLabel_12_1_2_2_1_2 = new JLabel("\r\nPrecio");
		lblNewLabel_12_1_2_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_1_2_2_1_2.setBounds(10, 150, 75, 14);
		panel_1_2_2_1_2.add(lblNewLabel_12_1_2_2_1_2);
		
		JLabel lblNewLabel_19_2_2_2_1_2 = new JLabel("Cantidad ");
		lblNewLabel_19_2_2_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_2_2_2_1_2.setBounds(7, 175, 88, 24);
		panel_1_2_2_1_2.add(lblNewLabel_19_2_2_2_1_2);
		
		JLabel lblNewLabel_19_1_1_2_2_1_2 = new JLabel("Seleccionar");
		lblNewLabel_19_1_1_2_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1_1_2_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1_1_2_2_1_2.setBounds(10, 205, 98, 24);
		panel_1_2_2_1_2.add(lblNewLabel_19_1_1_2_2_1_2);
		
		JCheckBox CheckBoxMaltedachocolate = new JCheckBox("");
		CheckBoxMaltedachocolate.setBounds(114, 208, 41, 23);
		panel_1_2_2_1_2.add(CheckBoxMaltedachocolate);
		
		JLabel lblNewLabel_28_1_1 = new JLabel("$35\r\n");
		lblNewLabel_28_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_28_1_1.setBounds(78, 150, 49, 14);
		panel_1_2_2_1_2.add(lblNewLabel_28_1_1);
		
		JLabel lblNewLabel_26 = new JLabel("Malteda chocolate");
		lblNewLabel_26.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_26.setBounds(10, 125, 159, 14);
		panel_1_2_2_1_2.add(lblNewLabel_26);
		
		JSpinner spinner7 = new JSpinner();
		spinner7.setBounds(105, 177, 41, 24);
		panel_1_2_2_1_2.add(spinner7);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(536, 410, 184, 240);
		add(panel_1_2);
		
		JLabel lblNewLabel_12_1_2 = new JLabel("\r\nPrecio");
		lblNewLabel_12_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_1_2.setBounds(10, 150, 75, 14);
		panel_1_2.add(lblNewLabel_12_1_2);
		
		JLabel lblNewLabel_13_1_3 = new JLabel("$40");
		lblNewLabel_13_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_13_1_3.setBounds(74, 150, 49, 14);
		panel_1_2.add(lblNewLabel_13_1_3);
		
		JLabel lblNewLabel_19_2_2 = new JLabel("Cantidad ");
		lblNewLabel_19_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_2_2.setBounds(7, 175, 88, 24);
		panel_1_2.add(lblNewLabel_19_2_2);
		
		JLabel lblNewLabel_19_1_1_2 = new JLabel("Seleccionar");
		lblNewLabel_19_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1_1_2.setBounds(10, 205, 98, 24);
		panel_1_2.add(lblNewLabel_19_1_1_2);
		
		JCheckBox CheckBoxMalteadadevainilla = new JCheckBox("");
		CheckBoxMalteadadevainilla.setBounds(114, 208, 41, 23);
		panel_1_2.add(CheckBoxMalteadadevainilla);
		
		JLabel lblNewLabel_17 = new JLabel("Malteada de vainilla");
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_17.setBounds(10, 121, 164, 14);
		panel_1_2.add(lblNewLabel_17);
		
		JLabel lblNewLabel_32_1_2 = new JLabel("");
		lblNewLabel_32_1_2.setIcon(new ImageIcon(Bebidas.class.getResource("/Imagenes/Malteada de vainilla (1).jpg")));
		lblNewLabel_32_1_2.setBounds(0, 0, 184, 110);
		panel_1_2.add(lblNewLabel_32_1_2);
		
		JSpinner spinner8 = new JSpinner();
		spinner8.setBounds(94, 175, 41, 24);
		panel_1_2.add(spinner8);
		
		JPanel panel_1_2_2_1_2_2 = new JPanel();
		panel_1_2_2_1_2_2.setLayout(null);
		panel_1_2_2_1_2_2.setBounds(791, 415, 184, 234);
		add(panel_1_2_2_1_2_2);
		
		JLabel lblNewLabel_32_1_2_2_1_2_2 = new JLabel("");
		lblNewLabel_32_1_2_2_1_2_2.setIcon(new ImageIcon(Bebidas.class.getResource("/Imagenes/Maltea fresa (1).jpg")));
		lblNewLabel_32_1_2_2_1_2_2.setBounds(-1, -28, 184, 147);
		panel_1_2_2_1_2_2.add(lblNewLabel_32_1_2_2_1_2_2);
		
		JLabel lblNewLabel_12_1_2_2_1_2_2 = new JLabel("\r\nPrecio");
		lblNewLabel_12_1_2_2_1_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_1_2_2_1_2_2.setBounds(10, 150, 75, 14);
		panel_1_2_2_1_2_2.add(lblNewLabel_12_1_2_2_1_2_2);
		
		JLabel lblNewLabel_19_2_2_2_1_2_2 = new JLabel("Cantidad ");
		lblNewLabel_19_2_2_2_1_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_2_2_2_1_2_2.setBounds(7, 175, 88, 24);
		panel_1_2_2_1_2_2.add(lblNewLabel_19_2_2_2_1_2_2);
		
		JLabel lblNewLabel_19_1_1_2_2_1_2_2 = new JLabel("Seleccionar");
		lblNewLabel_19_1_1_2_2_1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1_1_2_2_1_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1_1_2_2_1_2_2.setBounds(10, 205, 98, 24);
		panel_1_2_2_1_2_2.add(lblNewLabel_19_1_1_2_2_1_2_2);
		
		JCheckBox CheckBoxMalteafresa = new JCheckBox("");
		CheckBoxMalteafresa.setBounds(114, 208, 41, 23);
		panel_1_2_2_1_2_2.add(CheckBoxMalteafresa);
		
		JLabel lblNewLabel_28_1_1_2 = new JLabel("$35\r\n");
		lblNewLabel_28_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_28_1_1_2.setBounds(95, 150, 49, 14);
		panel_1_2_2_1_2_2.add(lblNewLabel_28_1_1_2);
		
		JLabel lblNewLabel_25 = new JLabel("Maltea fresa");
		lblNewLabel_25.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_25.setBounds(10, 125, 105, 14);
		panel_1_2_2_1_2_2.add(lblNewLabel_25);
		
		JSpinner spinner9 = new JSpinner();
		spinner9.setBounds(103, 170, 41, 24);
		panel_1_2_2_1_2_2.add(spinner9);
		
		JPanel panel_1_2_2_1_2_3 = new JPanel();
		panel_1_2_2_1_2_3.setLayout(null);
		panel_1_2_2_1_2_3.setBounds(1054, 418, 179, 234);
		add(panel_1_2_2_1_2_3);
		
		JLabel lblNewLabel_32_1_2_2_1_2_3 = new JLabel("");
		lblNewLabel_32_1_2_2_1_2_3.setIcon(new ImageIcon(Bebidas.class.getResource("/Imagenes/Agua horchata (1).jpg")));
		lblNewLabel_32_1_2_2_1_2_3.setBounds(0, 0, 184, 110);
		panel_1_2_2_1_2_3.add(lblNewLabel_32_1_2_2_1_2_3);
		
		JLabel lblNewLabel_12_1_2_2_1_2_3 = new JLabel("\r\nPrecio");
		lblNewLabel_12_1_2_2_1_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_1_2_2_1_2_3.setBounds(10, 150, 75, 14);
		panel_1_2_2_1_2_3.add(lblNewLabel_12_1_2_2_1_2_3);
		
		JLabel lblNewLabel_19_2_2_2_1_2_3 = new JLabel("Cantidad ");
		lblNewLabel_19_2_2_2_1_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_2_2_2_1_2_3.setBounds(7, 175, 88, 24);
		panel_1_2_2_1_2_3.add(lblNewLabel_19_2_2_2_1_2_3);
		
		JSpinner spinner10 = new JSpinner();
		spinner10.setBounds(86, 177, 41, 24);
		panel_1_2_2_1_2_3.add(spinner10);
		
		JLabel lblNewLabel_19_1_1_2_2_1_2_3 = new JLabel("Seleccionar");
		lblNewLabel_19_1_1_2_2_1_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19_1_1_2_2_1_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_19_1_1_2_2_1_2_3.setBounds(10, 205, 98, 24);
		panel_1_2_2_1_2_3.add(lblNewLabel_19_1_1_2_2_1_2_3);
		
		JCheckBox CheckBoxAguahorchata = new JCheckBox("");
		CheckBoxAguahorchata.setBounds(114, 208, 41, 23);
		panel_1_2_2_1_2_3.add(CheckBoxAguahorchata);
		
		JLabel lblNewLabel_22 = new JLabel("Agua horchata");
		lblNewLabel_22.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_22.setBounds(10, 125, 115, 14);
		panel_1_2_2_1_2_3.add(lblNewLabel_22);
		
		JLabel lblNewLabel_31_1 = new JLabel("$20");
		lblNewLabel_31_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_31_1.setBounds(86, 150, 49, 14);
		panel_1_2_2_1_2_3.add(lblNewLabel_31_1);

	}
}
