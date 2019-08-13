package _06_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String Score = JOptionPane.showInputDialog("Input a test score inbetween 0 and 100");
		double ScoreNumber = Double.parseDouble(Score);
		if (ScoreNumber <= 40) {
			JOptionPane.showMessageDialog(null, "Studie for the test and try again.");
		} else if (ScoreNumber >= 50) {
			JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
		}else if (ScoreNumber > 40 && ScoreNumber < 50) {
			JOptionPane.showMessageDialog(null, "Wow! You must have studied well.");
		}

	}
}