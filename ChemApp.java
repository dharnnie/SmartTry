import javax.swing.JOptionPane;
import java.util.Scanner;
public class ChemApp{					

	// I INTEND TO INITIALIZE EACH USER FILE AND SAVE THE SCORE IN IT;
	public static int score = 0;
	private String username = "";
	private int password;
	private String firstInstruction ;
	private String secondInstruction; 
	
	 public ChemApp(int myPassword , String myUsername){
		this.password = myPassword;
	 	this.username = myUsername;

		// I intend to initialize the specific user file: to get the details;
	}
	
	public void questionOne(){
		String q1;
		q1 = "[F] means _____ in the representation of female gender\n(a) Female \n (b) Male >>pls input a or b";
		String myAns = JOptionPane.showInputDialog(null, q1, "QUESTION ONE", JOptionPane.QUESTION_MESSAGE); 
		if (myAns.equals("a") || myAns.equals("A")){
			JOptionPane.showMessageDialog(null, "BRILLIANT", "THUMBS UP", JOptionPane.PLAIN_MESSAGE);
			this.score += 1;
		}else{
			JOptionPane.showMessageDialog(null, "THAT'S INCORRECT", "OOOPPS", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public void questionTwo(){
		String q2;
		q2 = "Insert the missing number in the given sequence>> 8,24,12,36,18,54,__ \n(a)108 \n(b)27 \n(c)68 \n(d)72";
		String myAns = JOptionPane.showInputDialog(null, q2, "QUESTION TWO", JOptionPane.QUESTION_MESSAGE);
		if (myAns.equals("b") || myAns.equals("B")) {
			JOptionPane.showMessageDialog(null, "BRILLIANT", "THUMBS UP", JOptionPane.INFORMATION_MESSAGE);
			this.score += 1;
		}else{
			JOptionPane.showMessageDialog(null, "INCORRECT OPTION", "NAAAHH!!!!", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public void questionThree(){
		String q3;
		q3 = "In a two digit number,\n if it is known that it's unit's digit exceeds it's ten's digit by 2,\nand that the product of the given number and the sum of it's digits is equal to 144, then the number is ____  \n (a)24 (b)26 (c)42 (d)46 ";
		String myAns = JOptionPane.showInputDialog(null, q3, "QUESTION THREE", JOptionPane.QUESTION_MESSAGE);
		if (myAns.equals("a")|| myAns.equals("A")){
			JOptionPane.showMessageDialog(null, "BRILLIANT", "THUMBS UP", JOptionPane.INFORMATION_MESSAGE);
			this.score += 1;
		}
		else{
			JOptionPane.showMessageDialog(null, "INCORRECT OPTION", "NAAAHH!!!!", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public void questionFour(){
		String q4;
		q4 = "Find a positive number which when increased by 17\n is equal to 60 times the reciprocal of the number \n (a)3 (b)10 (c)17 (d)20 |";
		String myAns = JOptionPane.showInputDialog(null, q4, "QUESTION FOUR", JOptionPane.QUESTION_MESSAGE);
		if (myAns.equals("a")|| myAns.equals("A")){
			JOptionPane.showMessageDialog(null, "BRILLIANT", "THUMBS UP", JOptionPane.INFORMATION_MESSAGE);
			this.score += 1;
		}else{
			JOptionPane.showMessageDialog(null, "INCORRECT OPTION", "NAAAHH!!!!", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public void questionFive(){
		String q5;
		q5 = "The sum of two numbers is 25,\nand thier difference is 13. Find thier product\n (a)104 (b)114 (c)315 (d)325|";
		String myAns = JOptionPane.showInputDialog(null, q5, "QUESTION FIVE", JOptionPane.QUESTION_MESSAGE);
		if(myAns.equals("b") || myAns.equals("A")){
			JOptionPane.showMessageDialog(null, "BRILLIANT", "THUMBS UP", JOptionPane.INFORMATION_MESSAGE);
			this.score += 1;
		}else{
			JOptionPane.showMessageDialog(null, "INCORRECT OPTION", "NAAAHH!!!!", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public void questionSix(){
		String q6;
		q6 = "Ayesha's father was 38 years of age when she was born\n while her mother was 36years old when her brother who is FOUR YEARS YOUNGER TO HER WAS BORN\n. What is the difference between the ages of her parent??\n(a)2years (b)4years (c)6years (d)8years|";
		String myAns = JOptionPane.showInputDialog(null, q6, "QUESTION SIX", JOptionPane.QUESTION_MESSAGE);
		if(myAns.equals("c") || myAns.equals("C")){
			JOptionPane.showMessageDialog(null, "BRILLIANT", "THUMBS UP", JOptionPane.INFORMATION_MESSAGE);
			this.score += 1;
		}else{
			JOptionPane.showMessageDialog(null, "INCORRECT OPTION", "NAAAHH!!!!", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public void questionSeven(){
		String q7;
		q7 = "What was the day of the week 28th May 2006?\n(a)Thursday (b)Friday (c)Saturday(d)Sunday";
		String myAns = JOptionPane.showInputDialog(null, q7, "QUESTION SEVEN", JOptionPane.QUESTION_MESSAGE);
		if(myAns.equals("d") || myAns.equals("D")){
			JOptionPane.showMessageDialog(null, "BRILLIANT", "THUMBS UP", JOptionPane.INFORMATION_MESSAGE);
			this.score += 1;
		}else{
			JOptionPane.showMessageDialog(null, "INCORRECT OPTION", "NAAAHH!!!!", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public void questionEight(){
		String q8;
		q8 = "A is two years older than B who is twice as old as C.\nHow old is B, IF!! the total of the ages of A,B,C is 27\n(a)7 (b)8 (c)9 (d)10 (e)11|";
		String myAns = JOptionPane.showInputDialog(null, q8, "QUESTION EIGHT", JOptionPane.QUESTION_MESSAGE);
		if(myAns.equals("d") || myAns.equals("D")){
			JOptionPane.showMessageDialog(null, "BRILLIANT", "THUMBS UP", JOptionPane.INFORMATION_MESSAGE);
			this.score += 1;
		}else{
			JOptionPane.showMessageDialog(null, "INCORRECT OPTION", "NAAAHH!!!!", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public void questionNine(){
		String q9;
		q9 = "A table is essential for which of theses games?\n(a)Pool (b)Golf (c)Cricket (d)Ice Hockey|";
		String myAns = JOptionPane.showInputDialog(null, q9, "QUESTION NINE", JOptionPane.QUESTION_MESSAGE);
		if(myAns.equals("a") || myAns.equals("A")){
			JOptionPane.showMessageDialog(null, "BRILLIANT", "THUMBS UP", JOptionPane.INFORMATION_MESSAGE);
			this.score += 1;
		}else{
			JOptionPane.showMessageDialog(null, "INCORRECT OPTION", "NAAAHH!!!!", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public void questionTen(){
		String q10;
		q10 = "Which of these countries does not have an atlantic coastline?\n(a)Canada (b)Brazil (c)Japan(d)France|";
		String myAns = JOptionPane.showInputDialog(null, q10, "QUESTION TEN", JOptionPane.QUESTION_MESSAGE);
		if(myAns.equals("c") || myAns.equals("C")){
			JOptionPane.showMessageDialog(null, "BRILLIANT", "THUMBS UP", JOptionPane.INFORMATION_MESSAGE);
			this.score += 1;
		}else{
			JOptionPane.showMessageDialog(null, "INCORRECT OPTION", "NAAAHH!!!!", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public void genQuestionEvaluator(){
		String failInfo = "SORRY YOU CANNOT GO ON.. TRY AGAIN NEXT TIME";
		String passInfo = "HEY FISH, YOU PASSED DOES NOT MEAN YOU ARE A GENIUS YOU WILL BE ALLOWED ACCESS TO ANSWER CHEMISTRY QUESTIONS";
		String scoreInfo = "you had " + score + " out of 10";
		if (this.score >= 7){
			JOptionPane.showMessageDialog(null, passInfo, "FELICITACION", JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null, scoreInfo, "HERE IS YOUR SCORE", JOptionPane.PLAIN_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null, failInfo, "SORRY", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, scoreInfo, "HERE IS YOUR SCORE", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public int getScore(){
	 	return score;
	}
}