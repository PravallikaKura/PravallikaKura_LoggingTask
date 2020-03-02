package com.epam.LoggingTask;

public class SimpleInterest {
	public float principalAmount;
	public float timePeriod;
	public float rateOfInterest;
	public  float CalculateSimpleInterest(float principalAmount, float timePeriod, float rateOfInterest) {
	  float SimpleInterest = (principalAmount*timePeriod*rateOfInterest)/100;
	  return SimpleInterest;
	}

}
