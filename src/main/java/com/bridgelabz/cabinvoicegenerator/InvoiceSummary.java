package com.bridgelabz.cabinvoicegenerator;

public class InvoiceSummary 
{
	public int numberOfRides;
	public double totalFare;
	public double averageFair;

	public InvoiceSummary(int numberOfRides,double totalFare) 
	{

		this.numberOfRides=numberOfRides;
		this.totalFare=totalFare;
		this.averageFair=this.totalFare/this.numberOfRides;
	}

}
