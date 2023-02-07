import java.util.Scanner;

public class Auto extends VehicleP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void Select_Auto() {

		System.out.println("Select Your Cycle Brand");
		System.out.println(" "
				+ "1.TVS"
				+ " "
				+ "2.Bajaj"
				+ " ");
		Scanner sc_Auto =new Scanner(System.in);
		int Auto =sc_Auto.nextInt();

		//		
		switch (Auto) {

		case 1: {System.out.println("TVS");
		TVSDetails();}
		break;

		case 2: {System.out.println("Bajaj");
		BajajDetails();}
		break;

		default:System.out.println("Enter Correct Value");
		}
	}



	public void TVSDetails() {
		System.out.println(" ");
		System.out.println("TVS DELUXE");
		System.out.println("ENGINE CAPACITY :199.26cc ");
		System.out.println("HYDRAULIC BRAKES");
		System.out.println("FUEL TANK CAPACITY:8.5 LITRES(pETROL) ");
		System.out.println("AVAILABLE COLOURS : BLACK OR GREEN OR YELLOW");
		System.out.println("PRICE : INR 1,80,000/-");
		System.out.println(" ");
	}

	public void BajajDetails() {
		System.out.println(" ");
		System.out.println("BAJAJ RE");
		System.out.println("ENGINE CAPACITY: FOR DIESEL-470.5cc || FOR PETROL:236.2cc");
		System.out.println("OIL-COOLED ENGINE");
		System.out.println("FUEL TANK CAPACITY: LITRES(PETROL/DIESEL) ");
		System.out.println("AVAILABLE COLOURS : BLACK OR GREEN");
		System.out.println("PRICE : INR 2,60,000/-");
		System.out.println(" ");	 
	}
}
