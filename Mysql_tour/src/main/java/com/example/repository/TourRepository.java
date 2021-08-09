package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Tour;

@Repository
public interface TourRepository extends JpaRepository<Tour, String> {

	Tour findByName(String name);
	
	List<Tour> findByRegion(String region);

	List<Tour> findAllByNameIgnoreCaseContaining(String search);
	
	List<Tour> findByNameIgnoreCase(String search);

	void deleteByName(String name);

	List<Tour> findByNameLike(String search);








}