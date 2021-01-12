package com.qa.main;



public class Duck {
	

	
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
	
	
	
	 
	@Override
	public String toString() {
		return "Duck [name=" + name + ", isAMallard=" + isAMallard + "]";
	}
	 
	

}
