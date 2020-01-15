package com.edgar.SubjectTest.shared.domain;

import com.edgar.SubjectTest.exceptions.IdException;

import lombok.Getter;

@Getter
public class Id {

	private final String id;
	
	public Id(String value)
	{
		
		try
		{
			this.id = value;
			
			
			if (value.length() > 64 || value.length() < 32)
			{
				throw new IdException();
			}
			
		}
		
		catch(NullPointerException e)
		{
			throw new IdException();
		}
		
		
		
	}
	
	
}
