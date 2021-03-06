package br.com.motopecas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	
	/**
	 * Metodo responsavel por verificar se o usuario ja existe antes de cadastra-lo.
	 * @param usuario
	 * @return
	 */
	public Boolean existeUsuario(Usuario usuario) {
		
		Query query = (Query) this.entityManager.createNamedQuery("Usuario.validaUsuario");
		
		query.setParameter("login", usuario.getLogin());
		query.setParameter("email", usuario.getEmail());
		
		try {

			query.getSingleResult();
			
		} catch (NoResultException e) {
			return false;
		}
		
		return true;
	}
	


}
