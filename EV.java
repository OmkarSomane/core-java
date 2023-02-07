import java.util.Scanner;
public class EV extends VehicleP{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void Select_EV() {

		System.out.println("Select Your Car Brand");
		System.out.println(" "
				+ "1.TATA"
				+ " "
				+ "2.Tesla"
				+ " ");
		;
		Scanner sc_EV =new Scanner(System.in);
		int EV =sc_EV.nextInt();

		//		
		switch (EV) {

		case 1: {System.out.println("TATA");
		TATA();}
		break;

		case 2: {System.out.println("Tesla");
		Tesla();}
		break;

		default:System.out.println("Enter Correct Value");
		}
	}

	//TATA

	public void TATA() {

		System.out.println("Select TATA model"
				+ " "
				+ "1.Tata Tigor EV"
				+ " "
				+ "2.Tata Nexon EV "
				+ " ");
		Scanner sc_TATA =new Scanner(System.in);
		int model =sc_TATA.nextInt();

		switch (model) {
		case 1: {TigorDetails();}
		break;
		case 2: {NexonDetails();}
		break;

		default:
			throw new IllegalArgumentException(" Please select from mentioned options: " + model);
		}
	}

	public void TigorDetails() {
		System.out.println(" ");
		System.out.println("Model Name: Tata Tigor EV");
		System.out.println("Battery Capacity: 26 kWh");
		System.out.println("Transmission: Automatic ");
		System.out.println("Fuel Type: Electric");
		System.out.println("Driving Range: 306 km");
		System.out.println("Seating Capacity: 4 Seater");
		System.out.println("Colour : Teal Blue || Grey");
		System.out.println("Price: INR 12.49 Lakh ");
		System.out.println(" ");
	}

	public void NexonDetails() {
		System.out.println(" ");
		System.out.println("Model Name: Tata Nexon EV ");
		System.out.println("Battery Capacity: 30.2 kWh");
		System.out.println("Transmission: Automatic ");
		System.out.println("Fuel Type: Electric");
		System.out.println("Driving Range: 312 km");
		System.out.println("Seating Capacity: 5 Seater");
		System.out.println("Colour : Teal Blue || White");
		System.out.println("Price: INR 14.49 Lakh ");
		System.out.println(" ");
	}


	//TESLA

	public void Tesla() {

		System.out.println("Select Tesla model"
				+ " "
				+ "1.Tesla model X"
				+ " "
				+ "2.Tesla model S "
				+ " ");
		Scanner sc_Tesla =new Scanner(System.in);
		int model =sc_Tesla.nextInt();

		switch (model) {
		case 1: {modelXDetails();}
		break;
		case 2: {modelSDetails();}
		break;

		default:
			throw new IllegalArgumentException(" Please select from mentioned options: " + model);
		}
	}

	public void modelXDetails() {
		System.out.println(" ");
		System.out.println("Model Name: Tesla model X");
		System.out.println("Battery Capacity: 30 kWh");
		System.out.println("Transmission: Automatic ");
		System.out.println("Fuel Type: Electric");
		System.out.println("Driving Range: 312 km");
		System.out.println("Seating Capacity: 5 Seater");
		System.out.println("Colour : Red");
		System.out.println("Price: INR 45.54 Lakh ");
		System.out.println(" ");
	}

	public void modelSDetails() {
		System.out.println(" ");
		System.out.println("Model Name: Tesla model S ");
		System.out.println("Battery Capacity: 28 kWh");
		System.out.println("Transmission: Automatic ");
		System.out.println("Fuel Type: Electric");
		System.out.println("Driving Range: 285 km");
		System.out.println("Seating Capacity: 4 Seater");
		System.out.println("Colour : Black");
		System.out.println("Price: INR 35.12 Lakh ");
		System.out.println(" ");
	}

}

