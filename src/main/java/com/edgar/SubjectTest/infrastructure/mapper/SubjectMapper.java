package com.edgar.SubjectTest.infrastructure.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.edgar.SubjectTest.infrastructure.dto.SubjectDto;
import com.edgar.SubjectTest.domain.model.Subject;
import com.edgar.SubjectTest.infrastructure.rest.SubjectRest;
import com.edgar.SubjectTest.shared.domain.Code;
import com.edgar.SubjectTest.shared.domain.Credits;
import com.edgar.SubjectTest.shared.domain.Id;
import com.edgar.SubjectTest.shared.domain.Name;
import com.edgar.SubjectTest.shared.infrastructure.mapper.MapperDto;
import com.edgar.SubjectTest.shared.infrastructure.mapper.MapperRest;

@Component
public class SubjectMapper implements MapperDto<SubjectDto, Subject>, MapperRest<SubjectRest, Subject> {

	@Override
	public SubjectRest domRest(Subject o) {
		// TODO Auto-generated method stub
		SubjectRest subject = new SubjectRest();
		
		subject.setId(o.getId().getId());
		subject.setCode(o.getCode().getCode());
		subject.setName(o.getName().getName());
		subject.setCredits(o.getCredits().getCredits());
		
		return subject;
	}

	@Override
	public Subject restDom(SubjectRest i) {
		// TODO Auto-generated method stub
		return Subject.of(new Id(i.getId()), new Code(i.getCode()),new Name(i.getName()) , new Credits(i.getCredits()));
	}

	@Override
	public SubjectDto domDto(Subject o) {
		// TODO Auto-generated method stub
		
		SubjectDto subject_dto = new SubjectDto();
		
		subject_dto.setName(o.getName().getName());
		subject_dto.setId(o.getId().getId());
		subject_dto.setCode(o.getCode().getCode());
		subject_dto.setCredits(o.getCredits().getCredits());
		
		
		
		return subject_dto;
	}

	@Override
	public Subject dtoDom(SubjectDto i) {
	
		return new Subject( new Id(i.getId()), new Code(i.getCode()), new Name(i.getName()), new Credits(i.getCredits()));
	}

}
