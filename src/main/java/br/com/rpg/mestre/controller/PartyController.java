package br.com.rpg.mestre.controller;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rpg.mestre.dto.PartyDTO;
import br.com.rpg.mestre.service.PartyService;

@RestController
@RequestMapping("/party")
public class PartyController {
	
	@Autowired
    private PartyService service;
	
	@GetMapping("/{id}")
    public ResponseEntity<PartyDTO> buscarPartyPorId(@PathVariable @NotNull Long id) {
        PartyDTO dto = service.obterPorId(id);
        
        return ResponseEntity.ok(dto);
    }
}
