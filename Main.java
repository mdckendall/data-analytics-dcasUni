import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DataAnalytics {
	public static Scanner scanner = new Scanner(System.in);
	public static HashMap<Integer, String> answers = new HashMap<>();
	
	public static void main(String[] args) {
		menu();
    }
	
	private static void menu() {
		System.out.println("Press 1 to learn about salary.\n" + 
				   		   "Press 2 to learn about the job.\n" +
				   		   "Press 3 to learn about the demand.\n" + 
				   		   "Press 4 to view current students.\n" +
				   		   "Press 5 to quit.");
		int choice = Integer.parseInt(scanner.nextLine());
		choiceProcessor(choice);
	}
	
	private static void choiceProcessor(int choice) {
    	switch (choice) {
        case 1:
        	System.out.println("98,345 average salary in South Florida!");
        	menu();
            break;
            
        case 2:
        	System.out.println("US News - 100 Best Jobs!");
        	menu();
            break;
            
        case 3:
        	System.out.println("Top 10 Forbes In-Demand Jobs!");
        	menu();
            break;
            
        case 4:
            show();
        	menu();
            break;
            
        case 5:
        	System.exit(0);
            break;
            
        default:
            System.out.println("Number is not 1, 2, 3, 4, or 5!");
            break;
    	}
    }
	
	private static void show() {
		try {
			File dataFile = new File("names.txt");
		    Scanner scanner = new Scanner(dataFile);
		    while (scanner.hasNextLine()) {
		    	String data = scanner.nextLine();
		        System.out.println(data);
		    }
		    scanner.close();
		}
		catch (FileNotFoundException e) {
		    e.printStackTrace();
		}
	}
}
