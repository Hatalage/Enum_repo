package com.demoPrograms;

public class valueOfDemo {
public static void main(String[] args) {
	int num=10;
	Integer i=Integer.valueOf(num);
	System.out.println("i:"+i);
	
	Integer j=Integer.valueOf("45");
	System.out.println("j:"+j);
	
	Integer k=Integer.valueOf("101",2);
	System.out.println("k:"+k);
	
}
}
