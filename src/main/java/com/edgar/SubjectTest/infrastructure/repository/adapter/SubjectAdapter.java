package com.edgar.SubjectTest.infrastructure.repository.adapter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edgar.SubjectTest.domain.model.Subject;
import com.edgar.SubjectTest.domain.service.SubjectService;
import com.edgar.SubjectTest.infrastructure.mapper.SubjectMapper;
import com.edgar.SubjectTest.infrastructure.repository.database.SubjectRepository;
import com.edgar.SubjectTest.shared.domain.Id;

@Service
public class SubjectAdapter implements SubjectService{
	
	@Autowired
	SubjectRepository subjectRepository;
	
	
	@Autowired
	SubjectMapper subjectMapper;

	@Override
	public Subject saveSubject(Subject subject) {
		// TODO Auto-generated method stub
		return subjectMapper.dtoDom(subjectRepository.save( subjectMapper.domDto(subject) ));
	}

	@Override
	public Subject getSubject(Id id) {
		// TODO Auto-generated method stub
		return subjectMapper.dtoDom(subjectRepository.findById(id.getId()).get());
	}

	@Override
	public List<Subject> getSubjects() {
		// TODO Auto-generated method stub
		return subjectMapper.listDtoDom(subjectRepository.findAll());
	}

	@Override
	public Subject updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		return subjectMapper.dtoDom(subjectRepository.save(subjectMapper.domDto(subject)));
	}

	@Override
	public void deleteSubject(Id id) {
		// TODO Auto-generated method stub
		subjectRepository.deleteById(id.getId());		
	}

}
