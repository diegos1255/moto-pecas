package br.com.motopecas.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.motopecas.entity.Usuario;

@Repository
public class UsuarioDao {

	@PersistenceContext
    private EntityManager entityManager;

    public void persistir(Usuario entity) {
          this.entityManager.persist(entity);
    }

    public Usuario buscar(Long id) {
          return this.entityManager.find(Usuario.class, id);
    }

    public void remover(Usuario Usuario) {
          this.entityManager.remove(Usuario);
    }
    
    public void atualizar(Usuario Usuario){
          this.entityManager.merge(Usuario);
    }
	
}
