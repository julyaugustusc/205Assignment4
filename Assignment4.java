//Assignment: Arizona State U. CSE205 #4
//Name: Augsutus Crosby
//StudentID: 1207882243
//Lecture: T/Th 10:30
//Description: Assignment 4 class displays a menu of choices to a user
//		and performs the chosen task. It will keep asking a user to 
//		enter the next choice until the choice of 'Q' (Quit) is entered.
//Time Spent: 2 hours

import java.util.*;

public class Assignment4 {
	
	public static void main (String[] args) {
		
		//local variables, can be accessed anywhere from the main method
		char choice = 'Q';
		String line = new String();
		
		//instantiate a Employee object
		Employee e1 = new Employee();
		
		
		//Create a Scanner object to read user input
		Scanner scan = new Scanner(System.in);
		
		do { // will ask for user input
			
			System.out.print("What action would you like to perform?\n");
			printMenu();
			line = scan.nextLine();
			
			if(line.length() == 1) {
				//get the choice as a character
				choice = line.charAt(0);
				choice = Character.toUpperCase(choice);
				
				//matches one of the case statement
				switch (choice) {
				
				case 'A': //Add an employee
					/*read first_name, last_name, age, address, base salary
					 * then call the appropriate methods of the employee instance e1 to set those values
					 */
					
					System.out.println("Enter first name:");
					String firstName = scan.next();
					System.out.println("Enter last name:");
					String lastName = scan.next();
					System.out.println("Age:");
					int age = scan.nextInt();
					System.out.println("Salary:");
					double salary = scan.nextDouble();
					scan.nextLine(); //Consume new line left-over
					System.out.println("Enter Address:\n\tStreet Name:");
					String streetName = scan.nextLine();
					System.out.println("\tCity:");
					String city = scan.next();
					System.out.println("\tState:");
					String state = scan.next();
					System.out.println("\tZipcode:");
					int zipcode = scan.nextInt();
					scan.nextLine(); //Consume new line left-over
					
					e1.setName(firstName,lastName);
					e1.setAge(age);
					e1.setBaseSalary(salary);
					e1.setAddress(streetName, city, state, zipcode);
					
					break;
					
				case 'D': //Display Employee
					System.out.print(e1);
					break;
					
				case 'C': //change address
					// read street name, city, state, zipcode and call appropriate methods of e1 change the address 
					
					System.out.println("Enter New Address:\nStreet Name:");
					streetName = scan.next();
					System.out.println("City:");
					city = scan.next();
					System.out.println("State:");
					state = scan.next();
					System.out.println("Zipcode:");
					zipcode = scan.nextInt();
					
					e1.setAddress(streetName, city, state, zipcode);
					
					break;
					
				case 'Q': // Quit
					break;
					
				case '?': //Display Menu
					printMenu();
					
					break;
					
				default:
					System.out.print("Unknown action\n");
					break;					 
				}
			}
			
			else {
				System.out.print("Unknown action\n");
			}
			
		} while(choice != 'Q');
		
		scan.close();
			
	}
	
	/** The method printMenu displays the menu to a user **/
	public static void printMenu() {
		System.out.print("Choice\t\tAction\n"+
							"------\t\t------\n"+
							"A\t\tAdd an Employee\n"+
							"D\t\tDisplay an Employee Info\n"+
							"C\t\tChange Address\n"+
							"Q\t\tQuit\n"+
							"?\t\tDisplay Menu Again\n\n");
	}

}
