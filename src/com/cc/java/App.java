package com.cc.java;



public class App {

	public static void main(String[] args) {
		Employee empl      = new Employee();
		Employee emplTwo   = new Employee();
		Employee emplThree = new Employee();

		empl.getInfo("#name");
		emplTwo.getInfo("#name");
		emplThree.getInfo("#name");
		

		
		
	}
	private static void outPut(String outStr) {
		System.out.println(outStr);
	}
	
	
	
}
