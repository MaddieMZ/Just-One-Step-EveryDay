package Interfaces;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JPanel {
	

	private static final long serialVersionUID = -4215390768537607328L;

	//private Interfaz listener;
	
	public MainMenu(Interfaz listener) {
		//this.listener=listener;
		
		JButton ayuda= new JButton("Créditos");
		ayuda.setForeground(Color.BLUE);
		ayuda.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mostrarCreditos();
			}
		});
		ayuda.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		ayuda.setBounds(483,613,153,50);
		
		add(ayuda);
		setBackground(new Color(249, 248, 246));
		ImageIcon logo= new ImageIcon("src/logo.jpg");
		JLabel logolabel= new JLabel("");
		logolabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		logolabel.setIcon(logo);
		logolabel.setBounds(90, 50, 532, 155);
		add(logolabel);

		setLayout(null);
		
		JButton Comenzar = new JButton("Comenzar");
		Comenzar.setFont(new Font("Sylfaen", Font.PLAIN, 30));
		Comenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.PantallaElegida(Interfaz.SELECCION_RUTINA);
			}
		});
		Comenzar.setBounds(225, 245, 228, 86);
		add(Comenzar);

		setBounds(0,0,700,740);
		setVisible(true);
	}
	
	public void mostrarCreditos() {
		JOptionPane.showMessageDialog(null,"Todo lo hizo JoseMZ.\n Los demas no hiceron nada","Creditos c:",JOptionPane.INFORMATION_MESSAGE);

	}
}
