package com.cleanup.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cleanup.apirest.models.PrestadorFisico;
import com.cleanup.apirest.repository.PrestadorFisicoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST PrestadoresFisicos")
@CrossOrigin(origins="*")
public class PrestadorFisicoResource {
	
	@Autowired
	PrestadorFisicoRepository prestadorFisicoRepository;
	
	@GetMapping("/prestadoresfisicos")
	@ApiOperation(value="Retorna uma lista de prestadores físicos")
	public List<PrestadorFisico> listaPrestadorFisico(){
		return prestadorFisicoRepository.findAll();
	}
	
	@GetMapping("/prestadorfisico/{id}")
	@ApiOperation(value="Retorna um prestador físico único")
	public PrestadorFisico listaPrestadorFisicoUnico(@PathVariable(value="id") long id){
		return prestadorFisicoRepository.findById(id);
	}
	
	@PostMapping("/prestadorfisico")
	@ApiOperation(value="Salva um prestador físico")
	public PrestadorFisico salvaPrestadorFisico(@RequestBody PrestadorFisico prestadorFisico) {
		return prestadorFisicoRepository.save(prestadorFisico);
	}
	
	@DeleteMapping("/prestadorfisico")
	@ApiOperation(value="Deleta um prestador físico")
	public void deletaPrestadorFisico(@RequestBody PrestadorFisico prestadorFisico) {
		prestadorFisicoRepository.delete(prestadorFisico);
	}
	
	@PutMapping("/prestadorfisico")
	@ApiOperation(value="Atualiza um prestador físico")
	public PrestadorFisico atualizaPrestadorFisico(@RequestBody PrestadorFisico prestadorFisico) {
		return prestadorFisicoRepository.save(prestadorFisico);
	}
}
