import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
public class Login{

	private Scanner lookInFile;

	public void locateFile(String surname){

		try{

			lookInFile = new Scanner(new File(surname.concat(".txt")));
		}catch(Exception err){
			String errMessage = err.getMessage();
			JOptionPane.showMessageDialog(null, errMessage, "AN ERROR OCCURED", JOptionPane.ERROR_MESSAGE);
		}
	}
	public boolean verifyDetails(String password){// change this password to lower case in the main class
		boolean stat = false;
		while(lookInFile.hasNext()){
			
			String a = lookInFile.next();
			String b = lookInFile.next();
			if(a.equals("PASSWORD") && b.equals(password)){
				stat = true;
			}
		}
	return stat;
	}

}