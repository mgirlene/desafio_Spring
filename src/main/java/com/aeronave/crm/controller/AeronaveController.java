package com.aeronave.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aeronave.crm.model.Aeronave;
import com.aeronave.crm.repository.AeronaveRepository;

@RestController
@RequestMapping("/api")
public class AeronaveController {
	
	@Autowired
	AeronaveRepository aeronaveRepository;
	
	@GetMapping("/aeronaves")
	public List<Aeronave>listar() {
		return aeronaveRepository.findAll();
	}
	
	@GetMapping("/aeronave/{marca}")
	public List<Aeronave> listarAeronaveMarca(@PathVariable(value="marca") String marca) {
		return aeronaveRepository.findByMarca(marca);
	}
	
	@GetMapping("/aeronaves/{id}")
	public Aeronave listarAeronaveId(@PathVariable(value="id") long id) {
		return aeronaveRepository.findById(id);
	}
	
	@PostMapping("/aeronaves")
	public Aeronave adicionar(@RequestBody Aeronave aeronave) {
		return aeronaveRepository.save(aeronave);	
	}
	
	@PutMapping("/aeronaves/{id}")
	public Aeronave updateAeronave(@RequestBody Aeronave aeronave) {
		return aeronaveRepository.save(aeronave);
	}
	
	@DeleteMapping("/aeronaves/{id}")
	public void deleteAeronaveId(@PathVariable(value="id") Long id) {
		aeronaveRepository.deleteById(id);
	}
}
