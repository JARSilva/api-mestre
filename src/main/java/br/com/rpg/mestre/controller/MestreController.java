package br.com.rpg.mestre.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rpg.mestre.api.PersonagemClient;
import br.com.rpg.mestre.dto.AdicionaSkillDto;

@RestController
@RequestMapping("/mestre")
public class MestreController {

    @Autowired
    private PersonagemClient client;
    
    @PostMapping("enviaSkill")
    public void enviaModificacao(@RequestBody @Valid AdicionaSkillDto dto) {
        client.adicionaSkill(dto);
    }
}
