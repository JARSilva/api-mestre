package br.com.rpg.mestre.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PartyDTO {
	private Long codigoParty;
	private Long codigoMestre;
	private String nomeParty;
	private List<PersonagemDTO> participantes;
	private List<PersonagemDTO> npcs;
}
