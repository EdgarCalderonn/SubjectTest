package com.edgar.SubjectTest.shared.domain;

import com.edgar.SubjectTest.exceptions.CodeException;

import lombok.Getter;

@Getter
public class Code {
	
	private final String code;
	
	public Code(String value)
	{
		
		try
		{
			this.code = value;
				
			if (value.length() > 5 || value.length() > 10)
				throw new CodeException();

			
		}
		
		catch(NullPointerException e)
		{
			throw new CodeException();
		}
	}
}
