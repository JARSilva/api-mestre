package br.com.rpg.mestre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rpg.mestre.model.Party;

public interface PartyRepositoy extends JpaRepository<Party, Long> {

}
