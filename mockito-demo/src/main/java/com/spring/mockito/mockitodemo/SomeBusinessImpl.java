package com.spring.mockito.mockitodemo;


public class SomeBusinessImpl
{
	
//Depenedency of businessimpl
private DataService dataservice;

public SomeBusinessImpl(DataService dataservice) 
{
	super();
	this.dataservice = dataservice;
}



int findthegreatest()
{
	int[] data = dataservice.retrivealldata();
	
	int greatest = Integer.MIN_VALUE;
	
	for(int value:data)
	{
		if(value > greatest)
		{
			greatest = value;
		}
	}
	return greatest;
}
}
