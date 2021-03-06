package com.example.repository;


import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.MyUsers;

@Repository
public interface UserRepository extends JpaRepository<MyUsers, String> {

	  
	  MyUsers findByUserid(String userid);

	  Boolean existsByUserid(String userid);

	  int deleteByUserid(String userid);

	  List<MyUsers> findAllBy(PageRequest pageable);

	  int countAllBy();

	  int countByUserid(String userid);
}