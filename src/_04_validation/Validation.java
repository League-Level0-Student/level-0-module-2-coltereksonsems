//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();

		int randomNumber = randomMaker.nextInt(5);

		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 1) {
			System.out.print("you have nice eyes");
		} else if (randomNumber == 2) {
			System.out.print("lol");
		} else if (randomNumber == 3) {
			System.out.print("i like your shirt");
		} else if (randomNumber == 4) {
			System.out.print("you are nice");
		} else if (randomNumber == 5) {
			System.out.print("you are smart");
		} else if (randomNumber == 6) {
			System.out.print("i like your hair");
		} else if (randomNumber == 7) {
			System.out.print("you are cool"); 
		} else  if (randomNumber == 8) {
				System.out.print("i like your handwriting");
			} else if (randomNumber == 9) {
				System.out.print("you are good at noticing things");
			} else if (randomNumber == 10) {
				System.out.print("i think your essay was really good");
		}
		
		}
		
	}

// 2. Repeat all the code above 10 times

// 3. Find someone to test out your program. They will like it :)
