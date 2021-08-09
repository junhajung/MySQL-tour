package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Naver_guide;
@Repository
public interface NaverGuideRepository extends JpaRepository<Naver_guide, String>{

	Naver_guide findByTitle(String title);
}
