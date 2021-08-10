package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long>{

	Activity findByName(String name);


}
