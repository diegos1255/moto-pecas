package br.com.motopecas.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.motopecas.entity.Usuario;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	private Usuario usuario;
	
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/init", method=RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> init(){
		
		Map<String, Object> retorno = new HashMap<String, Object>();
		retorno.put("usuario", this.preencheUsuario());
		
		return new ResponseEntity<Map>(retorno, HttpStatus.OK);
	}
	
	

	/**
	 * Preenche usuario.
	 * @return
	 */
	private Usuario preencheUsuario() {
		
		this.usuario = new Usuario(1L, "Leonardo", "leonardo", "123", "123@2123.com");
		
		return this.usuario;
	}
	
	private Usuario deuCerto() {
		
		this.usuario = new Usuario (2L, "Neff" , "Yeak" , "123" , "ksoka");
		
		return this.usuario;
	}
	
	

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
