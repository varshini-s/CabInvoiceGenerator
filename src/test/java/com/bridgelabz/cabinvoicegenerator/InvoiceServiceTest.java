package com.bridgelabz.cabinvoicegenerator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceServiceTest 
{
	InvoiceGenerator invoiceGenerator;
	@Before
	public void initialSetup()
	{
		invoiceGenerator= new InvoiceGenerator();
		
	}

	@Test
	public void givenDistanceAndTimeShouldReturnTheTotalFare() 
	{
		double distance=2.0;
		int time=5;
		double fare=invoiceGenerator.calculateFare(distance,time);
		Assert.assertEquals(25, fare,0.0);
	}

	@Test
	public void givenLessDistanceOrTime_ShouldReturnMinimumFare()
	{
		double distance=0.1;
		int time=1;
		double fare=invoiceGenerator.calculateFare(distance,time);
		Assert.assertEquals(5, fare,0.0);
	}
	
    @Test
    public void givenMultipleRides_ShouldReturnTotalFare()
    {
    	Ride[] rides= {new Ride(2.0,5),
    				   new Ride(0.1,1)};
    	
    	InvoiceSummary summary =invoiceGenerator.calculateFare(rides);
    	InvoiceSummary expectedInvoiceSummary=new InvoiceSummary(2,30);
    	Assert.assertEquals(summary,expectedInvoiceSummary);

    }
    
    @Test
    public void givenUserID_ShouldReturnTotalFareOfAllTheRides()
    {
    	RideRepository rideRepository=new RideRepository();
    	
    	Ride[] rides= {new Ride(2.0,5),
				 	   new Ride(0.1,1)};
    	String userID="user1";
    	rideRepository.addRideList(userID,rides);
    	
    	InvoiceSummary summary =invoiceGenerator.calculateFare(userID);
    	InvoiceSummary expectedInvoiceSummary=new InvoiceSummary(2,30);
    	Assert.assertEquals(summary,expectedInvoiceSummary);
    	
    }

}
