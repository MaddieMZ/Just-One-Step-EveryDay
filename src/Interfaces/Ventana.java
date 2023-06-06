package Interfaces;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame implements Interfaz{


	private static final long serialVersionUID = 1L;
	private Container panelActual;
	private int contenidoactual;
	ImageIcon icono= new ImageIcon("src/icono.png");

	private MainMenu menuPrincipal;
	public Ventana(){
		menuPrincipal= new MainMenu(this);
		getContentPane().add(menuPrincipal);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ventana.class.getResource("/Imagenes_Variadas/icono.png")));
		setTitle("Just One Step Everyday");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,700,740);
		setLocationRelativeTo(null);

		setVisible(true);
	}
	
	public void cambiarPantalla(int pantalla) {
		panelActual=getContentPane();
		panelActual.removeAll();
		
		switch(pantalla) {
			case 1:
				panelActual.add(new MainMenu(this));
				break;
				
			case 2:
				panelActual.add(new Seleccion(this));
				break;
			
			case 3:
				panelActual.add(new Contenido(this));
				break;
				
			case 4:
				panelActual.add(new Descanso(this));
				break;
				
		}
		invalidate();
		repaint();
		
	}

	@Override
	public void PantallaElegida(int pantalla) {
		cambiarPantalla(pantalla);
		//System.out.println(pantalla);
	}
	
	@Override
	public void setContenido(int contenido) {
		this.contenidoactual=contenido;
	}
	
	@Override
	public int getContenido() {
		return contenidoactual;
	}
}
