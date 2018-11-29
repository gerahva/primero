/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gera.primero;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author otros
 */
public interface RepoUsuario extends MongoRepository<Usuario, Integer>{
    
}
