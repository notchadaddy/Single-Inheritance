package my_pac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Donor donor=new Donor();
		System.out.println("Enter Name:");
		donor.setName(sc.nextLine());
		System.out.println("Enter Date of Birth:");
		donor.setDOB(sc.nextLine());
		System.out.println("Enter Gender:");
		donor.setGender(sc.nextLine());
		System.out.println("Enter Mobile Number:");
		donor.setNum(sc.nextLine());
		System.out.println("Enter Blood Group:");
		donor.setBG(sc.nextLine());
		System.out.println("Enter Blood Bank Name:");
		donor.setbloodBankName(sc.nextLine());
		System.out.println("Enter Donor Type:");
		donor.setdonorType(sc.nextLine());
		System.out.println("Enter Donation Date:");
		donor.setdonationDate(sc.nextLine());
		donor.displayDonationDetails();

	}

}
