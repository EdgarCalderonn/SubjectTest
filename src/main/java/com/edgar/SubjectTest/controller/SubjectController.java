package com.edgar.SubjectTest.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.edgar.SubjectTest.infrastructure.dto.SubjectDto;
import com.edgar.SubjectTest.infrastructure.repository.database.SubjectRepository;


@RestController
@RequestMapping("/subjects")
public class SubjectController {

	@Autowired
	SubjectRepository subjectRepository;
	
	@GetMapping
	public @ResponseBody Iterable<SubjectDto> getAllSubjects() {
		return subjectRepository.findAll();
	}
	
	


	

}
