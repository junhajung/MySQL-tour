package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Instagram;
@Repository
public interface InstaRepository  extends JpaRepository<Instagram, String>{

}
