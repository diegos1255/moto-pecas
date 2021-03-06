package br.com.motopecas.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.motopecas.entity.Usuario;
import br.com.motopecas.service.UsuarioService;

/**
 * 
 * @author diego
 *
 */
@Controller
@RequestMapping("usuario")
@Transactional
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	/**
	 * Metodo responsavel por salvar o usuario.
	 * @param usuario
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/salvar", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> salvar(@RequestBody Usuario usuario){
		
		Map<String, Object> retorno = new HashMap<String, Object>();
		usuario.setDataCadastro(new Date());
		Boolean retornoSalvar = this.usuarioService.salvar(usuario);
		
		//se usuario existe, retorna erro.
		if (retornoSalvar) {
			retorno.put("erro", "Usu�rio " + usuario.getNome() + ", j� existe.");
			return new ResponseEntity<Map>(retorno, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		/*if (usuarioExiste) {
			retorno.put("erro", "Usu�rio " + usuario.getNome() + ", j� existe.");
			return new ResponseEntity<Map>(retorno, HttpStatus.INTERNAL_SERVER_ERROR);
		}*/
		
		retorno.put("msg", "Usu�rio " + usuario.getNome() + ", cadastrado com sucesso.");
		
		return new ResponseEntity<Map>(retorno, HttpStatus.OK);
	}

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/editarUsuario", method = RequestMethod.PUT, produces = "application/json")
	public ResponseEntity<?> editarUsuario(@RequestBody Usuario usuario){
		
		usuario.setDataCadastro(new Date());
		this.usuarioService.editarUsuario(usuario);
		
		Map<String, Object> retorno = new HashMap<String, Object>();
		retorno.put("msg", "Usu�rio " + usuario.getNome() + ", editado com sucesso.");
		
		return new ResponseEntity<Map>(retorno, HttpStatus.OK);
	}

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/removerUsuario", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> removerUsuario(@RequestBody Usuario usuario){
		
		this.usuarioService.removerUsuario(usuario);
		
		Map<String, Object> retorno = new HashMap<String, Object>();
		retorno.put("msg", "Usu�rio " + usuario.getNome() + ", removido com sucesso.");
		
		return new ResponseEntity<Map>(retorno, HttpStatus.OK);
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/listaUsuarios", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> listaUsuarios(){
		
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		listaUsuarios = this.usuarioService.listaUsuarios();
		
		Map<String, Object> retorno = new HashMap<String, Object>();
		
		retorno.put("usuarios", listaUsuarios);
		
		return new ResponseEntity<Map>(retorno, HttpStatus.OK);
	}

}
