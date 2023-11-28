package ar.com.codoacodo;

public class MainAuto {

	public static void main(String[] args) {
		//crear un auto a partir de la clase Auto
		Auto clio = new Auto("renault",
				"clio",
				"azul",
				2020, 
				2f);
	
		//clio es un objeto de la clase Auto
		clio.encender();
		clio.acelerar();
		clio.acelerar();
//		clio.acelerar();
	}
}
