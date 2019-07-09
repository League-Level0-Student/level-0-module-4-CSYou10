package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String n = JOptionPane.showInputDialog("How many Nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer
		String d = JOptionPane.showInputDialog("How many dimes do you have?");
		int dime = Integer.parseInt(d);
		// Ask the user how many quarters they have, and convert their answer
		String q = JOptionPane.showInputDialog("How many quarters do you have?");
		int quarter = Integer.parseInt(q);
		// Calculate how much money the user has and save it in a double variable
		int nickelValue = nickel * 5;
		int dimeValue = dime * 10;
		int quarterValue = quarter * 25;
		int A = quarterValue + dimeValue + nickelValue;
		int dollarValue = A / 100;
		double b = A;
		double total = b / 100;
		if (A % 10 == 0) {
			JOptionPane.showMessageDialog(null, "You have $" + total + "0");
		} else {
			// Tell the user how much money they have
			JOptionPane.showMessageDialog(null, "You have $" + total);
		}
	}
}
