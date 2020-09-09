// Exercise on pages 189-192

public class CarInsurancePolicy
{
	// Data field variables for this class
	private int policyNumber;
	private int numPayments;
	private String residentCity;

	// Constructor methods for this class
	public CarInsurancePolicy(int num, int payments, String city)
	{
		policyNumber = num;
		numPayments = payments;
		residentCity = city;
	}
	public CarInsurancePolicy(int num, int payments)
	{
		policyNumber = num;
		numPayments = payments;
		residentCity = "Mayfield";
	}

	public CarInsurancePolicy(int num)
	{
		policyNumber = num;
		numPayments = 2;
		residentCity = "Mayfield";
	}

	// Accessor method for all of the object's data
	public void display()
	{
		System.out.println("[ Policy #" + policyNumber + " ] " + numPayments + " payments are made annually. The driver resides in " + residentCity +".");
	}
}