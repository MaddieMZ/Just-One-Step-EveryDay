package Rutinas;

import javax.swing.ImageIcon;

public class Ejercicio {
	
	private int Id;
	private String Nombre;
	private String Instrucciones;
	private ImageIcon imagenChikita;
	private ImageIcon imagenGrandota;
	
	public Ejercicio(int id,String nombre,String instrucciones,ImageIcon imagensita,ImageIcon imagensota) {
		this.Id=id;
		this.Nombre=nombre;
		this.Instrucciones=instrucciones;
		this.imagenChikita=imagensita;
		this.imagenGrandota=imagensota;
	}
	public Ejercicio() {

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getInstrucciones() {
		return Instrucciones;
	}

	public void setInstrucciones(String instrucciones) {
		Instrucciones = instrucciones;
	}

	public ImageIcon getImagenChikita() {
		return imagenChikita;
	}

	public void setImagenChikita(ImageIcon imagenChikita) {
		this.imagenChikita = imagenChikita;
	}

	public ImageIcon getImagenGrandota() {
		return imagenGrandota;
	}

	public void setImagenGrandota(ImageIcon imagenGrandota) {
		this.imagenGrandota = imagenGrandota;
	}
	
	@Override
	public String toString() {
		return "ID:"+this.Id+" Nombre:"+this.Nombre+ " Inst:"+this.Instrucciones;
	}
	
}
