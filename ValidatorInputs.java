package com.ioAssignmentCountries;

public class ValidatorInputs {
	
	public static void main(String[] args) {
		
	}  // end main
	
	
	public static boolean menuCasesCheck(String menuInput, boolean correctInput) {
		switch (menuInput) {
		case "1":
		case "2":
		case "3":
		case "4":
			correctInput = false;
			break;
			default:
			System.out.println("ERROR!  Sorry, that is a not a valid option");
		
		}
		return correctInput;
	}    // ends method menuCasesCheck
	
	
	
	public static boolean numberIsValid(String someStringToMakeANumber)
	{
		try {
			int aNumber = Integer.parseInt(someStringToMakeANumber);
			return false;
		} catch (NumberFormatException e) {
			// TODO: handle exception
		}
		return true;
	}

}
