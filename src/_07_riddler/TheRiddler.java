package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		String score = null;
		int points=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
 score = JOptionPane.showInputDialog("What can travel the world but stay in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(score.equals("A postage sticker.")){
	JOptionPane.showMessageDialog(null, "Correct!");
		points++;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong. The answer is A POSTAGE STICKER.");
}
		// 6. Add some more riddles
//no
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, points);
	}
}

