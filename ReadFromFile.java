import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class ReadFromFile{ 

	private static Scanner newUserFile;
	private static boolean verified = false;

	/*public ReadFromFile(){
		while(newUserFile.hasNext()){
			String field = newUserFile.next();
			String value = newUserFile.next();
			if(field.equals("PASSWORD") && value.equals(password)){
				return value;
			}
		}
	}
	*/
	public void openFile(String fileName){
		try{
				
			newUserFile = new Scanner(fileName.concat(".txt"));
		}
		catch(Exception err){
				JOptionPane.showMessageDialog(null, "File Not Found:\n Please Try again", "AN ERROR OCCURED", JOptionPane.ERROR_MESSAGE);
		}
	}
	public static boolean verify(String password){
		boolean validated = false;
		while(newUserFile.hasNext()){
			String field = newUserFile.next();
			String value = newUserFile.next();
			if(field.equals("PASSWORD") && value.equals(password)){
				validated = true;
			}
		}
		return validated;
	}
	
}