package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.TOP8;

public interface Top8Repository extends JpaRepository<TOP8, String>{

	TOP8 findByName(String name);

	TOP8 findByRank(String rank);


	
}
