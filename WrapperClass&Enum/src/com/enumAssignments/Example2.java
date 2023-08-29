package com.enumAssignments;

import java.util.Scanner;

//Create instance variable in enum.
public class Example2 {
enum Flower {
	ROSE, LOTUS, JASMINE;
	
	private int petals;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of flower");
	String ch=sc.next();
	
	Flower f=Flower.valueOf(ch.toUpperCase());
	switch(f)
	{
	case ROSE:
		System.out.println("Selected flower is rose");
		System.out.print("It's petals are:");
		System.out.println(f.petals=6);
		break;
	
	case LOTUS:
		System.out.println("Selected flower is lotus");
		System.out.print("It's petals are:");
		System.out.println(f.petals=10);
		break;
		
	case JASMINE:
		System.out.println("Selcted flower is jasmine");
		System.out.print("It's petals are:");
		System.out.println(f.petals=5);
		break;
	}
}
}
