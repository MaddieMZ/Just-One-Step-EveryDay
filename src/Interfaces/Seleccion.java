package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Seleccion extends JPanel {

	private static final long serialVersionUID = 5275715189222879173L;

	public Seleccion(Interfaz listener) {
		setBackground(new Color(249, 248, 246));

		setLayout(null);
		setBounds(0,0,700,740);
		
		JLabel EligeLabel = new JLabel("Elige una rutina de entrenamiento");
		EligeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		EligeLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		EligeLabel.setBounds(130, 11, 437, 50);
		add(EligeLabel);
		
		JLabel BrazosImagen = new JLabel();
		BrazosImagen.setBounds(56, 58, 150, 150);
		BrazosImagen.setIcon(new ImageIcon(Seleccion.class.getResource("/res/Imagenes_Seleccion/BrazosBoton.png")));
		add(BrazosImagen);
		
		ImageIcon info= (ImageIcon) UIManager.getIcon("Tree.expandedIcon");
		
		JButton BrazosInicio = new JButton("Iniciar");
		BrazosInicio.setFont(new Font("Roboto", Font.PLAIN, 14));
		BrazosInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.setContenido(Interfaz.BRAZOS);
				System.out.println(listener.getContenido());
				listener.PantallaElegida(Interfaz.DESCANSO);			
			}
		});
		
		BrazosInicio.setBounds(80, 261, 100, 42);
		add(BrazosInicio);
		
		JButton BrazosContenido = new JButton("Ver contenido");
		BrazosContenido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.setContenido(Interfaz.BRAZOS);
				System.out.println(listener.getContenido());
				listener.PantallaElegida(Interfaz.CONTENIDO_RUTINA);			
			}
		});
		BrazosContenido.setFont(new Font("Roboto", Font.PLAIN, 14));
		BrazosContenido.setBounds(56, 314, 150, 42);
		BrazosContenido.setIcon(info);
		add(BrazosContenido);
		
		JLabel PiernasImagen = new JLabel();
		PiernasImagen.setBounds(272, 58, 150, 150);
		PiernasImagen.setIcon(new ImageIcon(Seleccion.class.getResource("/res/Imagenes_Seleccion/PiernasBoton.png")));
		add(PiernasImagen);
		
		JButton PiernasInicio = new JButton("Iniciar");
		PiernasInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.setContenido(Interfaz.PIERNAS);
				System.out.println(listener.getContenido());
				listener.PantallaElegida(Interfaz.DESCANSO);			
			}
		});
		PiernasInicio.setFont(new Font("Roboto", Font.PLAIN, 14));
		PiernasInicio.setBounds(296, 261, 100, 42);
		add(PiernasInicio);
		
		JButton PiernasContenido = new JButton("Ver contenido");
		PiernasContenido.setFont(new Font("Roboto", Font.PLAIN, 14));
		PiernasContenido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.setContenido(Interfaz.PIERNAS);
				System.out.println(listener.getContenido());
				listener.PantallaElegida(Interfaz.CONTENIDO_RUTINA);
			}
		});
		PiernasContenido.setBounds(272, 314, 150, 42);
		PiernasContenido.setIcon(info);
		add(PiernasContenido);
		
		JLabel AbdomenImagen = new JLabel();
		AbdomenImagen.setBounds(479, 58, 150, 150);
		AbdomenImagen.setIcon(new ImageIcon(Seleccion.class.getResource("/res/Imagenes_Seleccion/AbdomenBoton.png")));
		add(AbdomenImagen);
		
		JButton AbdomenInicio = new JButton("Iniciar");
		AbdomenInicio.setFont(new Font("Roboto", Font.PLAIN, 14));
		AbdomenInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.setContenido(Interfaz.ABDOMEN);
				System.out.println(listener.getContenido());
				listener.PantallaElegida(Interfaz.DESCANSO);
			}
		});
		AbdomenInicio.setBounds(503, 261, 100, 42);
		add(AbdomenInicio);
		
		JButton AbdomenContenido = new JButton("Ver contenido");
		AbdomenContenido.setFont(new Font("Roboto", Font.PLAIN, 14));
		AbdomenContenido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.setContenido(Interfaz.ABDOMEN);
				System.out.println(listener.getContenido());
				listener.PantallaElegida(Interfaz.CONTENIDO_RUTINA);
			}
		});		
		AbdomenContenido.setBounds(479, 314, 150, 42);
		AbdomenContenido.setIcon(info);
		add(AbdomenContenido);
		
		JLabel GeneralImagen = new JLabel();
		GeneralImagen.setBounds(176, 380, 150, 150);
		GeneralImagen.setIcon(new ImageIcon(Seleccion.class.getResource("/res/Imagenes_Seleccion/GeneralBoton.png")));
		add(GeneralImagen);
		
		JButton GeneralInicio = new JButton("Iniciar");
		GeneralInicio.setFont(new Font("Roboto", Font.PLAIN, 14));
		GeneralInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.setContenido(Interfaz.GENERAL);
				System.out.println(listener.getContenido());
				listener.PantallaElegida(Interfaz.DESCANSO);
			}
		});
		GeneralInicio.setBounds(197, 581, 100, 42);
		add(GeneralInicio);
		
		JButton GeneralContenido = new JButton("Ver contenido");
		GeneralContenido.setFont(new Font("Roboto", Font.PLAIN, 14));
		GeneralContenido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.setContenido(Interfaz.GENERAL);
				System.out.println(listener.getContenido());
				listener.PantallaElegida(Interfaz.CONTENIDO_RUTINA);
			}
		});
		GeneralContenido.setBounds(176, 634, 150, 42);
		GeneralContenido.setIcon(info);
		add(GeneralContenido);
		
		JLabel EstiramientoImagen = new JLabel();
		EstiramientoImagen.setBounds(387, 380, 150, 150);
		EstiramientoImagen.setIcon(new ImageIcon(Seleccion.class.getResource("/res/Imagenes_Seleccion/EstiramientosBoton.png")));
		add(EstiramientoImagen);
		
		JButton EstiramientoInicio = new JButton("Iniciar");
		EstiramientoInicio.setFont(new Font("Roboto", Font.PLAIN, 14));
		EstiramientoInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.setContenido(Interfaz.ESTIRAMIENTOS);
				System.out.println(listener.getContenido());
				listener.PantallaElegida(Interfaz.DESCANSO);
			}
		});
		EstiramientoInicio.setBounds(411, 581, 100, 42);
		add(EstiramientoInicio);
		
		JButton EstiramientoContenido = new JButton("Ver contenido");
		EstiramientoContenido.setFont(new Font("Roboto", Font.PLAIN, 14));
		EstiramientoContenido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.setContenido(Interfaz.ESTIRAMIENTOS);
				System.out.println(listener.getContenido());
				listener.PantallaElegida(Interfaz.CONTENIDO_RUTINA);
			}
		});
		EstiramientoContenido.setBounds(387, 634, 150, 42);
		EstiramientoContenido.setIcon(info);
		add(EstiramientoContenido);
		
		JLabel BrazosDesc = new JLabel("<html>Usa el peso de tu cuerpo <br> para tonificar tus brazos</html>");
		BrazosDesc.setHorizontalAlignment(SwingConstants.CENTER);
		BrazosDesc.setFont(new Font("Dialog", Font.PLAIN, 13));
		BrazosDesc.setBounds(45, 208, 176, 42);
		add(BrazosDesc);
		
		JLabel PiernasDesc = new JLabel("<html>Fortalece y moldea las piernas <br> &ensp; &nbsp; con ejercicios isométricos</html>");
		PiernasDesc.setHorizontalAlignment(SwingConstants.CENTER);
		PiernasDesc.setFont(new Font("Dialog", Font.PLAIN, 13));
		PiernasDesc.setBounds(246, 208, 204, 42);
		add(PiernasDesc);
		
		JLabel AbdomenDesc = new JLabel("<html>Trabaja los músculos del núcleo <br> &emsp; &ensp;y fortalece el abdomen</html>");
		AbdomenDesc.setHorizontalAlignment(SwingConstants.CENTER);
		AbdomenDesc.setFont(new Font("Dialog", Font.PLAIN, 13));
		AbdomenDesc.setBounds(460, 208, 204, 42);
		add(AbdomenDesc);
		
		JLabel GeneralDesc = new JLabel("<html> &emsp; &ensp;Ejercita todo tu cuerpo sin<br> enfocarte en un área en específico</html>");
		GeneralDesc.setHorizontalAlignment(SwingConstants.CENTER);
		GeneralDesc.setFont(new Font("Dialog", Font.PLAIN, 13));
		GeneralDesc.setBounds(140, 528, 212, 42);
		add(GeneralDesc);
		
		JLabel EstiramientoDesc = new JLabel("<html>Aumenta el rango de movilidad <br> y mejora la elasticidad muscular</html>");
		EstiramientoDesc.setHorizontalAlignment(SwingConstants.CENTER);
		EstiramientoDesc.setFont(new Font("Dialog", Font.PLAIN, 13));
		EstiramientoDesc.setBounds(359, 528, 218, 42);
		add(EstiramientoDesc);
		
		ImageIcon regreso= (ImageIcon) UIManager.getIcon("FileChooser.homeFolderIcon");
		JButton Regresar = new JButton("Regresar");
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.PantallaElegida(Interfaz.MENU_PRINCIPAL);
			}
		});
		
		Regresar.setBounds(10, 656, 114, 33);
		Regresar.setIcon(regreso);
		add(Regresar);
		
		setVisible(true);
	}		
}
