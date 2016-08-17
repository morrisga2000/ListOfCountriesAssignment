package com.ioAssignmentCountries;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileBufferedReader {

	private static String filepath = "\\Users\\admin\\workspace\\MondayAssignmentWeekThree\\src\\com\\ioAssignmentCountries\\CountriesList.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BufferedReader br;
		         String curline;
		         try {
		             br = new BufferedReader(new FileReader(filepath));
		             while ((curline = br.readLine()) != null) {
		                 System.out.println(curline);
		             }
		             br.close();
		         } catch (IOException e) {
		             e.printStackTrace();
		         }
		         					


	}
	

}
