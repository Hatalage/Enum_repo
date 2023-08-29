package com.demoPrograms;

public class EnumDemo2 {
public static void main(String args[])
{
	for(EnumDemo d:EnumDemo.values())
	{
		System.out.println(d+" Number of days :"+d.val);
	}
}
}
