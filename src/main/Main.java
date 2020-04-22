package main;

import FRQ6.*;
import FRQ7.*;
import FRQ10.*;


public class Main {
	public static void main(String[] args) {
		LightSequence ls = new LightSequence("010001011010");
		ls.display();
		ls.insertSegment("010", 0);
		ls.display();
		
		
		UserName u = new UserName("User","name");
		u.getPossibleNames().forEach(System.out::println);
		
		ing.findIngs(new String[] {"whoaing","not","wow","definitelying"});
		
		Payroll pay = new Payroll(new int[] {10,3023,23,346,64,3,243,54,463,246,2},10.0,1.5);
		for(double i : pay.wages) {
			System.out.println(i);
		}
		
		Gcf.gcf(10,20);
		Gcf.reduceFraction(124, 4124);
		

	}

}
