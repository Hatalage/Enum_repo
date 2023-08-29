package com.enumAssignments;
//Create method in enum. Access variable and method in main method.

	enum Color {
	    RED("FF0000"), GREEN("00FF00"), BLUE("0000FF");

	    private String hexCode;

	    Color(String hexCode) {
	        this.hexCode = hexCode;
	    }

	    public String getHexCode() {
	        return hexCode;
	    }
	}

	public class Example3 {
	    public static void main(String[] args) {
	        Color c = Color.BLUE;
	        System.out.println(c.getHexCode()); 
	    }
	}

