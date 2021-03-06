package com.example.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.MyMap;
@Repository
public interface MapRepository extends JpaRepository<MyMap, String>{

	List<MyMap> findByUserid(String userid);

	List<MyMap> findAllByNameAndUserid(String name, String userid);

	@Transactional  //import javax.transaction.Transactional;
	void deleteByNameAndUserid(String name, String userid);
}
