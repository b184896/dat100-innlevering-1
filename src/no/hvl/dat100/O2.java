package no.hvl.dat100;

import static java.lang.Integer.*;
import java.util.Scanner;

public class O2 {

	public static void main(String[] args) {
		
		for (int i = 0;i<10; i++) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Poengsum: ");
				int poengsum = parseInt(input.nextLine());
		if (poengsum>=0 && poengsum<=39) 
			System.out.println("Karakter: F"); 
			
		else if (poengsum>=40 && poengsum<=49)	
			System.out.println("Karakter: E");
			
		else if (poengsum>=50 && poengsum<=59)	
			System.out.println("Karakter: D");
		
		else if (poengsum>=60 && poengsum<=79)	
			System.out.println("Karakter: C");
			
		else if (poengsum>=80 && poengsum<=89)	
			System.out.println("Karakter: B");
			
		else if (poengsum>=90 && poengsum<=100)	
			System.out.println("Karakter: A");
			
			else {
			System.out.println("Ugyldig poengsum, prøv på nytt");
			i--; }
		
		}
		
}
}