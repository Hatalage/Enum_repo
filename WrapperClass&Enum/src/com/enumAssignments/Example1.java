package com.enumAssignments;
//Create enum seasons { SPRING , SUMMER, AUTUMN } .
//In main method create enum variable for any of above enum constant and display its value.

import java.util.Scanner;

public class Example1 {
enum Seasons {
	SPRING, SUMMER, AUTUMN;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name of season: ");
	String ch=sc.next();
	
	Seasons s=Seasons.valueOf(ch.toUpperCase());
	switch(s)
	{
	case SPRING:
		System.out.println("Selected season is spring");
		break;
		
	case SUMMER:
		System.out.println("Selected season is summer");
		break;
		
	case AUTUMN:
		System.out.println("Selected season is autumn");
		break;
	}
}
}

