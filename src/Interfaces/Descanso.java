package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;
import Rutinas.*;
public class Descanso extends JPanel{
	private static final long serialVersionUID = -4076872020506648561L;
	private Font fuente1= new Font("Tahoma", Font.PLAIN, 24);
	private Font fuente2=new Font("Lucida Sans", Font.PLAIN, 24);
	
	JLabel imagenLabel;
	JLabel instruccionesLabel;
	JLabel lblPreparate;
	JLabel contadorLabel;
	JLabel progresoLabel;
	JLabel nombreEjercicio;
	JProgressBar barraTiempo;	
	Timer timer;
	Interfaz listen;
	public Descanso(Interfaz listener) {
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
		
		JLabel siguienteLabel = new JLabel("Siguiente ejercicio:");
		siguienteLabel.setHorizontalAlignment(SwingConstants.CENTER);
		siguienteLabel.setBounds(33, 95, 210, 60);
		siguienteLabel.setFont(fuente1);
		add(siguienteLabel);
		
		nombreEjercicio = new JLabel("Yuca con cuajada");
		nombreEjercicio.setForeground(Color.BLUE);
		nombreEjercicio.setFont(fuente2);
		nombreEjercicio.setBounds(33, 155, 450, 60);
		add(nombreEjercicio);
		
		lblPreparate = new JLabel("¡Prepárate!");
		if(listener.getEjActual()>1)
			lblPreparate.setText(listener.getSplashText());
		lblPreparate.setHorizontalAlignment(SwingConstants.CENTER);
		lblPreparate.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPreparate.setBounds(158, 35, 325, 60);
		add(lblPreparate);
		
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
		
		buildDescansoUwU(listener.getContenido(),listener.getEjActual());
		Ejercitarse();

		if(listen.isDebugActive()) {
			JButton avanzarEjercicio=new JButton("Siguiente Ejercicio");
			avanzarEjercicio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					timer.cancel();
					listener.PantallaElegida(Interfaz.ENTRENAMIENTO);
				}
			});
			avanzarEjercicio.setBounds(500, 650, 149, 33);
			add(avanzarEjercicio);	
		}
		if(listen.isDebugActive() & listener.getEjActual()>1) {
			JButton regresarEjercicio=new JButton("Ejercicio Anterior");
			regresarEjercicio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listener.reducirEjActual();
					listener.PantallaElegida(Interfaz.ENTRENAMIENTO);
					timer.cancel();
				}
			});
			regresarEjercicio.setBounds(10, 650, 149, 33);
			add(regresarEjercicio);
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
	    barraTiempo.setMaximum(10);
	    barraTiempo.setValue(0); // Set the initial value of the JProgressBar to 0
	    TimerTask task = new TimerTask() {
	        int counter = 11;

	        // barraTiempo.setValue(0);
	        @Override
	        public void run() {
	            contadorLabel.setText(String.valueOf(counter - 1));
	            barraTiempo.setValue(barraTiempo.getValue() + 1);
	            counter--;
	            System.out.println(counter);
	            	            	
	            	
	            if (counter == 0) {
	                timer.cancel();
	                listen.PantallaElegida(Interfaz.ENTRENAMIENTO);
	            }
	        }
	    };

	    timer.scheduleAtFixedRate(task, 0, 1000);
	}
}

