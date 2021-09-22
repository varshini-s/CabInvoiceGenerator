package com.bridgelabz.cabinvoicegenerator;

public class Ride 
{
	enum RideType
	{
		NORMAL_RIDE,PREMIUM_RIDE;
	}

	public double distance;
	public double time;
	public RideType rideType;

	public Ride(double distance,int time)
	{
		this.distance=distance;
		this.time=time;
	}
	
	
	public Ride(double distance,double time,RideType rideType)
	{
		this.distance=distance;
		this.time=time;
		this.rideType=rideType;
	}

}
