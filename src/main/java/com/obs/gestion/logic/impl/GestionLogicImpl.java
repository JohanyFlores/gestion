package com.obs.gestion.logic.impl;

import java.awt.datatransfer.Transferable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import com.obs.gestion.conn.UsuarioRepository;
import com.obs.gestion.logic.GestionLogic;
import com.obs.gestion.models.GenericResponse;
import com.obs.gestion.models.Usuarios;
@Component
public class GestionLogicImpl implements GestionLogic {
	
	@Autowired
	private UsuarioRepository repo;

	@Override
	public GenericResponse<List<Usuarios>> consUsuario() {
		GenericResponse<List<Usuarios>> response = new GenericResponse<List<Usuarios>>();
		
		try {
			
			List<Usuarios> usuarios = repo.findAll();
			response.setMensaje("Operacion exitosa");
			response.setResultado(usuarios);
		} catch (Exception e) {
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND, "No se encontró registro");
		}

		return response;
	}

	@Override
	public GenericResponse<String> registroUsuario(Usuarios usuario) throws HttpServerErrorException, HttpClientErrorException {
		GenericResponse<String> response = new GenericResponse<String>();
		try {
		    repo.save(usuario);
			response.setMensaje("Registro creado correctamente");
		} catch (Exception e) {
			throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR, "No se logro registrar");
		}
		return response;
	}

	GenericResponse<String> response = new GenericResponse<String>();

	@Override
	public GenericResponse<String> eliminaUsuario() throws HttpServerErrorException, HttpClientErrorException {
		GenericResponse<String> response = new GenericResponse<String>();
		try {
			 repo.deleteAll();
			 response.setMensaje("Registro eliminado correctamente");
		} catch (Exception e) {
			throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR, "No se logro eliminar");
		}
	   
		return response;
	}


}
