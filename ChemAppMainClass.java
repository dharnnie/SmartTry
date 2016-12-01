import javax.swing.JOptionPane;
import java.util.Scanner;
class ChemAppMainClass{
	public static void main (String args[]){

		String welcomeInformation = "Welcome to SMART_TRY:\n BLA...BLAA... BLAA\n This is a fragile program, be careful with inputs";
		// OTHER INFOS WILL BE HERE
		JOptionPane.showMessageDialog(null, welcomeInformation, "WELCOME", JOptionPane.INFORMATION_MESSAGE);
		String register = JOptionPane.showInputDialog(null, "ARE YOU REGISTRED?\n YES\n\n NO ", "REGISTER OR LOGIN", JOptionPane.INFORMATION_MESSAGE);
		register.toLowerCase();// TO REDUCE THE IF CODE, IRRESPECTIVE OF THE CASE;
		Login play = new Login();

		if(register.equals("no") || register.equals("NO")){// user registration
			CreateAndSaveFile newUser = new CreateAndSaveFile();

			String myFileName = JOptionPane.showInputDialog(null, "You need to create a file for yourself, with your surname :\n I'm a dumb program like I said \n I might not be able to remind you of all that, so \n I'll advice you write it down if you are as dumb as I am..\n Please input it here");//TO ASK IF THE USER IS REGISTRED;
			// THESE LINE S WILL RECIEVE THE INPUT
			String myMatricNumber = JOptionPane.showInputDialog(null, "I will also need some of your details\n your matric Number Please", "MATRIC NUMBER", JOptionPane.INFORMATION_MESSAGE);
			myMatricNumber.toLowerCase();
			String myLevel = JOptionPane.showInputDialog(null, "What level are you in? \n NCE 1\n NCE 2\n NCE 3", "YEAR PLEASE", JOptionPane.QUESTION_MESSAGE);
			myLevel.toLowerCase();
			String myPassWord = JOptionPane.showInputDialog(null, "Your Password please", "SET PASSWORD", JOptionPane.PLAIN_MESSAGE);
			myPassWord.toLowerCase();
			String myDepartment = JOptionPane.showInputDialog(null, "What department are you in?");
			myDepartment.toLowerCase();
			newUser.createUserFile(myFileName);
			newUser.saveInFile(myFileName, myPassWord, myMatricNumber, myLevel, myDepartment);

			newUser.closeFile();
			

				ChemApp danny = new ChemApp(0000, "daniel");

				danny.questionOne();
				danny.questionTwo();
				danny.questionThree();
				danny.questionFour();
				danny.questionFive();
				danny.questionSix();
				danny.questionSeven();
				danny.questionEight();
				danny.questionNine();
				danny.questionTen();
				danny.genQuestionEvaluator();

				play.locateFile(myFileName);

				
				newUser.saveScore();
				
				newUser.closeFile();

		}
		else{// login verification

			String loginInfo = "WELCOME buddy\nAt this point you are telling me you are REGISTERED\n, All you need do now\n is to\n       LOGIN!!\n All I need is your SURNAME and PASSWORD\n ENJOY ";
			JOptionPane.showMessageDialog(null, loginInfo, "Please ReadUp", JOptionPane.INFORMATION_MESSAGE);
			String fileName = JOptionPane.showInputDialog(null,"This should imply your surname\n If you followed the registration process properly", "FILENAME" , JOptionPane.INFORMATION_MESSAGE);
			fileName.toLowerCase();
			String passKey = JOptionPane.showInputDialog(null,"PASSWORD", "Password goes here", JOptionPane.PLAIN_MESSAGE);
			passKey.toLowerCase();
			
			play.locateFile(fileName);

			if(!play.verifyDetails(passKey)){
				JOptionPane.showMessageDialog(null, "VALIDATION ERROR","ERROR", JOptionPane.ERROR_MESSAGE);
			}else{

				String welcomeMsg = "welcome to chemistry app.";
				String welcomeMsg2 = "You are required to answer ten general knowledge \n questions to enable you access the HOT!!!! chemistry questions";

				ChemApp danny = new ChemApp(0000, "daniel");

				JOptionPane.showMessageDialog(null, welcomeMsg + welcomeMsg2, "WELCOME TO THE APP", JOptionPane.INFORMATION_MESSAGE );
				

				danny.questionOne();
				danny.questionTwo();
				danny.questionThree();
				danny.questionFour();
				danny.questionFive();
				danny.questionSix();
				danny.questionSeven();
				danny.questionEight();
				danny.questionNine();
				danny.questionTen();
				danny.genQuestionEvaluator();

			}

				
		}
	
		
	}
	
}