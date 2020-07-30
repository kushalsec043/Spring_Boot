package com.spring.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Somebusinesstest
{
	
	@Test
	public void testfindgreatest() 
	{
		SomeBusinessImpl impl = new SomeBusinessImpl(new DataServicestub());
		
		int result = impl.findthegreatest();
		assertEquals(24, result);
	}
}
	class DataServicestub implements DataService
	{
		@Override
		public int[] retrivealldata()
		{
			return new int[] {24, 6, 15};
		}
		
	}