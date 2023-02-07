import java.util.Scanner;

public class Scooter extends VehicleP {

	public static void main(String[] args) {
	}
	public void Select_Scooter() {

		System.out.println("Select Your Scooter Brand");
		System.out.println(" "
				+ "1.Hero"
				+ " "
				+ "2.Honda"
				+ " "
				+ "3.Yamaha"
				+ " ");
		Scanner sc_Scooter =new Scanner(System.in);
		int Scooter =sc_Scooter.nextInt();

		//		
		switch (Scooter) {

		case 1: {System.out.println("Hero");
		Hero();}
		break;

		case 2: {System.out.println("Honda");
		Honda();}
		break;

		case 3: {System.out.println("Yamaha");
		Yamaha();}
		break;

		default:System.out.println("Enter Correct Value"+ sc_Scooter.nextInt());
		}
	}

	//HERO

	public void Hero() {

		System.out.println("Select Hero model"
				+ " "
				+ "1.Hero Pleasure + "
				+ ""
				+ " "
				+ "2.Hero Maestro Edge 125 "
				+ " ");
		Scanner sc_Hero =new Scanner(System.in);
		int model =sc_Hero.nextInt();

		switch (model) {
		case 1: {PleasureDetails();}
		break;
		case 2: {MaestroEdgeDetails();}
		break;
		default:
			throw new IllegalArgumentException(" Please select from mentioned options: " + model);
		}
	}

	public void PleasureDetails() {
		System.out.println(" ");
		System.out.println("Hero Pleasure +");
		System.out.println("ENGINE CAPACITY: 110.9 cc");
		System.out.println("MILEAGE : 50 KMPL");
		System.out.println("FUEL TANK CAPACITY:	4.8 litres ");
		System.out.println("AVAILABLE COLOURS : Sporty Red OR Midnight Black ");			
		System.out.println("PRICE : INR 68,847/-");
		System.out.println(" ");
	}

	public void MaestroEdgeDetails() {
		System.out.println(" ");
		System.out.println("Hero Maestro Edge 125");
		System.out.println("ENGINE CAPACITY: 124.6 cc");
		System.out.println("MILEAGE : 45 KMPL");
		System.out.println("FUEL TANK CAPACITY:	4.6 litres ");
		System.out.println("AVAILABLE COLOURS :Prismatic Yellow OR Panther Black(2021) ");			
		System.out.println("PRICE : INR 87,827/-");
		System.out.println(" ");
	}





	//HONDA

	public void Honda() {

		System.out.println("Select Honda  model"
				+ " "
				+ "1.Dio"
				+ " "
				+ "2.Activa 6G"
				+ " ");
		Scanner sc_Honda =new Scanner(System.in);
		int model =sc_Honda.nextInt();

		switch (model) {
		case 1: {DioDetails();}
		break;
		case 2: {ActivaDetails();}
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + model);
		}
	}


	public void DioDetails() {
		System.out.println(" ");
		System.out.println("Dio");
		System.out.println("ENGINE CAPACITY:109.51cc ");
		System.out.println("MILEAGE : 48 KMPL");
		System.out.println("FUEL TANK CAPACITY:5.3 litres ");
		System.out.println("AVAILABLE COLOURS : RED OR GREY METALLIC");
		System.out.println("PRICE : INR 71,132/-");
		System.out.println(" ");
	}

	public void ActivaDetails() {
		System.out.println(" ");
		System.out.println("Activa 6G");
		System.out.println("ENGINE CAPACITY:109.51cc ");
		System.out.println("MILEAGE : 47 KMPL");
		System.out.println("FUEL TANK CAPACITY:5.3 LITRES ");
		System.out.println("AVAILABLE COLOURS : WHITE OR GREEN METALLIC");
		System.out.println("PRICE : INR 73,400/-");
		System.out.println(" ");
	}

	//	83,273   79,456

	// YAMAHA
	public void Yamaha() {

		System.out.println("Select Yamaha model"
				+ " "
				+ "1.Yamaha Ray ZR 125"
				+ " "
				+ "2.Yamaha Fascino 125"
				+ " ");
		Scanner sc_Yamaha =new Scanner(System.in);
		int model =sc_Yamaha.nextInt();

		switch (model) {
		case 1: {RayZRDetails();}
		break;
		case 2: {FascinoDetails();}
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + model);
		}
	}


	public void RayZRDetails() {
		System.out.println(" ");
		System.out.println("Yamaha Ray ZR 125");
		System.out.println("ENGINE CAPACITY:125cc ");
		System.out.println("MILEAGE :52 kmpl");
		System.out.println("FUEL TANK CAPACITY:5.2 LITRES ");
		System.out.println("AVAILABLE COLOURS : Red OR Blue");
		System.out.println("PRICE : INR 83,273 /-");
		System.out.println(" ");
	}

	public void FascinoDetails() {
		System.out.println(" ");
		System.out.println("Yamaha Fascino 125");
		System.out.println("ENGINE CAPACITY:124.51cc ");
		System.out.println("MILEAGE : 50 kmpl");
		System.out.println("FUEL TANK CAPACITY:	5.2 litres ");
		System.out.println("AVAILABLE COLOURS : WHITE OR matte Black");
		System.out.println("PRICE : INR  90,944/-");
		System.out.println(" ");
	}

}




