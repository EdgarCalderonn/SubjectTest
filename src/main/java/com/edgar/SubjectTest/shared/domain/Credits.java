package com.edgar.SubjectTest.shared.domain;

import com.edgar.SubjectTest.exceptions.CreditsException;

import lombok.Getter;

@Getter
public class Credits {
	
	private final Integer credits;
	
	
	public Credits(Integer value)
	{
		try
		{
			
			this.credits = value;
			
			
			if ( value < 0 || value > 4)
				throw new CreditsException();
				
			
			
		}
		
		
		catch(NullPointerException e)
		{
			throw new CreditsException();
		}
		
	}
	
	

}
