package com.edgar.SubjectTest.infrastructure.rest;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class SubjectRest {

	private String id;
	private String name;
	private String code;
	private Integer credits;
}
