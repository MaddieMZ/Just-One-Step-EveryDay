package Interfaces;

	public interface Interfaz {
			void PantallaElegida(int pantalla);
			public static int MENU_PRINCIPAL=1;
			public static int SELECCION_RUTINA=2;
			public static int CONTENIDO_RUTINA=3;
			public static int DESCANSO=4;
			public static int ENTRENAMIENTO=5;
			public static int PANTALLA_FINAL=6;
			
			public static int BRAZOS=1;
			public static int PIERNAS=2;
			public static int ABDOMEN=3;
			public static int GENERAL=4;
			public static int ESTIRAMIENTOS=5;
			int getContenido();
			void setContenido(int contenido);
	}

