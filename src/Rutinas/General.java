package Rutinas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import javax.swing.ImageIcon;

import Interfaces.Contenido;
import de.ralleytn.simple.json.*;
public class General extends Rutina{
	
	public General(){
		super();
	}
	
	protected void buildEjercicios(){
		
		JSONArray a=null; 
		try{
			try {
				a=new JSONArray(new FileReader("src/res/json/General.json"));
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		catch(JSONParseException exception) {
		exception.printStackTrace();
		}
		
		JSONObject ejactual;

		for(int i=0;i<11;i++) {
			Ejercicio e=new Ejercicio();
			ejactual= a.getObject(i);
			e.setId(i+1);
			e.setNombre(ejactual.getString("Nombre"));
			e.setInstrucciones(ejactual.getString("Descripcion"));
			e.setImagenGrandota(new ImageIcon(Contenido.class.getResource("/res/Imagenes_Ejercicios/General/General"+(i+1)+".png")));
			e.setImagenChikita(new ImageIcon(Contenido.class.getResource("/res/Imagenes_Ejercicios_Mini/General/General"+(i+1)+".png")));
			this.ejercicios.add(e);
			
		}
		for(int i=0;i<11;i++) {
		System.out.println(ejercicios.get(i));
		}
	}
}