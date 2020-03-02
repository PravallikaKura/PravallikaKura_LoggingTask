package com.epam.LoggingTask;



import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ConstructionEstimation {
	private static Logger LOGGER = LogManager.getLogger(App.class);
	public static void Estimation(){
	    Scanner sc = new Scanner(System.in);
	    LOGGER.info("Enter the area of the house");
		double area = sc.nextDouble();
		double totalCost = 0.0;
		LOGGER.info("Enter the value 1.Standard materials 2.Above standard materials 3.High standard materials "
				+ "4.High standard material and fully automated home 5.");
		int val = sc.nextInt();
		switch(val) {
		case 1:
			totalCost = 1200*area;
			break;
		case 2:
			totalCost = 1500*area;
			break;
		case 3:
			totalCost = 1800*area;
			break;
		case 4:
			totalCost = 2500*area;
			break;
		default:
			LOGGER.info("Enter valid input");	
			break;
		}
		LOGGER.info("House Construction Cost" +totalCost);
		}
	
	
}
