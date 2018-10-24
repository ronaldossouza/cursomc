package com.ronaldo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ronaldo.domain.Cidade;
import com.ronaldo.repositories.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repo;

	public List<Cidade> findByEstado(Integer estadoId) {
		return repo.findCidades(estadoId);
	}
}
