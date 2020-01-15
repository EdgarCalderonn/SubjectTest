package com.edgar.SubjectTest.infrastructure.dto;


import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor 
@Entity
@Table(name="subjects")
public class SubjectDto extends BaseEntity {

	private String name;
	private String code;
	private Integer credits;

}
