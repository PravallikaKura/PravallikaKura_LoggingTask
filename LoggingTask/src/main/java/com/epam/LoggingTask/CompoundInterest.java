package com.epam.LoggingTask;

public class CompoundInterest {
	public double principle;
	public double interest;
	public double totalNoOfYears;
	public double numberOfCompoundingsPerYear;
	
	public  double CalculateCompoundInterest(double principle, double rateOfinterest, double totalNoOfYears, double numberOfCompoundingsPerYear) {
		double amount;
		double compoundInterest;
		amount = principle * 
                Math.pow(1 + (rateOfinterest/numberOfCompoundingsPerYear), numberOfCompoundingsPerYear*totalNoOfYears);
		compoundInterest = principle - amount;
		return Math.abs(compoundInterest);
	
	
}
}
