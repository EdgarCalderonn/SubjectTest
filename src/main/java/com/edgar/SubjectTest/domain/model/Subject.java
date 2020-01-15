package com.edgar.SubjectTest.domain.model;


import com.edgar.SubjectTest.shared.domain.Code;
import com.edgar.SubjectTest.shared.domain.Credits;
import com.edgar.SubjectTest.shared.domain.Id;
import com.edgar.SubjectTest.shared.domain.Name;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
public class Subject {

	private final Id id;
	private final Code code;
	private final Name name;
	private final Credits credits;
	
	
	public static Subject of (Id id,Code code, Name name, Credits credits)
	{
		return new Subject(id,code,name,credits);
	}
	
	
	
	}

