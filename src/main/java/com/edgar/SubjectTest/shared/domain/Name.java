package com.edgar.SubjectTest.shared.domain;

import com.edgar.SubjectTest.exceptions.NameException;

import lombok.Getter;

@Getter
public class Name {
	
	private final String name;
	
	
	public Name(String value)
	{
		
		
		try
		{
			
			this.name = value;
			
			if ( !value.matches("[A-Z]"))
				throw new NameException();	
		}
		
		
		catch(NullPointerException e)
		{
			throw new NameException();
		}

		
		
	}
	
	


}
