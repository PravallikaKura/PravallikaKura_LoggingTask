package com.epam.LoggingTask;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Client {
	private static Logger LOGGER = LogManager.getLogger(App.class);
	static Scanner sc = new Scanner(System.in);
	public static void Input(){
		Client myclient = new Client();
		LOGGER.info("Enter an option 1.Calculate Simple Interest 2.Calculate Compound Interest ");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		switch(val) {
		case 1:
			myclient.CalculateSimpleInterest();
			break;
		case 2:
			myclient.CalculateCompoundInterest();
			break;
		default:
			LOGGER.info("Enter valid input");	
			break;
		}
	}
	public void CalculateSimpleInterest(){
		SimpleInterest s = new SimpleInterest();
			Scanner sc = new Scanner(System.in);
			LOGGER.info("Enter the amount taken");
			float principalAmount = sc.nextFloat();
			LOGGER.info("Enter the term of loan");
			 float timePeriod = sc.nextFloat();
			 LOGGER.info("Enter the Rate of Interest");
			float rateOfInterest = sc.nextFloat();
		    float simpleInterest = s.CalculateSimpleInterest(principalAmount, timePeriod, rateOfInterest);
		    LOGGER.info("Simple Interest  " +simpleInterest);
		    
	}
	public void CalculateCompoundInterest(){
		CompoundInterest c = new CompoundInterest();
			Scanner sc = new Scanner(System.in);
			LOGGER.info("Enter the principle");
			double principle = sc.nextDouble();
			LOGGER.info("Enter the interest");
			double interest = sc.nextDouble();
			LOGGER.info("Enter the total number of years");
			double totalNoOfYears = sc.nextDouble();
			LOGGER.info("Enter the interest to compound every year");
			double numberOfCompoundingsPerYear = sc.nextDouble();
			double compoundInterest = c.CalculateCompoundInterest(principle, interest, totalNoOfYears, numberOfCompoundingsPerYear);
			LOGGER.info(compoundInterest);
	}
	
	
	
	
	
	
}
