/* Description:
This program will prompt the user to provide two names and two DOB's in an 8 digit format, 
and then display this information. Afterward, the program will also determine which of the two inputted persons is older
and will display the same.*/


import java.util.Scanner; // Scanner is in the java util package

public class birthday { //class name is Birthday
	public static void main(String[] args) {
		//we declare the various integers and string values we will require in this program
		int birthdate1; //Birth Date for Person 1
		int birthdate2; //Birth Date for Person 2

		int birthmonth1; // Birth Month for Person 1
		int birthmonth2; // Birth Month for Person 2

		int birthyear1; // Birth Year for Person 1
		int birthyear2; // Birth Year for Person 2

		int dateOfbirth1; // The user input of DOB in 8-digit format for Person 1
		int dateOfbirth2; // The user input of DOB in 8-digit format for Person 2

		String name1; // User inpur of name as string value for Person 1
		String name2; //User input of name as string value for Person 2

		String properDOB1; // The entire DOB in the appropriate format of MM/DD/YYYY for Person 1
		String properDOB2; // The entire DOB in the appropriate format of MM/DD/YYYY for Person 2

		System.out.print("Please enter a name for Person #1: "); //user prompt
		Scanner input = new Scanner(System.in);
		name1 = input.nextLine();

		System.out.print("Please enter a name for Person #2: "); //user prompt
		name2 = input.nextLine();

		System.out.print("Please enter the birthday for " + name1 + " in the 8 digit format (YYYYMMDD): "); //user prompt
		dateOfbirth1 = input.nextInt();

		System.out.print("Please enter the birthday for " + name2 + " in the 8 digit format (YYYYMMDD): "); // user prompt
		dateOfbirth2 = input.nextInt();

		birthdate1 = (dateOfbirth1 % 100); // we isolate the date
		birthmonth1 = ((dateOfbirth1 - birthdate1) % 10000 / 100); // we isolate the month
		birthyear1 = ((dateOfbirth1 - birthdate1 - birthmonth1*100)/10000); // we isolate the year

		birthdate2 = (dateOfbirth2 % 100); //similar as the process for the first person, we isolate the date
		birthmonth2 = ((dateOfbirth2 - birthdate2) % 10000 / 100); // we isolate the month
		birthyear2 = ((dateOfbirth2 - birthdate2 - birthmonth2*100)/10000); // we isolate the year

		properDOB1 = (birthmonth1 + "/" + birthdate1 + "/" + birthyear1); // concatenating the three values as one date for Person 1
		properDOB2 = (birthmonth2 + "/" + birthdate2 + "/" + birthyear2); // concatenating the three values as one date for Person 2

		System.out.println(name1 + "'s date of birth is: " + properDOB1); // Displaying the DOB for Person 1 in MM/DD/YYYY format.
		System.out.println(name2 + "'s date of birth is: " + properDOB2); // Displaying the DOB for Person 2 in MM/DD/YYYY format.

		//compare DOBs for checking who is older

		int yearcompare; // for comparing the year of birth b/w Person 1 and 2
		int monthcompare; // for commparing the month of birth b/w Person 1 and 2
		int datecompare; // for comparing the dates of birth b/w Person 1 and 2

		yearcompare = (birthyear1 - birthyear2);
		monthcompare = (birthmonth1 - birthmonth2);
		datecompare = (birthdate1 - birthdate2);
		// we set up nested if statements to figure out which person is older than the other on basic arithmetic principles.
		if (yearcompare > 0) { // If Year of P1 > Year of P2, then clearly P2 was born before P1.
			System.out.print(name2 + " is older than " + name1);
		}

		if (yearcompare < 0) { // If Year of P2 > Year of P1, then clearly P1 was born before P2.
				System.out.print (name1 + " is older than " + name2);
		}

		if (yearcompare == 0) {

			if ((yearcompare == 0) && (monthcompare > 0)) { // in the situation of the same year of birth, we compare months, following the same principle.
				System.out.println(name2 + " is older than " + name1);			
			}
			if ((yearcompare == 0) && (monthcompare < 0)) {
				System.out.println(name1 + " is older than " + name2);
			}
			if ((yearcompare == 0) && (monthcompare == 0)) { //Incase of same years and months of birth, we compare dates.
				
				if (datecompare > 0) {
					System.out.println(name2 + " is older than " + name1);
				}

				if (datecompare < 0) {
					System.out.println(name1 + " is older than " + name2);
				}

				if (datecompare == 0) {
					System.out.println(name1 + " and " + name2 + " have the same birthday!");
				}
			}
		}

	}
}