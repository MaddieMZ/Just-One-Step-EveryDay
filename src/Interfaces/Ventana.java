package Interfaces;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Ventana extends JFrame implements Interfaz{

	private static final long serialVersionUID = 2530166013499750774L;
	
	private Container panelActual;
	private int contenidoactual;
	private int ejActual=1;
	private boolean debugMode;
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
			
			case 5:
				panelActual.add(new Entrenamiento(this));
				
			case 7:
				panelActual.add(new Tutorial(this));
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
	
	@Override
	public int getEjActual() {
		return ejActual;
	}
	
	@Override
	public void reiniciarEjActual() {
		this.ejActual=1;
	}
	
	@Override
	public void aumentarEjActual() {
		this.ejActual++;
	}
	@Override
	public void reducirEjActual() {
		this.ejActual--;
	}
	@Override
	public String getSplashText() {
		String texto="";
		Random random= new Random();
		
		switch(random.nextInt(7)+1) {
		case 1:
			texto="¡No te rindas!";
			break;
			
		case 2:
			texto="¡Tu puedes!";
			break;
		
		case 3:
			texto="¡Sigue adelante!";
			break;
		
		case 4:
			texto= "¡SI SE PUEDE!";
			break;
		
		case 5:
			texto= "¡Confia en ti mism@!";
			break;
		
		case 6:
			texto= "¡Supera tus límites";
			break;
		
		case 7:
			texto= "Te he visto lograr esto...";
			break;
			
		default:
			throw new IllegalArgumentException("Mal número aleatorio XD");
		}
		return texto;
	}

	@Override
	public void activarDebug() {
		debugMode=true;		
	}

	@Override
	public void desactivarDebug() {
		debugMode=false;
		
	}
	@Override
	public boolean isDebugActive() {
		return debugMode;
	}

}
