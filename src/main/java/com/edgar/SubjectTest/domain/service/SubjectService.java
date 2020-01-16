package com.edgar.SubjectTest.domain.service;

import java.util.List;

import com.edgar.SubjectTest.domain.model.Subject;
import com.edgar.SubjectTest.shared.domain.Id;

public interface SubjectService {

	public Subject saveSubject(Subject subject);

	public Subject getSubject(Id id);

	public List<Subject> getSubjects();

	public Subject updateSubject(Subject subject);

	public void deleteSubject(Id id);
}
