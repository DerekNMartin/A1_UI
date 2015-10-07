import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentDB {

	String dataBase[] = new String[5];
	boolean found = false;

	public StudentDB(String studentNumber) {
		File file = new File("students.txt");

		if (file.exists()) {
			Scanner scanner;
			String temp;
			int count = 0;
			try {
				scanner = new Scanner(file);
				while (scanner.hasNext()) {
					scanner.useDelimiter(", ");
				if(count > 0){
					dataBase[0] = scanner.next().substring(1);
				}
				else{
					dataBase[0] = scanner.next();
				}
					dataBase[1] = scanner.next();
					dataBase[2] = scanner.next();
					dataBase[3] = scanner.next();
					scanner.useDelimiter(System
							.getProperty("line.separator"));
					temp = scanner.next();
					temp = temp.substring(2);
					dataBase[4] = temp;
					count ++;
					 
					for(int i = 0; i < 5; i++){
						System.out.println(dataBase[i]);
					}
					
					if(dataBase[0].equals(studentNumber)){
						found = true;
						break;
					}
					
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
System.out.println(found);
	}
	
	public boolean checkIfStudentWasFound(){
		return found;
	}
	
	public String[] getDataBase(){
		return dataBase;
	}

	public static void main(String args[]) {
		new StudentDB("456123789");
	}

}
