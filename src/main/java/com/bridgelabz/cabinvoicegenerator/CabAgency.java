package com.bridgelabz.cabinvoicegenerator;

import java.util.HashMap;
import java.util.Map;import org.checkerframework.checker.units.qual.C;

public class CabAgency 
{

	
	
	enum CostType
	{
		COST_PER_KILOMETER,COST_PER_MINUTE,MINIMUM_FARE
	}

	CostType costType;
	
	Map<Ride.RideType,Map<CostType,Double>> rideDetail= new HashMap<Ride.RideType, Map<CostType,Double>>();
	
	public CabAgency(double normalRideCostPerKilometer,double normalRideCostPerMinute,double normalRideMinimumFare,
					 double preimumRideCostPerKilometer,double premiumRideCostPerMinute,double premiumRideMinimumFare) 
	{
		
		Map<CostType,Double> normalRideCostDetails=new HashMap<CabAgency.CostType, Double>();
		normalRideCostDetails.put(costType.COST_PER_KILOMETER, normalRideCostPerKilometer);
		normalRideCostDetails.put(costType.COST_PER_MINUTE, normalRideCostPerMinute);
		normalRideCostDetails.put(costType.MINIMUM_FARE, normalRideMinimumFare);

		
		Map<CostType, Double> premiumRideCostDetails= new HashMap<CabAgency.CostType, Double>();
		premiumRideCostDetails.put(costType.COST_PER_KILOMETER, preimumRideCostPerKilometer);
		premiumRideCostDetails.put(costType.COST_PER_MINUTE, premiumRideCostPerMinute);
		premiumRideCostDetails.put(costType.MINIMUM_FARE, premiumRideMinimumFare);

		
		this.rideDetail.put(Ride.RideType.NORMAL_RIDE, normalRideCostDetails);
		this.rideDetail.put(Ride.RideType.PREMIUM_RIDE, premiumRideCostDetails);

	}

	
}
