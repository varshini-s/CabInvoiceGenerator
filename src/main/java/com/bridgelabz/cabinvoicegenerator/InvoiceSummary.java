package com.bridgelabz.cabinvoicegenerator;

import java.util.Objects;

public class InvoiceSummary 
{
	private int numberOfRides;
	private double totalFare;
	private double averageFair;

	public InvoiceSummary(int numberOfRides,double totalFare) 
	{

		this.numberOfRides=numberOfRides;
		this.totalFare=totalFare;
		this.averageFair=this.totalFare/this.numberOfRides;
	}
	
	public int getNumberOfRides() 
	{
		return numberOfRides;
	
	}

	public void setNumberOfRides(int numberOfRides) 
	{
		this.numberOfRides = numberOfRides;
	}

	public double getTotalFare() 
	{
		return totalFare;
	}

	public void setTotalFare(double totalFare)
	{
		this.totalFare = totalFare;
	}

	public double getAverageFair()
	{
		return averageFair;
	}

	public void setAverageFair(double averageFair)
	{
		this.averageFair = averageFair;
	}


	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceSummary other = (InvoiceSummary) obj;
		return Double.doubleToLongBits(averageFair) == Double.doubleToLongBits(other.averageFair)
				&& numberOfRides == other.numberOfRides
				&& Double.doubleToLongBits(totalFare) == Double.doubleToLongBits(other.totalFare);
	}

	
}
