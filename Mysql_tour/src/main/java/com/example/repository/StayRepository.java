package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Stay;
@Repository
public interface StayRepository extends JpaRepository<Stay, Integer>{
	
	
	List<Stay> findByKate(String kate);

	List<Stay> findAllByNameIgnoreCaseContaining(String search);

	
//	void deleteByName(String name);

}
