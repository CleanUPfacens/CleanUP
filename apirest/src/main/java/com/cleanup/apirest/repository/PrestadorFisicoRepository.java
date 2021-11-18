package com.cleanup.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleanup.apirest.models.PrestadorFisico;

public interface PrestadorFisicoRepository extends JpaRepository<PrestadorFisico, Long>{
	
	PrestadorFisico findById(long id);
	
}
