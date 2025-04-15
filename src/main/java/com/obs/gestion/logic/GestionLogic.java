package com.obs.gestion.logic;



import java.util.List;

import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import com.obs.gestion.models.GenericResponse;
import com.obs.gestion.models.Usuarios;



public interface GestionLogic {
	
	GenericResponse<List<Usuarios>> consUsuario();
	GenericResponse<String> registroUsuario (Usuarios usuario)throws HttpServerErrorException,  HttpClientErrorException;
	GenericResponse<String> eliminaUsuario()  throws HttpServerErrorException,  HttpClientErrorException;
}
