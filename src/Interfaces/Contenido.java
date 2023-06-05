package Interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Rutinas.*;
public class Contenido extends JPanel{

	private static final long serialVersionUID = 3982478999535429632L;
	JLabel[] imagenesEj;
	JLabel[] nombresEj;
	JLabel contLabel=new JLabel("");;
	public Contenido(Interfaz listener) {

		setBackground(new Color(249, 248, 246));
		setLayout(null);
		setBounds(0,0,700,740);
		
		imagenesEj= new JLabel[11];
		nombresEj= new JLabel[11];
		
		for(int i=0;i<imagenesEj.length;i++) {
			imagenesEj[i]=new JLabel("");

		}
		imagenesEj[0].setBounds(79,63,100,100);
		imagenesEj[1].setBounds(300,63,100,100);
		imagenesEj[2].setBounds(521,63,100,100);
		imagenesEj[3].setBounds(79,200,100,100);
		imagenesEj[4].setBounds(300,200,100,100);
		imagenesEj[5].setBounds(521,200,100,100);
		imagenesEj[6].setBounds(79,346,100,100);
		imagenesEj[7].setBounds(300,346,100,100);
		imagenesEj[8].setBounds(521,346,100,100);
		imagenesEj[9].setBounds(220,500,100,100);
		imagenesEj[10].setBounds(430,500,100,100);
		
		//imagenesEj[0].setIcon(new ImageIcon(Contenido.class.getResource("/res/Imagenes_Seleccion/BrazosBoton.png")));

		for(int i=0;i<nombresEj.length;i++) {
			nombresEj[i]=new JLabel("");	
		}
		nombresEj[0].setBounds(29,150,200,35);
		nombresEj[1].setBounds(250,150,200,35);
		nombresEj[2].setBounds(470,150,200,35);
		nombresEj[3].setBounds(29,300,200,35);
		nombresEj[4].setBounds(250,300,200,35);
		nombresEj[5].setBounds(470,300,200,35);
		nombresEj[6].setBounds(29,440,200,35);
		nombresEj[7].setBounds(250,440,200,35);
		nombresEj[8].setBounds(470,440,200,35);
		nombresEj[9].setBounds(160,600,200,35);
		nombresEj[10].setBounds(380,600,200,35);
		
		for(int i=0;i<nombresEj.length;i++) {
			nombresEj[i].setHorizontalAlignment(SwingConstants.CENTER);
			nombresEj[i].setFont(new Font("Dialog", Font.PLAIN, 13));
		}
		
		buildContenidoUwU(listener.getContenido());
		for(int i=0;i<11;i++) {
			add(imagenesEj[i]);
			add(nombresEj[i]);
		}
		
		JButton Regresar = new JButton("Regresar");
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.PantallaElegida(Interfaz.SELECCION_RUTINA);
			}
		});
		
		Regresar.setBounds(10, 656, 114, 33);
		add(Regresar);
		contLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		contLabel.setBounds(130, 11, 450, 50);
		add(contLabel);		
		setVisible(true);
	}
	
	private void buildContenidoUwU(int rutinaElegida) {
		switch(rutinaElegida) {
		case 1:
			Brazos b= new Brazos();
			//imagenesEj[0].setIcon(new ImageIcon(Contenido.class.getResource("/res/Imagenes_Seleccion/BrazosBoton.png")));
			//imagenesEj[0].setIcon(new ImageIcon(Contenido.class.getResource("/res/Imagenes_Ejercicios_Mini/Brazos/Brazos"+(0+1)+".png")));

			for(int i=0;i<11;i++) {
				imagenesEj[i].setIcon(b.getLista().get(i).getImagenChikita());
				nombresEj[i].setText(b.getLista().get(i).getId()+"."+(b.getLista().get(i).getNombre()));
			}
			contLabel.setText("Contenido de la rutina \"Brazos\"");
			break;
		
		case 2:
			Piernas p= new Piernas();
			for(int i=0;i<11;i++) {
				imagenesEj[i].setIcon(p.getLista().get(i).getImagenChikita());
				nombresEj[i].setText(p.getLista().get(i).getId()+"."+(p.getLista().get(i).getNombre()));
			}
			contLabel.setText("Contenido de la rutina \"Piernas\"");
			break;
		
		case 3:
			Abdomen a= new Abdomen();
			for(int i=0;i<11;i++) {
				imagenesEj[i].setIcon(a.getLista().get(i).getImagenChikita());
				nombresEj[i].setText(a.getLista().get(i).getId()+"."+(a.getLista().get(i).getNombre()));
			}
			contLabel.setText("Contenido de la rutina \"Abdomen\"");
			break;
			
		case 4:
			General g= new General();
			for(int i=0;i<11;i++) {
				imagenesEj[i].setIcon(g.getLista().get(i).getImagenChikita());
				nombresEj[i].setText(g.getLista().get(i).getId()+"."+(g.getLista().get(i).getNombre()));
			}
			contLabel.setText("Contenido de la rutina \"General\"");
			break;
		
		case 5:
			Estiramientos e= new Estiramientos();
			for(int i=0;i<11;i++) {
				imagenesEj[i].setIcon(e.getLista().get(i).getImagenChikita());
				nombresEj[i].setText(e.getLista().get(i).getId()+"."+(e.getLista().get(i).getNombre()));
			}
			contLabel.setText("Contenido de la rutina \"Estiramientos\"");
			break;			
		}
	}
}

