package com.obs.gestion.models;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Data;

@Data
@Document(collection = "usuarios")
public class Usuarios {
	
	private Integer idUsuario ;
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private String edad;
	
}
