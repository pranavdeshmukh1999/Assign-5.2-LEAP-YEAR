package com.LeapYear;

import java.util.Scanner;

public class AssignLeapYear {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
    	System.out.println("Write a Year to check if it's a leap year or not : ");
        int year = scan.nextInt();
        
//   ENSURE 4 DIGIT NUMBER OR NOT     
        
       if (year>=1000 && year<=9999) {
    	   
//  LOGIC FOR LEAP YEAR    	   

        	if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
        		
//   PRINT LEAP YEAR OR NOT
                System.out.println(year + " is a leap year.");
            }else{
                System.out.println(year + " is not a leap year.");
            }
			
		}
       
			 else {
				 
					System.out.println("SHOWING LEAP YEAR OR NOT !!! THANK YOU FOR VISIT");
					  
       }
	}
}
