package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Naver_guide;

public interface NaverGuideRepository extends JpaRepository<Naver_guide, String>{

	Naver_guide findByTitle(String title);
}
