package ar.com.codoacodo.interfaces;

public class ConsolaInformableImpl implements Informable {
	//atributos?
	private String atrx;
	
	//contructor propio!!!
	public ConsolaInformableImpl() {
		
	}
	
	//polimorfismo: sobrescribir
	public void informar() {
		System.out.println();
	}

	//metodos
	public String getAtrx() {
		return this.atrx;
	}
	public void setAtrx(String atrx) {
		this.atrx = atrx;
	}
}
