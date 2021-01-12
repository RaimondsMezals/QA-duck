package com.qa.main;

import java.util.List;

import java.util.ArrayList;
import java.util.Collections;

public class DuckManager {
	
	public List<Duck> duckList = new ArrayList<>();
	
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
	 
	 public void printMallard() {
		 
			System.out.println("Printing out all mallard ducks!");
			 
			 for(Duck i : duckList) {
				 
				 boolean currentDuck = i.isAMallard();
				 
				 if(currentDuck == true) {
					 
					 System.out.println(i);
					 
				 }
				 
			 }
			 
		 }
	 
	 public void printDuckListByName() {
		 
		 List<String> duckNameList = new ArrayList<>();
		 
		 for(Duck d : duckList) {
			 
			 duckNameList.add(d.getName());
			 
		 }
		 Collections.sort(duckNameList);
		 System.out.println(duckNameList);
		 
	 }
	 
	 
	
	
}
