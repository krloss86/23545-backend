package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.time.LocalDate;

import ar.com.codoacodo.entity.Orador;
import ar.com.codoacodo.repository.MySQLOradorRepository;
import ar.com.codoacodo.repository.OradorRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NuevoOradorController extends HttpServlet{
	//enviar por POST todos los datos desde el formulario en el front
	
	protected void doPost(
			HttpServletRequest request,//aca viene todos lo del front 
			HttpServletResponse response)  //aca va hacia el front
	throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");//<input name="nombre">
		String apellido = request.getParameter("apellido");
		String email = request.getParameter("email");
		String tema = request.getParameter("tema");
		
		//validaciones formato
		if(nombre == null || apellido == null || email == null || tema == null) {
			//response json de error
		}
		
		OradorRepository repository = new MySQLOradorRepository();
		repository.save(new Orador(nombre, apellido, email, tema, LocalDate.now()));
		
		//respondo al frontend un json ok
		System.out.println("ok");
	}
}
