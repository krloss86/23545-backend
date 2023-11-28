package ar.com.codoacodo.entity;
import java.time.LocalDate;

public class OradorMain {

	public static void main(String[] args) {
		// simular que creamos un objeto de la clase Orador
		// para grabar en la db 
		
		//instancio un objeto de la clase Orador
		//crear un orador a partir de la clase Orador
		Orador nuevoOrador = new Orador("carlos", "lopez", "email@email.com", "java", LocalDate.now());
		
		//mostrar por consola el nuevo orador
		System.out.println(nuevoOrador);
		
		//instancia de la clase orador "simulando" que viene desde la DB
		Orador nuevoFromDB = new Orador(1L,"carlos", "lopez", "email@email.com", "java", LocalDate.now());
		
		//un tipo de polimorfismo es la sobrecarga: en la misma clase tengo dos metodos o constructores  
		//con el mismo nombre pero con distintos parametros
		
		//nuevoOrador.id = 1L;//problema de encapsulamiento
		nuevoOrador.setNombre("pepe");
		
		//si quiero saber el nombre del orado
		//entonces implemento un getter
	}

}
