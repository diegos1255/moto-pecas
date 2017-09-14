package br.com.motopecas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import br.com.motopecas.entity.Usuario;

/**
 * 
 * @author diego
 *
 */
@Repository
@EnableTransactionManagement
public class UsuarioDao {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Metodo responsavel por salvar o usuario.
	 * @param entity
	 */
	public void persistir(Usuario entity) {
		this.entityManager.persist(entity);
	}

	/**
	 * Metodo responsavel por buscar um usuario por id.
	 * @param id
	 * @return
	 */
	public Usuario buscar(Long id) {
		return this.entityManager.find(Usuario.class, id);
	}

	/**
	 * Metodo responsavel por remover um usuario.
	 * @param Usuario
	 */
	public void remover(Usuario usuario) {
		Usuario u = this.entityManager.merge(usuario);
		this.entityManager.remove(u);
	}

	/**
	 * Metodo responsavel por atualizar um usuario.
	 * @param Usuario
	 */
	public void atualizar(Usuario Usuario){
		this.entityManager.merge(Usuario);
	}

	@SuppressWarnings("unchecked")
	public List<Usuario> listaUsuario () {
		return (List<Usuario>) this.entityManager.createNamedQuery("Usuario.findAll").getResultList();
	}


}
