package my_pac;

public class Donor extends Person{

	private String bloodBankName;
	private String donorType;
	private String donationDate;
	
	public Donor(){}
	
	public String getbloodBankName() {
		return bloodBankName;
	}
	
	public void setbloodBankName(String bloodBankName) {
		this.bloodBankName=bloodBankName;
	}
	
	public String getdonorType() {
		return donorType;
	}
	
	public void setdonorType(String donorType) {
		this.donorType=donorType;
	}
	
	public String getdonationDate() {
		return donationDate;
	}
	
	public void setdonationDate(String donationDate) {
		this.donationDate=donationDate;
	}
	
	public void displayDonationDetails() {
		System.out.println("Donation Details: ");
		System.out.println("Name: "+getName());
		System.out.println("Date of Birth: "+getDOB());
		System.out.println("Gender: "+getGender());
		System.out.println("Mobile Number: "+getNum());
		System.out.println("Blood Group: "+getBG());
		System.out.println("BloodBankName: "+getbloodBankName());
		System.out.println("Donor Type: "+getdonorType());
		System.out.println("Donation Date: "+getdonationDate());
	}
	
}
