package br.com.rpg.mestre.service;

import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;
import javax.validation.constraints.NotNull;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rpg.mestre.api.PersonagemClient;
import br.com.rpg.mestre.dto.PartyDTO;
import br.com.rpg.mestre.dto.PersonagemDTO;
import br.com.rpg.mestre.model.Party;
import br.com.rpg.mestre.repository.PartyRepositoy;

@Service
public class PartyService {
	
	@Autowired
    private PartyRepositoy repository;
	
	@Autowired
    private PersonagemClient client;
	
	@Autowired
    private ModelMapper modelMapper;

	public PartyDTO obterPorId(@NotNull Long id) {
		Party party = repository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException());
		PartyDTO dto = modelMapper.map(party, PartyDTO.class);
		dto.setParticipantes(
			    party.getParticipantes().stream()
			        .map(l -> {
			            String nome = client.buscarPesonaagemPorId(l).getCharacterName();
			            return new PersonagemDTO(l, nome);
			        })
			        .collect(Collectors.toList())
			);
		return dto;
	}
	
}
