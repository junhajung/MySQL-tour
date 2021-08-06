package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Instagram;

public interface InstaRepository  extends JpaRepository<Instagram, String>{

}
