package com.demoPrograms;

public class EnumTest1 {
public enum Days {
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}
public static void main(String args[])
{
	System.out.println(Days.THURSDAY);
	System.out.println(Days.WEDNESDAY);
	
	//traversing the enum
	//values() method internally convert enum in arrays
	System.out.println("------enum----");
	for(Days d:Days.values()) {
	System.out.println(d);
	}
    
	 System.out.println("------valueOf----");
	 System.out.println("Value of Monday:"+Days.valueOf("MONDAY"));
	 System.out.println("Value of Monday:"+Days.valueOf("MONDAY").ordinal());
	 
	 System.out.println("------enum---");
	 for(Days d:Days.values())
	 {
		 System.out.println(d+"   :   "+d.ordinal());
	 }
}
}
