package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, String>{

	Activity findByName(String name);


}
