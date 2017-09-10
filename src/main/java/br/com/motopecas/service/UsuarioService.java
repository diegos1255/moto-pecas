package br.com.motopecas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.motopecas.dao.UsuarioDao;
import br.com.motopecas.entity.Usuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioDao usuarioDao;
	
	/**
	 * Metodo responsavel por salvar o usuario.
	 * @param usuario
	 */
	public void salvar(Usuario usuario) {
		
		this.usuarioDao.persistir(usuario);
		
	}
	
}
