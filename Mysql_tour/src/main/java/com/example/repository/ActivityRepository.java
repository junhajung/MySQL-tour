package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Activity;

public interface ActivityRepository extends JpaRepository<Activity, String>{

	Activity findByName(String name);


}
