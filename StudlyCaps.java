package com.sg.alternate.caps.in.string;

import java.util.Scanner;

public class StudlyCaps {

	public void convertTextToStudlyCaps() {
		String text, convertedText = "";
		int ascii;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text to be converted: ");
		text = sc.nextLine();
		
		for (int i = 0; i < text.length(); i++) {

			ascii = text.charAt(i);
			
			if (i % 2 != 0) {
				
				if (ascii >= 97 && ascii <= 122) {
					
					ascii -= 32;
					convertedText += (char) ascii;
					
				} else if (ascii >= 65 && ascii <= 90) {
					
					convertedText += (char) ascii;
					
				} else
					convertedText += (char) ascii;
			}

			if (i % 2 == 0) {
				if (ascii >= 65 && ascii <= 90) {
					
					ascii += 32;
					convertedText += (char) ascii;
					
				} else if (ascii >= 97 && ascii <= 122) {
					
					convertedText += (char) ascii;

				} else
					convertedText += (char) ascii;
			}
		}
		System.out.println(convertedText);
	}
	
	public static void main(String[] args) {
		System.out.println("ascii range for a-z --> 97 to 122\nAscii range for A-Z --> 65 to 90\nAscii range for 0-9 --> 48 to 57");
		StudlyCaps studlyCaps = new StudlyCaps();
		studlyCaps.convertTextToStudlyCaps();
	}

}
