package com.demoPrograms;

public class UnboxingDemo {
public static void main(String[] args) {
	 Integer i=new Integer(10);
	 int j=i.intValue();
	 System.out.println("j:"+j);
	 
	 int k=i;
	 System.out.println("k:"+k);
}
}
