package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Stay;

public interface StayRepository extends JpaRepository<Stay, String>{
	
	
	List<Stay> findByKate(String kate);

	Stay findByName(String name);
	
	List<Stay> findAllByNameIgnoreCaseContaining(String search);
	
	
	int countByNameIgnoreCaseContaining(String kate);

	void deleteByName(String name);

}
