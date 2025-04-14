package br.com.rpg.mestre.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "party")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Party {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoParty;
	private Long codigoMestre;
	private String nomeParty;
	
	@ElementCollection
	private List<Long> participantes;
	
	@ElementCollection
	private List<Long> npcs;
	
}
