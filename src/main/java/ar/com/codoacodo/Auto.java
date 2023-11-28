package ar.com.codoacodo;

public class Auto {

	/*atributos*/
	String marca;
	String modelo;
	String color;
	Integer anio;//puedo usar int
	Boolean encendido;
	Float velocidad;
	Float velocidadMaxima;
	
	/*constructor*/	
	public Auto(
			String marca,
			String modelo,
			String color,
			Integer anio,
			Float velocidadMaxima
			) {
		/*this es un puntero que "apunta" a los atributos
		o metodos de la clase/objeto*/
		this.marca = marca;
		this.modelo= modelo;
		this.color = color;
		this.anio = anio;
		this.velocidadMaxima = velocidadMaxima;
		
		this.encendido = Boolean.FALSE;
		this.velocidad = 0f;
	}
	
	/*metodos*/
	void encender() {
		//este metodo cambia el estado de encendido
		if(!this.encendido) {
			this.encendido = Boolean.TRUE;
		}else {
			System.out.println("Ya esta encendido!");
		}
	}
	
	void apagar() {
		if(this.encendido) {
			this.encendido = Boolean.FALSE;
			this.velocidad = 0f;
		}else {
			System.out.println("NO se puede apagar 2 veces!");
		}
	}
	
	void acelerar() {
		if(this.encendido) {
			if(velocidad < velocidadMaxima) {
				this.velocidad++;
			}else {
				System.out.println("Llegaste a la velocidad maxima");
			}
		}else {
			System.out.println("Primero encende el auto para acelerar");
		}
	}
	
	void frenar() {
		if(this.encendido) {
			if(velocidad > 0) {
				this.velocidad--;
			}else {
				System.out.println("El auto llego a velocidad 0");
			}
		}else {
			System.out.println("Auto apagado");
		}
	}
	
	void frenarConGanas() {
		if(this.encendido) {
			while(this.velocidad > 0) {
				this.velocidad--;
			}
		}
	}
}
