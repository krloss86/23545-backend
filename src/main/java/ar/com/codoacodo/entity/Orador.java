package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class Orador {
/*atributos que representan los campos de la tabla oradores en la db*/
	private Long id;
	private String nombre;
	private String apellido;
	private String mail;
	private String tema;
	private LocalDate fechaAlta;
	
	//usado cuando quiera enviar un orador a la db
	public Orador(String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.tema = tema;
		this.fechaAlta = fechaAlta;
	}
	//cuando quiera traer un orador desde la db
	public Orador(Long id, String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.tema = tema;
		this.fechaAlta = fechaAlta;
	}
	//anulo el constructor por defecto
	/*contructor*/
	//alt+shit+s
	
	//agregamos getters/setters
	//un setter es un metodo que permite modificar
	//el contenido de UN SOLO atributos
	public void setNombre(String nombre) {
		if(nombre != null) {
			this.nombre = nombre;
		}else {
			this.nombre = "N/D";
		}
	}
	public String getNombre() {
		return this.nombre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	/*polimorfismo: SOBREESCRITURA*/
	public String toString() {
		return "Orador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", tema="
				+ tema + ", fechaAlta=" + fechaAlta + "]";
	}
	//automaticamente creo los get/set
	//alt+shit+s
	
}
