package com.obs.gestion.conn;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.obs.gestion.models.Usuarios;

public interface UsuarioRepository  extends MongoRepository<Usuarios, Integer>{

}
