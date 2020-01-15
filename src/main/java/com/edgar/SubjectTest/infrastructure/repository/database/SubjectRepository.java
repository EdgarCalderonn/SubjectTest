package com.edgar.SubjectTest.infrastructure.repository.database;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edgar.SubjectTest.infrastructure.dto.SubjectDto;

@Repository
public interface SubjectRepository extends CrudRepository<SubjectDto, String>
{

	
	//@Query("SELECT * FROM subjects where name=?")
	// SubjectDto findByName(@Param("name" String name))
}
