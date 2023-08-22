package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tutorial extends JPanel {

	private static final long serialVersionUID = -4095869779740273429L;
	
	public Tutorial(Interfaz listener) {
		setBounds(0,0,700,740);
		setVisible(true);
		setLayout(null);
		ImageIcon regreso= (ImageIcon) UIManager.getIcon("FileChooser.homeFolderIcon");
		JButton Regresar = new JButton("Regresar");
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.PantallaElegida(Interfaz.MENU_PRINCIPAL);
			}
		});	
		Regresar.setIcon(regreso);
		Regresar.setBounds(10, 656, 114, 33);
		add(Regresar);
		
		JLabel overlay = new JLabel("New label");
		overlay.setIcon(new ImageIcon(Tutorial.class.getResource("/Imagenes_Variadas/capturaTutorial.png")));
		overlay.setBounds(0, 0, 700, 740);
		add(overlay);
		
		
	}
}
