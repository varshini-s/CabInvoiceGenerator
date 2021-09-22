package com.bridgelabz.cabinvoicegenerator;

import com.bridgelabz.cabinvoicegenerator.CabAgency.CostType;

public class InvoiceGenerator 
{
	private static  double costPerKilometer=10 ;
	private static  double costPerMinute =1;
	private static  double minimumFare = 5;
	CabAgency cabAgency;

	public double calculateFare(double distance, double time) 
	{
		double totalFare= distance*costPerKilometer+time*costPerMinute;
		if(totalFare<minimumFare)
		{
			return minimumFare;
		}

		return totalFare;
	}


	public InvoiceSummary calculateFare(Ride[] rides) 
	{

		double totalFare = 0;
		for(Ride ride:rides)
		{
			if(cabAgency!=null)
			{
				costPerKilometer=cabAgency.getCost(ride.rideType, CostType.COST_PER_KILOMETER);
				costPerMinute=cabAgency.getCost(ride.rideType,CostType.COST_PER_MINUTE);
				minimumFare=cabAgency.getCost(ride.rideType,CostType.MINIMUM_FARE);
			}
			
			totalFare+=this.calculateFare(ride.distance,ride.time);
		}

		return new InvoiceSummary(rides.length, totalFare);
	}


	public InvoiceSummary calculateFare(String userID,RideRepository rideRepository) 
	{
		Ride[] rides=rideRepository.getRideList(userID);

		return calculateFare(rides);
	}


	public InvoiceSummary calculateFare(String userID, RideRepository rideRepository, CabAgency cabAgency) 
	{
		this.cabAgency=cabAgency;
		return calculateFare(userID, rideRepository);
	}
	

}
