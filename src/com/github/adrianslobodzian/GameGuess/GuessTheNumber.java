package com.github.adrianslobodzian.GameGuess;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {

		Random r = new Random();
		int randomNumber = r.nextInt(101);
		System.out.print("Zgadnij liczbę z przedziału 1 - 100: ");
		Scanner scan = new Scanner(System.in);
		int number = -1;
		while (number != randomNumber) {
			while (!scan.hasNextInt()) {
				scan.next();
				System.out.println("To nie liczba");
			}
			number = scan.nextInt();
			if (number > randomNumber) {
				System.out.print("Za dużo!");
			} else if (number < randomNumber) {
				System.out.print("Za mało!");
			}
		}
		System.out.println("Brawo!");

	}

}