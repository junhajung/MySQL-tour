package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Food;

public interface FoodRepository extends JpaRepository<Food, String>{
	
	Food findByName(String name);
	
	List<Food> findByRegion(String region);

	List<Food> findAllByNameIgnoreCaseContaining(String name);


	List<Food> findByMenuIgnoreCaseContaining(String menu);

	void deleteByName(String name);


	
}
