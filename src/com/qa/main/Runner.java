package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Duck duck0 = new Duck();
		
		duck0.setName(("Domestic Duck"));
		duck0.setAMallard(true);
		
		Duck duck1 = new Duck();
		
		duck1.setName(("Swedish Yellow Duck"));
		duck1.setAMallard(true);
		
		Duck duck2 = new Duck();
		
		duck2.setName(("Aylesbury Duck"));
		duck2.setAMallard(true);
		
		Duck duck3 = new Duck();
		
		duck3.setName(("American Wigeon Duck"));
		duck3.setAMallard(false);
		
		Duck duck4 = new Duck();
		
		duck4.setName(("Northern Pintail Duck"));
		duck4.setAMallard(false);
		
		Duck duck5 = new Duck();
		
		duck5.setName(("Hooded Merganser Duck"));
		duck5.setAMallard(false);
		
		DuckManager dList = new DuckManager();
		
		dList.setDuckList(duck0);
		dList.setDuckList(duck1);
		dList.setDuckList(duck2);
		dList.setDuckList(duck3);
		dList.setDuckList(duck4);
		dList.setDuckList(duck5);
		
		dList.getDuckList();
		
		//dList.streamDuckOutput();
		
		dList.printMallard();
		
		dList.printDuckListByName();
		
		
	}

}
