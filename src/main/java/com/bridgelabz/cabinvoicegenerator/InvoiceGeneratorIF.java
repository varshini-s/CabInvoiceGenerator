package com.bridgelabz.cabinvoicegenerator;

public interface InvoiceGeneratorIF 
{

	public double calculateFare(double distance, double time);
	public InvoiceSummary calculateFare(Ride[] rides);
	public InvoiceSummary calculateFare(String userID,RideRepository rideRepository);
	public InvoiceSummary calculateFare(String userID, RideRepository rideRepository, CabAgency cabAgency);

}
