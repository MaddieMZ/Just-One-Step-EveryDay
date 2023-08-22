package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;

import Rutinas.Abdomen;
import Rutinas.Brazos;
import Rutinas.Estiramientos;
import Rutinas.General;
import Rutinas.Piernas;
public class Entrenamiento extends JPanel{

	private static final long serialVersionUID = 4789090260381026994L;
	private Font fuente1= new Font("Tahoma", Font.PLAIN, 24);
	private Font fuente2=new Font("Lucida Sans", Font.PLAIN, 24);
	
	JLabel imagenLabel;
	JLabel instruccionesLabel;
	JLabel contadorLabel;
	JLabel progresoLabel;
	JLabel nombreEjercicio;
	JProgressBar barraTiempo;	
	Timer timer;
	Interfaz listen;
	private JLabel monitoXD;
	
	public Entrenamiento(Interfaz listener) {
		this.listen=listener;
		
		setBounds(0,0,700,740);
		setVisible(true);
		setBackground(new Color(249, 248, 246));
		setLayout(null);
		
		contadorLabel = new JLabel("");
		contadorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contadorLabel.setBounds(296, 540, 125, 20);
		contadorLabel.setFont(fuente1);
		add(contadorLabel);
		
		barraTiempo = new JProgressBar();
		barraTiempo.setBounds(189, 588, 344, 33);
	    barraTiempo.setMinimum(0);
	    barraTiempo.setMaximum(10);
	    barraTiempo.setValue(0);
		add(barraTiempo);
		barraTiempo.repaint();
		
		
		progresoLabel = new JLabel("Ejercicio 10/11");
		progresoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		progresoLabel.setBounds(493, 35, 172, 60);
		progresoLabel.setFont(fuente1);
		add(progresoLabel);
		
		nombreEjercicio = new JLabel("Yuca con cuajada");
		nombreEjercicio.setHorizontalAlignment(SwingConstants.CENTER);
		nombreEjercicio.setForeground(Color.BLUE);
		nombreEjercicio.setFont(fuente2);
		nombreEjercicio.setBounds(0, 155, 690, 60);
		add(nombreEjercicio);
		
		JButton Regresar = new JButton("Seleccionar rutina");
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.PantallaElegida(Interfaz.SELECCION_RUTINA);
				timer.cancel();
			}
		});
		Regresar.setBounds(10, 50, 149, 33);
		add(Regresar);
		
		imagenLabel = new JLabel("");
		imagenLabel.setBounds(56, 226, 275, 275);
		add(imagenLabel);
		
		instruccionesLabel = new JLabel("*Instrucciones*");
		instruccionesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		instruccionesLabel.setBounds(382, 265, 275, 183);
		
		add(instruccionesLabel);
		
		monitoXD = new JLabel("");
		monitoXD.setIcon(new ImageIcon(Entrenamiento.class.getResource("/Imagenes_Variadas/monoEjercitandose.gif")));
		monitoXD.setBounds(217, 11, 250, 155);
		add(monitoXD);
		
		buildDescansoUwU(listener.getContenido(),listener.getEjActual());
		Ejercitarse();
		
		if(listen.isDebugActive()) {
			JButton regresarEjercicio=new JButton("Regresar");
			regresarEjercicio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					listener.PantallaElegida(Interfaz.DESCANSO);
					timer.cancel();
				}
			});
			regresarEjercicio.setBounds(10, 650, 149, 33);
			add(regresarEjercicio);
			
			JButton avanzarEjercicio=new JButton("Siguiente Ejercicio");
			avanzarEjercicio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					timer.cancel();
	                if(listen.getEjActual()==11)
	                	listen.PantallaElegida(Interfaz.MENU_PRINCIPAL);
	                else {
					listener.aumentarEjActual();
					listener.PantallaElegida(Interfaz.DESCANSO);
	                }
				}
			});
			avanzarEjercicio.setBounds(500, 650, 149, 33);
			add(avanzarEjercicio);	
		}
		
	}
	
	public void buildDescansoUwU(int rutinaElegida,int ejActual){
		switch(rutinaElegida) {
		case 1:
			Brazos b = new Brazos();
			instruccionesLabel.setText(b.getLista().get(ejActual-1).getInstrucciones());
			imagenLabel.setIcon(b.getLista().get(ejActual-1).getImagenGrandota());
			nombreEjercicio.setText(b.getLista().get(ejActual-1).getNombre());
			progresoLabel.setText(String.valueOf(ejActual)+ "/11");
			break;
			
		case 2:
			Piernas p= new Piernas();
			instruccionesLabel.setText(p.getLista().get(ejActual-1).getInstrucciones());
			imagenLabel.setIcon(p.getLista().get(ejActual-1).getImagenGrandota());
			nombreEjercicio.setText(p.getLista().get(ejActual-1).getNombre());
			progresoLabel.setText(String.valueOf(ejActual)+ "/11");
			break;
			
		case 3:
			Abdomen a= new Abdomen();
			instruccionesLabel.setText(a.getLista().get(ejActual-1).getInstrucciones());
			imagenLabel.setIcon(a.getLista().get(ejActual-1).getImagenGrandota());
			nombreEjercicio.setText(a.getLista().get(ejActual-1).getNombre());
			progresoLabel.setText(String.valueOf(ejActual)+ "/11");			
			break;
		case 4:
			General g= new General();
			instruccionesLabel.setText(g.getLista().get(ejActual-1).getInstrucciones());
			imagenLabel.setIcon(g.getLista().get(ejActual-1).getImagenGrandota());
			nombreEjercicio.setText(g.getLista().get(ejActual-1).getNombre());
			progresoLabel.setText(String.valueOf(ejActual)+ "/11");			
			break;
		case 5:
			Estiramientos e= new Estiramientos();
			instruccionesLabel.setText(e.getLista().get(ejActual-1).getInstrucciones());
			imagenLabel.setIcon(e.getLista().get(ejActual-1).getImagenGrandota());
			nombreEjercicio.setText(e.getLista().get(ejActual-1).getNombre());
			progresoLabel.setText(String.valueOf(ejActual)+ "/11");				
			break;
		}
	}
	
	public void Ejercitarse() {
	    timer = new Timer();
	    barraTiempo.setMinimum(0);
	    barraTiempo.setMaximum(30);
	    barraTiempo.setValue(0); // Set the initial value of the JProgressBar to 0
	    TimerTask task = new TimerTask() {
	        int counter = 31;

	        // barraTiempo.setValue(0);
	        @Override
	        public void run() {
	            contadorLabel.setText(String.valueOf(counter - 1));
	            barraTiempo.setValue(barraTiempo.getValue() + 1);
	            counter--;
	            System.out.println(counter);
	            
 	
	            
	            if (counter == 0) {
	                timer.cancel();
	                if(listen.getEjActual()==11)
	                	listen.PantallaElegida(Interfaz.MENU_PRINCIPAL);
	                else {
	                listen.aumentarEjActual();
	                listen.PantallaElegida(Interfaz.DESCANSO);
	                //if(listen.getEjActual()>1)
	                }
	            }
	        }
	    };

	    timer.scheduleAtFixedRate(task, 0, 1000);
	}
}

