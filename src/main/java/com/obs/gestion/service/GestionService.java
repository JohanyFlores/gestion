package com.obs.gestion.service;


import java.util.List;

import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import com.obs.gestion.models.GenericResponse;
import com.obs.gestion.models.Usuarios;


public interface GestionService {
	
	GenericResponse<List<Usuarios>> consultaUsuarios()
	          throws HttpServerErrorException,  HttpClientErrorException;
	
	GenericResponse<String> registroUsuario (Usuarios usuario)
    throws HttpServerErrorException,  HttpClientErrorException;
	
	GenericResponse<String> eliminaUsuario()
		    throws HttpServerErrorException,  HttpClientErrorException;

}
