package Interfaces;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JPanel {
	

	private static final long serialVersionUID = -4215390768537607328L;

	public MainMenu(Interfaz listener) {
		//this.listener=listener;
		
		JButton botonCreditos= new JButton("Créditos");
		botonCreditos.setForeground(Color.BLUE);
		botonCreditos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mostrarCreditos();
			}
		});
		botonCreditos.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		botonCreditos.setBounds(483,613,153,50);
		
		add(botonCreditos);
		setBackground(new Color(249, 248, 246));
		//ImageIcon logo= new ImageIcon("src/Imagenes_Ejercicios_Mini/Abdomen1.png");
		JLabel logolabel= new JLabel("");
		logolabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		logolabel.setIcon(new ImageIcon(MainMenu.class.getResource("/Imagenes_Variadas/logo.jpg")));
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
		
		JCheckBox modoDebugCheck = new JCheckBox("Modo Debug");
		if(listener.isDebugActive())
			modoDebugCheck.setSelected(true);
		modoDebugCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modoDebugCheck.isSelected())
					listener.activarDebug();
				
				else
					listener.desactivarDebug();
			}
		});
		modoDebugCheck.setBounds(513, 670, 97, 23);
		add(modoDebugCheck);
		
		JLabel nombreLabel = new JLabel("Just One Step Everyday");
		nombreLabel.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		nombreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nombreLabel.setBounds(207, 189, 261, 20);
		add(nombreLabel);
		
		JButton btnTutorial = new JButton("Tutorial");
		btnTutorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.PantallaElegida(Interfaz.TUTORIAL);
			}
		});
		btnTutorial.setForeground(Color.BLUE);
		btnTutorial.setFont(new Font("Sylfaen", Font.PLAIN, 30));
		btnTutorial.setBounds(225, 356, 228, 86);
		add(btnTutorial);
		setVisible(true);
	}
	
	public void mostrarCreditos() {
		JOptionPane.showMessageDialog(null,"<html><p>Diseño de Interfaces: JoseMZ<br>Assets: JoseMZ<br>Backend general: JoseMZ<br>Codificación JSON: Camilo<br>Quality Assurance (QA): Camilo <br><br>Jose Antonio Marin Zelaya 2021-0056U<br>Camilo Sebastian Villalobo Soza 2022-0291U<br>2M1-CO<br><br> Todos los derechos reservados</p></html>","Creditos c:",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/Imagenes_Variadas/monitoBailarin.gif"));

	}
}
