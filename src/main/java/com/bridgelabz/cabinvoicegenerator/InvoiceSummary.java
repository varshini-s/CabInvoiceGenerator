package com.bridgelabz.cabinvoicegenerator;

import java.util.Objects;

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

	@Override
	public boolean equals(Object obj) {
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
