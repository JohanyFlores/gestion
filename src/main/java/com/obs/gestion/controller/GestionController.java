package com.obs.gestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import com.obs.gestion.conn.UsuarioRepository;
import com.obs.gestion.models.GenericResponse;
import com.obs.gestion.models.Usuarios;
import com.obs.gestion.service.GestionService;






@RestController
@RequestMapping("/usuarios")
public class GestionController {
	
	@Autowired
	private GestionService serv;
	

	
	@GetMapping(value = "/busquedas")
	public ResponseEntity<GenericResponse<List<Usuarios>>> consultaUsuario()
			throws HttpServerErrorException,  SecurityException ,HttpClientErrorException{
		return new ResponseEntity<GenericResponse<List<Usuarios>>>(serv.consultaUsuarios(), HttpStatus.OK);
	}
	
	@PostMapping(value = "/registro")
	public ResponseEntity<GenericResponse<String>> registroUsuario(@RequestBody Usuarios usuario)
			throws HttpServerErrorException,  SecurityException ,HttpClientErrorException{
		return new ResponseEntity<GenericResponse<String>>(serv.registroUsuario(usuario), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/elimina")
	public ResponseEntity<GenericResponse<String>> eliminaUsuario()
			throws HttpServerErrorException,  SecurityException ,HttpClientErrorException{

		return new ResponseEntity<GenericResponse<String>>(serv.eliminaUsuario(), HttpStatus.OK);
	}


}
