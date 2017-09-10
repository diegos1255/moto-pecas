package br.com.motopecas.controller;

import java.util.HashMap;
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

@Controller
@RequestMapping("usuario")
@Transactional
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/init", method=RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> init(){

		Map<String, Object> retorno = new HashMap<String, Object>();

		return new ResponseEntity<Map>(retorno, HttpStatus.OK);
	}

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/salvar", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> salvar(@RequestBody Usuario usuario){
		
		this.usuarioService.salvar(usuario);
		
		Map<String, Object> retorno = new HashMap<String, Object>();
		retorno.put("msg", "Usuario " + usuario.getNome() + " cadastrado com sucesso.");
		
		return new ResponseEntity<Map>(retorno, HttpStatus.OK);
	}

}
