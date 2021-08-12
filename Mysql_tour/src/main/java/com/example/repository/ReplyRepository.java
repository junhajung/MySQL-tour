package com.example.repository;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Reply;

@Repository
@Transactional
public interface ReplyRepository extends JpaRepository<Reply, String> {

	// SELECT COUNT(*) FROM USER WHERE USERID=#{USERID}
//	  int countByUseridIgnoreCaseContaining(String userid);
	  
	  int countByName(String name);
	  
//	  int countByUserid(int id);

	  Boolean existsByUserid(String userid);

//	  List<Reply> findByName(String name, org.springframework.data.domain.Sort sort);
	  
	  List<Reply> findByUserid(String userid);
	// 일괄 삭제
//	int deleteAllByIdIn(String[] id);
	
	// 일괄 select
//	List<Reply> findAllById(String[] id);

//	List<Reply> findByUserid(String id, PageRequest pageable);

//	Reply findByIndex(int index);

	List<Reply> findByNameOrderByCreateddateDesc(String name);

//	List<Reply> findByUseridOrderByCreateddateDesc(int id, PageRequest pageable);

	List<Reply> findByName(String name);


	void deleteByIndex(int index);

	List<Reply> findByIndex(int index);


}