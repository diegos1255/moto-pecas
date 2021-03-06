package br.com.motopecas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.motopecas.dao.UsuarioDao;
import br.com.motopecas.entity.Usuario;

/**
 * 
 * @author diego
 *
 */
@Service
@Transactional
public class UsuarioService {

	@Autowired
	private UsuarioDao usuarioDao;
	
	/**
	 * Metodo responsavel por salvar o usuario.
	 * @param usuario
	 */
	public Boolean salvar (Usuario usuario) {
		
		Boolean existeUsuario = this.usuarioDao.existeUsuario(usuario);
		
		if (existeUsuario) {
			return true;
		}
		
		this.usuarioDao.persistir(usuario);
		
		return false;
		
	}
	
	/**
	 * Metodo responsavel por buscar todos os usuarios.
	 * @return
	 */
	public List<Usuario> listaUsuarios () {
		
		return usuarioDao.listaUsuario();
		
	}
	
	/**
	 * Metodo responsavel por editar o usuario.
	 * @param usuario
	 */
	public void editarUsuario (Usuario usuario) {
		
		this.usuarioDao.atualizar(usuario);
		
	}
	
	/**
	 * Metodo responsavel por remover um usuario.
	 * @param usuario
	 */
	public void removerUsuario(Usuario usuario) {
		this.usuarioDao.remover(usuario);
	}
	
}
