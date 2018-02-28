import java.util.*;
/**
 * Implements a phone book application using the map data structure
 * @author Dylan Decker
 *
 */
public class PhoneBook {
	
	public static void main(String[] args) {
		
		// Creates and defines the map
		Map<String, String> phoneList = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		int numPeople = 0;
		System.out.println("How many people would you like to add to the phone book?");
		numPeople = scan.nextInt();
		String name = "";
		String number = "";
		for (int i = 0; i < numPeople; i++) {
			System.out.println("Please enter the name of individual #" + (i + 1) + " that you would like to add.");
			name = scan.next();
			System.out.println("Please enter the phone number of " + name + " in the format 123-456-7890.");
			number = scan.next();
			phoneList.put(name, number);
		}
		System.out.println("--------------------------------------------------------------------");
		// prints the main options for the phone book and executes accordingly to the input
		while (true) {
			int option = 0;
			System.out.println("What would you like to do? Please type in the number of the option.");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1: Search directory by name");
			System.out.println("2: Print entire contents of phone book");
			System.out.println("3: Close phone book");
			option = scan.nextInt();
			if (option == 1) {
				System.out.println("Please enter the full name of the individual you're searching the phone number for.");
				name = scan.next();
				System.out.println(name + "'s number is: " +  phoneList.get(name));
			} else if (option == 2) {
				phoneList.forEach( (alias, phoneNumber) -> System.out.println(alias + "'s number is: " + phoneNumber) );
			} else {
				break;
			}
			System.out.println("-----------------------------------------------------------------------");
		}
	}

}
