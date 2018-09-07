package com.ronaldo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ronaldo.domain. Estado;

@Repository
public interface EstadoRepository extends JpaRepository< Estado, Integer> {
	

}
