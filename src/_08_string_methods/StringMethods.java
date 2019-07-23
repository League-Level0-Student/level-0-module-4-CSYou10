package _08_string_methods;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class StringMethods {
	public static void main(String[] args) {
		String string = "abc";
		// 1. Create a String variable and initialize it to whatever you want
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		JOptionPane.showMessageDialog(null, "" + string.charAt(2));
		// 3. Print the length of your String to the console.
		//    HINT: .length()
JOptionPane.showMessageDialog(null, "" + string.length());
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
for (int i = 0; i < string.length(); i++) {
	JOptionPane.showMessageDialog(null, "" + string.charAt(i));
}
		
		// 5. Pick a char inside your String, and use a loop to determine
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'a') {
				JOptionPane.showMessageDialog(null, i);
			}
		}
//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	}
}


