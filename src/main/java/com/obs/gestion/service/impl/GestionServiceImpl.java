package com.obs.gestion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import com.obs.gestion.logic.GestionLogic;
import com.obs.gestion.models.GenericResponse;
import com.obs.gestion.models.Usuarios;
import com.obs.gestion.service.GestionService;

@Component
public class GestionServiceImpl implements GestionService {
	
	@Autowired
	private GestionLogic logic;

	@Override
	public GenericResponse<List<Usuarios>> consultaUsuarios()
			throws HttpServerErrorException, HttpClientErrorException {
		GenericResponse<List<Usuarios>>  response = logic.consUsuario();
		return response;
	}

	@Override
	public GenericResponse<String> registroUsuario(Usuarios usuario) throws HttpServerErrorException, HttpClientErrorException {
		GenericResponse<String>  response = logic.registroUsuario(usuario);
		return response;
	}

	@Override
	public GenericResponse<String> eliminaUsuario() throws HttpServerErrorException, HttpClientErrorException {
		GenericResponse<String>  response = logic.eliminaUsuario();
		return response;
	}
	



}
