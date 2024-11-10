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

public class Comida extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Comida() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Menú comida\r\n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(-1, 3, 1282, 51);
		add(lblNewLabel_1);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegresar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnRegresar.setBackground(Color.GRAY);
		btnRegresar.setBounds(41, 71, 115, 24);
		add(btnRegresar);
		
		JButton btnRreiniciar = new JButton("Reiniciar ");
		btnRreiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnRreiniciar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnRreiniciar.setBackground(Color.GRAY);
		btnRreiniciar.setBounds(346, 71, 115, 24);
		add(btnRreiniciar);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnTotal.setBackground(Color.GRAY);
		btnTotal.setBounds(745, 71, 115, 24);
		add(btnTotal);
		
		JButton btnRecibo = new JButton("Recibo");
		btnRecibo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnRecibo.setBackground(Color.GRAY);
		btnRecibo.setBounds(1096, 71, 115, 24);
		add(btnRecibo);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(35, 135, 179, 240);
		add(panel);
		
		JLabel lblNewLabel_32 = new JLabel("");
		lblNewLabel_32.setIcon(new ImageIcon(Comida.class.getResource("/Imagenes/Sándwich de jamón (1).jpg")));
		lblNewLabel_32.setBounds(0, 0, 184, 110);
		panel.add(lblNewLabel_32);
		
		JLabel lblNewLabel_2 = new JLabel("Sándwich de jamón");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 116, 174, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_12 = new JLabel("\r\nPrecio");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12.setBounds(10, 150, 75, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("$60\r\n");
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
		
		JCheckBox CheckBoxSándwichdejamón = new JCheckBox("");
		CheckBoxSándwichdejamón.setBounds(114, 208, 41, 23);
		panel.add(CheckBoxSándwichdejamón);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(36, 403, 179, 240);
		add(panel_1);
		
		JLabel lblNewLabel_32_1 = new JLabel("");
		lblNewLabel_32_1.setIcon(new ImageIcon(Comida.class.getResource("/Imagenes/Panini de pavo (1).jpg")));
		lblNewLabel_32_1.setBounds(0, 0, 184, 110);
		panel_1.add(lblNewLabel_32_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Panini de pavo");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(10, 116, 159, 24);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_12_1 = new JLabel("\r\nPrecio");
		lblNewLabel_12_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_1.setBounds(10, 150, 75, 14);
		panel_1.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_13_1 = new JLabel("$80");
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
		
		JCheckBox CheckBoxPanini = new JCheckBox("");
		CheckBoxPanini.setBounds(114, 208, 41, 23);
		panel_1.add(CheckBoxPanini);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(292, 139, 179, 240);
		add(panel_7);
		
		JLabel lblNewLabel_32_7 = new JLabel("");
		lblNewLabel_32_7.setIcon(new ImageIcon(Comida.class.getResource("/Imagenes/Wrap de pollo (1).jpg")));
		lblNewLabel_32_7.setBounds(0, 0, 184, 110);
		panel_7.add(lblNewLabel_32_7);
		
		JLabel lblNewLabel_2_7 = new JLabel("Wrap de pollo");
		lblNewLabel_2_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_7.setBounds(10, 116, 159, 24);
		panel_7.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_12_7 = new JLabel("\r\nPrecio");
		lblNewLabel_12_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_7.setBounds(10, 150, 75, 14);
		panel_7.add(lblNewLabel_12_7);
		
		JLabel lblNewLabel_13_7 = new JLabel("$72");
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
		
		JCheckBox CheckBoxWrapdepollo = new JCheckBox("");
		CheckBoxWrapdepollo.setBounds(114, 208, 41, 23);
		panel_7.add(CheckBoxWrapdepollo);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBounds(544, 137, 179, 240);
		add(panel_8);
		
		JLabel lblNewLabel_32_8 = new JLabel("");
		lblNewLabel_32_8.setIcon(new ImageIcon(Comida.class.getResource("/Imagenes/Ensalada cesar (1).jpg")));
		lblNewLabel_32_8.setBounds(0, 0, 184, 110);
		panel_8.add(lblNewLabel_32_8);
		
		JLabel lblNewLabel_2_8 = new JLabel("Ensalada cesar");
		lblNewLabel_2_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_8.setBounds(10, 116, 145, 24);
		panel_8.add(lblNewLabel_2_8);
		
		JLabel lblNewLabel_12_8 = new JLabel("\r\nPrecio");
		lblNewLabel_12_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_8.setBounds(10, 150, 75, 14);
		panel_8.add(lblNewLabel_12_8);
		
		JLabel lblNewLabel_13_8 = new JLabel("$68");
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
		
		JCheckBox CheckBoxEnsala = new JCheckBox("");
		CheckBoxEnsala.setBounds(114, 208, 41, 23);
		panel_8.add(CheckBoxEnsala);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBounds(797, 139, 179, 240);
		add(panel_9);
		
		JLabel lblNewLabel_32_9 = new JLabel("");
		lblNewLabel_32_9.setIcon(new ImageIcon(Comida.class.getResource("/Imagenes/Bagel con queso (1).jpg")));
		lblNewLabel_32_9.setBounds(0, 0, 184, 110);
		panel_9.add(lblNewLabel_32_9);
		
		JLabel lblNewLabel_2_9 = new JLabel("Bagel con queso");
		lblNewLabel_2_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_9.setBounds(10, 116, 145, 24);
		panel_9.add(lblNewLabel_2_9);
		
		JLabel lblNewLabel_12_9 = new JLabel("\r\nPrecio");
		lblNewLabel_12_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_9.setBounds(10, 150, 75, 14);
		panel_9.add(lblNewLabel_12_9);
		
		JLabel lblNewLabel_13_9 = new JLabel("$45");
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
		
		JCheckBox CheckBoxBagel = new JCheckBox("");
		CheckBoxBagel.setBounds(114, 208, 41, 23);
		panel_9.add(CheckBoxBagel);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBounds(1053, 136, 179, 240);
		add(panel_10);
		
		JLabel lblNewLabel_32_10 = new JLabel("");
		lblNewLabel_32_10.setIcon(new ImageIcon(Comida.class.getResource("/Imagenes/Tostadas de aguacate (1).jpg")));
		lblNewLabel_32_10.setBounds(0, 0, 184, 110);
		panel_10.add(lblNewLabel_32_10);
		
		JLabel lblNewLabel_2_10 = new JLabel("Tostadas de aguacate ");
		lblNewLabel_2_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_10.setBounds(0, 115, 174, 24);
		panel_10.add(lblNewLabel_2_10);
		
		JLabel lblNewLabel_12_10 = new JLabel("\r\nPrecio");
		lblNewLabel_12_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_10.setBounds(10, 150, 75, 14);
		panel_10.add(lblNewLabel_12_10);
		
		JLabel lblNewLabel_13_10 = new JLabel("$50");
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
		
		JCheckBox cCheckBoxTosta = new JCheckBox("");
		cCheckBoxTosta.setBounds(114, 208, 41, 23);
		panel_10.add(cCheckBoxTosta);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(293, 403, 179, 240);
		add(panel_2);
		
		JLabel lblNewLabel_32_2 = new JLabel("");
		lblNewLabel_32_2.setIcon(new ImageIcon(Comida.class.getResource("/Imagenes/Quiche Loraine (1).jpg")));
		lblNewLabel_32_2.setBounds(0, 0, 184, 110);
		panel_2.add(lblNewLabel_32_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Quiche Loraine ");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(10, 116, 145, 24);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_12_2 = new JLabel("\r\nPrecio");
		lblNewLabel_12_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_2.setBounds(10, 150, 75, 14);
		panel_2.add(lblNewLabel_12_2);
		
		JLabel lblNewLabel_13_2 = new JLabel("$70");
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
		
		JCheckBox CheckBoxQuiche = new JCheckBox("");
		CheckBoxQuiche.setBounds(114, 208, 41, 23);
		panel_2.add(CheckBoxQuiche);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(542, 405, 179, 240);
		add(panel_3);
		
		JLabel lblNewLabel_32_3 = new JLabel("");
		lblNewLabel_32_3.setIcon(new ImageIcon(Comida.class.getResource("/Imagenes/Baguette con salami (1).jpg")));
		lblNewLabel_32_3.setBounds(0, 0, 184, 110);
		panel_3.add(lblNewLabel_32_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("Baguette con salami");
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_3.setBounds(10, 116, 159, 24);
		panel_3.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_12_3 = new JLabel("\r\nPrecio");
		lblNewLabel_12_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_3.setBounds(10, 150, 75, 14);
		panel_3.add(lblNewLabel_12_3);
		
		JLabel lblNewLabel_13_3 = new JLabel("$60");
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
		
		JCheckBox CheckBoxBaguette = new JCheckBox("");
		CheckBoxBaguette.setBounds(114, 208, 41, 23);
		panel_3.add(CheckBoxBaguette);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(799, 404, 179, 240);
		add(panel_4);
		
		JLabel lblNewLabel_32_4 = new JLabel("");
		lblNewLabel_32_4.setIcon(new ImageIcon(Comida.class.getResource("/Imagenes/Ensalada de pasta (1).jpg")));
		lblNewLabel_32_4.setBounds(0, 0, 184, 110);
		panel_4.add(lblNewLabel_32_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("Ensalada de pasta");
		lblNewLabel_2_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_4.setBounds(10, 116, 159, 24);
		panel_4.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_12_4 = new JLabel("\r\nPrecio");
		lblNewLabel_12_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_4.setBounds(10, 150, 75, 14);
		panel_4.add(lblNewLabel_12_4);
		
		JLabel lblNewLabel_13_4 = new JLabel("$60");
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
		
		JCheckBox CheckBoxEnsaladaP = new JCheckBox("");
		CheckBoxEnsaladaP.setBounds(114, 208, 41, 23);
		panel_4.add(CheckBoxEnsaladaP);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(1055, 407, 179, 240);
		add(panel_5);
		
		JLabel lblNewLabel_32_5 = new JLabel("");
		lblNewLabel_32_5.setIcon(new ImageIcon(Comida.class.getResource("/Imagenes/Empanada de carne (1).jpg")));
		lblNewLabel_32_5.setBounds(0, 0, 184, 110);
		panel_5.add(lblNewLabel_32_5);
		
		JLabel lblNewLabel_2_5 = new JLabel("Empanada de carne");
		lblNewLabel_2_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_5.setBounds(10, 116, 159, 24);
		panel_5.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_12_5 = new JLabel("\r\nPrecio");
		lblNewLabel_12_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12_5.setBounds(10, 150, 75, 14);
		panel_5.add(lblNewLabel_12_5);
		
		JLabel lblNewLabel_13_5 = new JLabel("$36");
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
		
		JCheckBox CheckBoxEmpa = new JCheckBox("");
		CheckBoxEmpa.setBounds(114, 208, 41, 23);
		panel_5.add(CheckBoxEmpa);

	}

}
