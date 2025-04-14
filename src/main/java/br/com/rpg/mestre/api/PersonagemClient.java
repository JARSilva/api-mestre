package br.com.rpg.mestre.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.rpg.mestre.dto.AdicionaSkillDto;
import br.com.rpg.mestre.dto.PersonagemDTO;

@FeignClient("personagem-ms")
public interface PersonagemClient {
	
	@GetMapping(value = "/personagem/{id}")
	PersonagemDTO buscarPesonaagemPorId(@PathVariable("id") Long id);
	
	@PostMapping( value = "/personagem/adicionaSkill", consumes = "application/json")
    void adicionaSkill(AdicionaSkillDto personagem);
}
