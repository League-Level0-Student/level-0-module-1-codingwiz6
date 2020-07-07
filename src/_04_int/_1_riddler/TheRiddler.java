package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score =0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String Answer= JOptionPane.showInputDialog("What has a body but no head?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(Answer.equalsIgnoreCase("A river")){
	JOptionPane.showMessageDialog(null,"You figured out my riddle! Good job! ;)");
	score++;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Sorry that is not correct :( The answer was A river");
}

		// 6. Add some more riddles
Answer= JOptionPane.showInputDialog("what goes around the world but never moves? ");
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(Answer.equalsIgnoreCase("A street")){
JOptionPane.showMessageDialog(null,"You figured out my riddle! Good job! ;)");
score++;
}
// 5. Otherwise, say "wrong" and tell them the answer
else {
JOptionPane.showMessageDialog(null, "Sorry that is not correct :( The answer was A street");
}

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "You scored "+score);
	}
}

