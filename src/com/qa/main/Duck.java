package com.qa.main;

import java.util.List;

import java.util.ArrayList;

public class Duck {
	
	public List<Duck> duckList = new ArrayList<>();
	
	private String name;
	private boolean isAMallard;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isAMallard() {
		return isAMallard;
	}
	public void setAMallard(boolean isAMallard) {
		this.isAMallard = isAMallard;
	}
	
	
	public void setDuckList(Duck input) {
		
		duckList.add(input);
		
	}
	 public void getDuckList() {
		 
			System.out.println(duckList);
		 
	 }
	 
	 public void searchDuckList(int input) {
		 
		 System.out.println(duckList.get(input));
		 
	 }
	 
	 public void streamDuckOutput() {
		 
		 duckList.stream().forEach( Duck -> System.out.println(Duck));
		 
	 }
	 
	@Override
	public String toString() {
		return "Duck [name=" + name + ", isAMallard=" + isAMallard + "]";
	}
	 
	/*
	public void searchByMallard(String inputName) {
		 
		 
		 for(Duck i : duckList) {
			 
			 String typedDuck = inputName;
			 boolean currentDuck = i.isAMallard();
			 
			 
			 if(typedDuck == "mallard" && currentDuck == true) {
				 
				 System.out.println(i);
				 
			 }
			 
		 }
		 
	 }
	 */
	
	public void printMallard() {
		 
		System.out.println("Printing out all mallard ducks!");
		 
		 for(Duck i : duckList) {
			 
			 boolean currentDuck = i.isAMallard();
			 
			 if(currentDuck == true) {
				 
				 System.out.println(i);
				 
			 }
			 
		 }
		 
	 }
	
	
	

}
