import java.util.Scanner;

public class Diesel extends VehicleP{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void Select_Diesel() {

		System.out.println("Select Your Car Brand");
		System.out.println(" "
				+ "1.Mahindra"
				+ " "
				+ "2.Hyundai"
				+ " "
				+ "3.Mercedes"
				+ " ");
		Scanner sc_Diesel =new Scanner(System.in);
		int Diesel =sc_Diesel.nextInt();

		//		
		switch (Diesel) {

		case 1: {System.out.println("Mahindra");
		Mahindra();}
		break;

		case 2: {System.out.println("Hyundai");
		Hyundai();}
		break;

		case 3: {System.out.println("Mercedes");
		Mercedes();}
		break;

		default:System.out.println("Enter Correct Value");
		}
	}

	//Mahindra

	public void Mahindra() {

		System.out.println("Select Mahindra model"
				+ " "
				+ "1.Mahindra Thar"
				+ " "
				+ "2.Mahindra Scorpio Classic"
				+ " ");
		Scanner sc_Mahindra =new Scanner(System.in);
		int model =sc_Mahindra.nextInt();

		switch (model) {
		case 1: {TharDetails();}
		break;
		case 2: {ScorpioDetails();}
		break;

		default:
			throw new IllegalArgumentException(" Please select from mentioned options: " + model);
		}
	}

	public void TharDetails() {
		System.out.println(" ");
		System.out.println("Model Name: Mahindra Thar");
		System.out.println("Engine: 1497 to 2184 cc");
		System.out.println("Transmission: Manual & Automatic (TC)");
		System.out.println("Fuel Type: Diesel");
		System.out.println("Mileage: 15 kmpl");
		System.out.println("Seating Capacity:4 Seater");
		System.out.println("Colour : Red || Black");
		System.out.println("Price: INR 9.99 Lakh ");
		System.out.println(" ");
	}

	public void ScorpioDetails() {
		System.out.println(" ");
		System.out.println("Model Name:Mahindra Scorpio Classic");
		System.out.println("Engine: 2184 cc");
		System.out.println("Transmission: Manual)");
		System.out.println("Fuel Type: Diesel");
		System.out.println("Mileage: 14.5 kmpl - 14.65 kmpl");
		System.out.println("Seating Capacity:7 & 9 Seater");
		System.out.println("Colour : White || Black");
		System.out.println("Price: INR 11.99 Lakh ");
		System.out.println(" ");
	}


	//Hyundai

	public void Hyundai() {

		System.out.println("Select Hyundai model"
				+ " "
				+ "1.Hyundai Creta"
				+ " "
				+ "2.Mahindra Scorpio Classic"
				+ " ");
		Scanner sc_Hyundai =new Scanner(System.in);
		int model =sc_Hyundai.nextInt();

		switch (model) {
		case 1: {CretaDetails();}
		break;
		case 2: {ScorpioDetails();}
		break;

		default:
			throw new IllegalArgumentException(" Please select from mentioned options: " + model);
		}
	}

	public void CretaDetails() {
		System.out.println(" ");
		System.out.println("Model Name: Hyundai Creta");
		System.out.println("Engine: 1353 to 1497 cc");
		System.out.println("Transmission: Manual & Automatic (CVT)");
		System.out.println("Fuel Type: Diesel");
		System.out.println("Mileage: ");
		System.out.println("Seating Capacity: 5 Seater");
		System.out.println("Colour : White || Black");
		System.out.println("Price: INR 10.64 Lakh ");
		System.out.println(" ");
	}

	public void VernaDetails() {
		System.out.println(" ");
		System.out.println("Model Name: Hyundai Verna");
		System.out.println("Engine: 998 to 1497 cc");
		System.out.println("Transmission: Manual & Automatic (CVT)");
		System.out.println("Fuel Type: Diesel");
		System.out.println("Mileage: 17.7 to 25 kmpl");
		System.out.println("Seating Capacity: 5 Seater");
		System.out.println("Colour : Silver|| Grey || Black");
		System.out.println("Price: INR 9.63 Lakh ");
		System.out.println(" ");
	}	 

	// Mercedes

	public void Mercedes() {

		System.out.println("Select Mercedes model"
				+ " "
				+ "1.Mercedes-Benz GLS"
				+ " "
				+ "2.Mahindra Scorpio Classic"
				+ " ");
		Scanner sc_Mercedes =new Scanner(System.in);
		int model =sc_Mercedes.nextInt();

		switch (model) {
		case 1: {BenzGLSDetails();}
		break;
		case 2: {ScorpioDetails();}
		break;

		default:
			throw new IllegalArgumentException(" Please select from mentioned options: " + model);
		}
	}

	public void BenzGLSDetails() {
		System.out.println(" ");
		System.out.println("Model Name: Mercedes-Benz GLS");
		System.out.println("Engine: 2925 to 2999 cc");
		System.out.println("Transmission: Automatic (TC)");
		System.out.println("Fuel Type: Diesel");
		System.out.println("Mileage: 12.5 kmpl");
		System.out.println("Seating Capacity: 5 Seater");
		System.out.println("Colour : White || Black");
		System.out.println("Price: INR 1.19 Crore");
		System.out.println(" ");
	}		 

	public void BenzEClass() {
		System.out.println(" ");
		System.out.println("Model Name: Mercedes-Benz E-Class");
		System.out.println("Engine: 1950 to 2925 cc");
		System.out.println("Transmission: Automatic (TC)");
		System.out.println("Fuel Type: Diesel");
		System.out.println("Mileage: 12.06 kmpl");
		System.out.println("Seating Capacity: 5 Seater");
		System.out.println("Colour : Polar White || Black");
		System.out.println("Price: INR  72.48 Lakh");
		System.out.println(" ");
	}	 

}

