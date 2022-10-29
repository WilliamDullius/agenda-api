package com.futurodev.agendaapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.futurodev.agendaapi.models.ContatoModel;
import com.futurodev.agendaapi.repository.ContatoRepository;

@Service
public class CadastroContatoService {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	public ContatoModel salvarContato(ContatoModel novoContato) {
		return contatoRepository.save(novoContato);
	}
	
	public void deletarContato(Long id) {
		contatoRepository.deleteById(id);
	}

}
