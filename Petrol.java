import java.util.Scanner;


public class Petrol extends VehicleP{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void Select_Petrol() {

		System.out.println("Select Your Car Brand");
		System.out.println(" "
				+ "1.Maruti Suzuki"
				+ " "
				+ "2.Skoda"
				+ " "
				+ "3.Toyota"
				+ " ");
		Scanner sc_Petrol =new Scanner(System.in);
		int Petrol =sc_Petrol.nextInt();

		//		
		switch (Petrol) {

		case 1: {System.out.println("Maruti Suzuki");
		MarutiSuzuki();}
		break;

		case 2: {System.out.println("Skoda");
		Skoda();}
		break;

		case 3: {System.out.println("Toyota");
		Toyota();}
		break;

		default:System.out.println("Enter Correct Value");
		}
	}

	//Maruti Suzuki

	public void MarutiSuzuki() {

		System.out.println("Select Maruti Suzuki model"
				+ " "
				+ "1.Maruti Swift "
				+ " "
				+ "2.Mahindra Scorpio Classic"
				+ " ");
		Scanner sc_Suzuki =new Scanner(System.in);
		int model =sc_Suzuki.nextInt();

		switch (model) {
		case 1: {SwiftDetails();}
		break;
		case 2: {WagonRDetails();}
		break;

		default:
			throw new IllegalArgumentException(" Please select from mentioned options: " + model);
		}
	}

	public void SwiftDetails() {
		System.out.println(" ");
		System.out.println("Model Name: Maruti Swift ");
		System.out.println("Engine: 1197 cc");
		System.out.println("Transmission: Manual & Automatic (AMT)");
		System.out.println("Fuel Type: Petrol");
		System.out.println("Mileage: 22.38 to 30.9 kmpl");
		System.out.println("Seating Capacity:4 Seater");
		System.out.println("Colour : Red || White");
		System.out.println("Price: INR 5.91 Lakh ");
		System.out.println(" ");
	}

	public void WagonRDetails() {
		System.out.println(" ");
		System.out.println("Model Name:Maruti Wagon R ");
		System.out.println("Engine: 998 to 1197  cc");
		System.out.println("Transmission: Manual & Automatic (AMT))");
		System.out.println("Fuel Type: Petrol & CNG");
		System.out.println("Mileage: 23.5 to 34 kmpl");
		System.out.println("Seating Capacity:5 Seater");
		System.out.println("Colour : White || Silver");
		System.out.println("Price: INR 5.47 Lakh ");
		System.out.println(" ");
	}

	//Skoda	 

	public void Skoda() {

		System.out.println("Select Skoda model"
				+ " "
				+ "1.Skoda Superb "
				+ " "
				+ "2.Skoda Octavia"
				+ " ");
		Scanner sc_Skoda =new Scanner(System.in);
		int model =sc_Skoda.nextInt();

		switch (model) {
		case 1: {SuperbDetails();}
		break;
		case 2: {OctaviaDetails();}
		break;

		default:
			throw new IllegalArgumentException(" Please select from mentioned options: " + model);
		}
	}

	public void SuperbDetails() {
		System.out.println(" ");
		System.out.println("Model Name: Skoda Superb ");
		System.out.println("Engine: 1984 cc");
		System.out.println("Transmission: Automatic");
		System.out.println("Fuel Type: Petrol");
		System.out.println("Mileage: 16.46kmpl.");
		System.out.println("Seating Capacity:4 Seater");
		System.out.println("Colour : Silver || White || Race Blue,");
		System.out.println("Price: INR 34.17 Lakh ");
		System.out.println(" ");
	}

	public void OctaviaDetails() {
		System.out.println(" ");
		System.out.println("Model Name: Skoda Octavia ");
		System.out.println("Engine: 1984 cc");
		System.out.println("Transmission: Automatic)");
		System.out.println("Fuel Type: Petrol");
		System.out.println("Mileage: 14.46kmpl.");
		System.out.println("Seating Capacity:5 Seater");
		System.out.println("Colour : Black || Silver");
		System.out.println("Price: INR 27.34 Lakh ");
		System.out.println(" ");
	}
	//Toyota

	public void Toyota() {

		System.out.println("Select Toyota model"
				+ " "
				+ "1.Toyota Innova Crysta "
				+ " "
				+ "2.Toyota Fortuner"
				+ " ");
		Scanner sc_Toyota =new Scanner(System.in);
		int model =sc_Toyota.nextInt();

		switch (model) {
		case 1: {CrystaDetails();}
		break;
		case 2: {FortunerDetails();}
		break;

		default:
			throw new IllegalArgumentException(" Please select from mentioned options: " + model);
		}
	}

	public void CrystaDetails() {
		System.out.println(" ");
		System.out.println("Model Name: Toyota Innova Crysta");
		System.out.println("Engine: 2393 to 2694 cc");
		System.out.println("Transmission: Manual & Automatic (TC)");
		System.out.println("Fuel Type: Petrol");
		System.out.println("Mileage: 10.2 to 15.6 kmpl.");
		System.out.println("Seating Capacity: 7 Seater");
		System.out.println("Colour : White Pearl  || Sparkling Black");
		System.out.println("Price: INR 18.09 Lakh ");
		System.out.println(" ");
	}		 

	public void FortunerDetails() {
		System.out.println(" ");
		System.out.println("Model Name: Toyota Fortuner");
		System.out.println("Engine: 2694 to 2755 cc");
		System.out.println("Transmission: Manual & Automatic (TC)");
		System.out.println("Fuel Type: Petrol");
		System.out.println("Mileage: 10.2 to 14.4 kmpl.");
		System.out.println("Seating Capacity: 7 Seater");
		System.out.println("Colour : White Pearl  || Grey Metallic");
		System.out.println("Price: INR 32.58 Lakh ");
		System.out.println(" ");
	}	

}
