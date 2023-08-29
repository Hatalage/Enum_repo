package com.demoPrograms;

public enum EnumDemo {
January(31),FEBRUARY(28),MARCH(31),APRIL(30),MAY(31);
	
	int val;
	private EnumDemo(int val)
	{
		this.val=val;
	}
}
