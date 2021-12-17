package com.aeronave.crm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aeronave.crm.model.Aeronave;

@Repository
public interface AeronaveRepository extends JpaRepository<Aeronave, Long> {
	
	Aeronave findById(long id);
	List<Aeronave> findByMarca(String marca);

}
