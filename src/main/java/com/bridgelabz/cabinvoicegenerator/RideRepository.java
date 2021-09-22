package com.bridgelabz.cabinvoicegenerator;

import java.util.HashMap;
import java.util.Map;

public class RideRepository 
{
	Map<String, Ride[]> userRidesList;
	public RideRepository() 
	{
		userRidesList=new HashMap<String, Ride[]>();

	}

	public void addRideList(String userID, Ride[] rides) 
	{
		if(this.userRidesList.containsKey(userID)==false)
		{
			this.userRidesList.put(userID, rides);
		}
	}

	public Ride[] getRideList(String userID)
	{
		if(this.userRidesList.containsKey(userID))
		{
			return userRidesList.get(userID);
		}

		return null;
	}

}
