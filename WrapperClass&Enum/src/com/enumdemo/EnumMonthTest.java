package com.enumdemo;

import java.util.Scanner;

public class EnumMonthTest {
 enum Months {
	 JANUARY, FEBRUARY,MARCH,APRIL,MAY;
 }
 public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name of month: ");
	String choice=sc.next();
	
	Months m= Months.valueOf(choice.toUpperCase());
	switch(m)
	{
	case JANUARY:
		System.out.println("selected month is january");
		break;
	case FEBRUARY:
		System.out.println("selected month is february");
		break;
	case MARCH:
		System.out.println("selected month is march");
		break;
	case APRIL:
		System.out.println("selected month is april");
		break;
	case MAY:
		System.out.println("selected month is may");
		break;
	}
	sc.close();
	
}
}
