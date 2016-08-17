package com.ioAssignmentCountries;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListofCountries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String menuInput = null;
		String userInput = null;
		boolean keepGoing = true;
		boolean userFailed = false;
		boolean correctInput = true;
		int numberSelection = 0;
		
		ArrayList<String> ListofCountriesFile = new ArrayList<>();

		
		Path ourNewPath = Paths.get("Users\\admin\\workspace\\MondayAssignmentWeekThree\\src\\com\\ioAssignmentCountries\\CountriesList.txt");
		File aNewFile = ourNewPath.toFile();

		
	do {
		do {
			greetingMainMenu();
			menuInput = sc.nextLine();
			userFailed = ValidatorInputs.numberIsValid(menuInput);
			numberSelection = Integer.parseInt(menuInput);
			correctInput = ValidatorInputs.menuCasesCheck(menuInput, correctInput);
		} while (correctInput);

	
		switch (menuInput)  {
		case "1":
					ListofCountriesFile = ourReader(ListofCountriesFile, aNewFile);
				for (int i = 0; i < ListofCountriesFile.size(); i++) {
					System.out.println((i+1) + " " + ListofCountriesFile.get(i));
			}
				break;
		case "2":
				break;
		case "3":
			{
				int delItem = 0;
				System.out.println("Please select which country that you would like to remove by entering the corresponding number ");
				userInput =  sc.nextLine(); // conduct a readLine
				delItem = Integer.parseInt(userInput);
				ListofCountriesFile.remove(delItem);
				ListofCountriesFile.trimToSize();
				
			}
			
			break;
		case "4": 
			{
				keepGoing = false;
			}
			break;
		
		} while (keepGoing);


		
	} // end of main

	
	

	public static void greetingMainMenu() {
		System.out.println("\n \t MAIN MENU \n");
		System.out.println("Please select from the following menu: ");
		System.out.println("(1)  DISPLAY a list of countries   ");
		System.out.println("(2)  Enter a new country to ADD to the file list");
		System.out.println("(3)  REMOVE a country from the list");
		System.out.println("(4)  EXIT the application");
		
	} // end of method greetingMainMenu
	
	public static void overWriteFile(String causeToPrint, File aNewFileObj) {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewFileObj))))
		{
			out.println(causeToPrint);
			out.close();
		} catch (IOException eX){
			eX.printStackTrace();
		}
	}

	public static void appendToTextFile(String causeToPrint, File aNewFileObj) {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewFileObj, true))))
		{
			out.println(causeToPrint);
			out.close();
		} catch (IOException eX){
			eX.printStackTrace();
		}
	}

	public static ArrayList<String> ourReader(ArrayList<String> fromOurTextFile, File aNewFileObj) {
		try (BufferedReader in = new BufferedReader(new FileReader(aNewFileObj))) {
			
			String readingStuff;
			while ((readingStuff = in.readLine()) != null) {
			fromOurTextFile.add(readingStuff);			
			}  // end of while loop
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fromOurTextFile;
	}   // ends ourReader method
	
	
} // end of class
