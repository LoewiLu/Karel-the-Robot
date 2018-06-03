/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class GuessMyNumber extends ConsoleProgram {

	public void run() {	

		int answer = getHeight() % 100;
		println("I am thinking of a number between 0 and 99...");
		
		int guess = readInt("Enter a guess: ");
		
		while( guess !=answer) {
			if (guess >answer) {
				println("Your guess is too high");
			}
			else {
				println("Your guess is too low");		
			}
			 guess = readInt("Enter a guess: ");
		}
		
		println("Congrats you win");
		

	}

}
