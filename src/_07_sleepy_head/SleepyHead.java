package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        int isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
    isVacation = JOptionPane.showConfirmDialog(null, "Is it a vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
    isWeekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
if (isVacation == 0) {
	JOptionPane.showMessageDialog(null, "sleep in?");
}else if (isVacation == 1 && (isWeekday == 1)) {
	JOptionPane.showMessageDialog(null, "get up lazybones!?");
}else {
	JOptionPane.showMessageDialog(null, "sleep in?");
}
        /*
         * Print “sleep in�? if it is a vacation or a weekend. 
         * If it’s a weekday, print “get up lazybones!�? 
         * If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
