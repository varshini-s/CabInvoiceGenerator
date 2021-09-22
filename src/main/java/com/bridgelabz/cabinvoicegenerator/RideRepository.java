package com.bridgelabz.cabinvoicegenerator;

import java.util.HashMap;
import java.util.Map;

public class RideRepository 
{
	private Map<String, Ride[]> userRidesList;
	public RideRepository() 
	{
		userRidesList=new HashMap<String, Ride[]>();

	}


	public Map<String, Ride[]> getUserRidesList() 
	{
		return userRidesList;
	}



	public void setUserRidesList(Map<String, Ride[]> userRidesList)
	{
		this.userRidesList = userRidesList;
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
