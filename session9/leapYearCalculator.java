package session9; //remove this if this class isn't in session9 package

import java.util.Scanner;

public class leapYearCalculator {
	
	//By : 1197050123
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create new scanner
		
		System.out.print("Input month (use number 1-12) : ");
		int month = input.nextInt(); //receive month from input
		System.out.print("Input year : ");
		int year = input.nextInt(); //receive year from input
		int days = 0; //initiate integer for days
		
		boolean leap = (year % 4 == 0 && (year %100 != 0 || year % 400 != 0)) ? true : false;
		boolean odd = (month % 2 == 0) ? false : true; //determine inputed month is even or odd
	
		switch(month) { //determine days in the month
		case 1: days = 31; break;
		case 2: days = (leap) ? days = 29 : 28; ; break; //if leap is true, days = 29 otherwise days = 28
		case 3: days = 31; break;
		case 4: days = 30; break;
		case 5: days = 31; break;
		case 6: days = 30; break;
		case 7: days = 31; break;
		case 8: days = 30; break;
		case 9: days = 31; break;
		case 10: days = 30; break;
		case 11: days = 31; break;
		case 12: days = 30; break;
		default: System.out.println("Invalid input."); System.exit(0); //input will be invalid if user inputed <1 and >12
		}
		show(days, month, year, leap, odd);
	}
	
	public static void show(int d, int m, int y, boolean info,  boolean par) {
		String text = (info) ? " is a leap year" : " isn't a leap year";
		String text2 = (par) ? " is an odd" : " isn't an odd";
		System.out.println(y + text
				+ "\n" + m + text2 + " and has " + d +" days in a month");
	}
}
