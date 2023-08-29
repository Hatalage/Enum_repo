package com.demoPrograms;

public class WrapperClassDemo {
public static void main(String[] args) {
	Integer i=new Integer(10);
	Integer j=new Integer("1012");
	
	System.out.println("i:"+i);
	System.out.println("j:"+j);
	
	Double d=new Double(45.23);
	Double d1=new Double("45.23");
	
	System.out.println("d:"+d);
	System.out.println("d1:"+d1);
	
	Character ch=new Character('A');
	//Character ch1=new Character("ABC");
	//Character ch=new Character(12);
	System.out.println("ch:"+ch);
}
}
