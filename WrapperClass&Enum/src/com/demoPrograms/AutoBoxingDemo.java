package com.demoPrograms;

public class AutoBoxingDemo {
public static void main(String[] args) {
	int num=20;
	Integer i=Integer.valueOf(num);
	System.out.println("i="+i);
	Integer j=num;
	System.out.println("j="+j);
	System.out.println(j);
}
}
