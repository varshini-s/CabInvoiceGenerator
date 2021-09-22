package com.bridgelabz.cabinvoicegenerator;

public class InvoiceGenerator 
{
	

	public double calculateFare(double distance, int time) 
	{
		return distance*MINIMUM_COST_PER_KILOMETER+time*COST_PER_TIME;
	}

}
