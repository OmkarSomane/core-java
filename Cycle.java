import java.util.Scanner;

public class Cycle extends VehicleP {

	public static void main(String[] args) {

	}
	public void Select_cycle() {

		System.out.println("Select Your Cycle Brand");
		System.out.println(" "
				+ "1.Hero"
				+ " "
				+ "2.Hercules"
				+ " "
				+ "3.Vector91"
				+ " ");
		Scanner sc_cycle =new Scanner(System.in);
		int cycle =sc_cycle.nextInt();

		//		
		switch (cycle) {

		case 1: {System.out.println("Hero Cycles");
		Hero();}
		break;

		case 2: {System.out.println("Hercules");
		Hercules();}
		break;

		case 3: {System.out.println("Vector91");
		Vector91();}
		break;

		default:System.out.println("Enter Correct Value"+cycle);
		}
	}

	//HERO

	public void Hero() {

		System.out.println("Select Hero model"
				+ " "
				+ "1.Razorback"
				+ " "
				+ "2.DTB"
				+ " "
				+ "3.Sprint");
		Scanner sc_hero =new Scanner(System.in);
		int model =sc_hero.nextInt();

		switch (model) {
		case 1: {razorbackDetails();}
		break;
		case 2: {DTBDetails();}
		break;
		case 3: {SprintDetails();}
		break;
		default:
			throw new IllegalArgumentException(" Please select from mentioned options: " + model);
		}
	}

	public void razorbackDetails() {
		System.out.println("Model Name: Razorback");
		System.out.println("No.of Speed: 5");
		System.out.println("Colour : Blue/Black");
		System.out.println("Price: Rs.5,500");	 
	}

	public void DTBDetails() {
		System.out.println("Model Name: DTB(Dirt Terrain Bike");
		System.out.println("No.of Speed: 6");
		System.out.println("Colour: Red/Black");
		System.out.println("Price: Rs.7,500");	 
	}

	public void SprintDetails() {
		System.out.println("Model Name: Hero Sprint");
		System.out.println("No.of Speed: 4");
		System.out.println("Colour: Green/Black");
		System.out.println("Price: Rs.6,500");	 
	}



	//HERCULES

	public void Hercules() {

		System.out.println("Select Hercules  model"
				+ " "
				+ "1.Rodeo"
				+ " "
				+ "2.UrbanTerrain"
				+ " ");
		Scanner sc_hercules =new Scanner(System.in);
		int model =sc_hercules.nextInt();

		switch (model) {
		case 1: {RodeoDetails();}
		break;
		case 2: {UrbanTerrainDetails();}
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + model);
		}
	}


	public void RodeoDetails() {
		System.out.println("Model Name: Rodeo");
		System.out.println("No.of Speed: 5");
		System.out.println("Colour: White/Black");
		System.out.println("Price: Rs.7,500");	 
	}

	public void UrbanTerrainDetails() {
		System.out.println("Model Name: UrbanTerrainDetails");
		System.out.println("No.of Speed: 4");
		System.out.println("Colour: Brown/Black");
		System.out.println("Price: Rs.6,500");	 
	}




	// Vector91
	public void Vector91() {

		System.out.println("Select Vector91  model"
				+ " "
				+ "1.Spartan_X"
				+ " "
				+ "2.SkullRider"
				+ " ");
		Scanner sc_Vector91 =new Scanner(System.in);
		int model =sc_Vector91.nextInt();

		switch (model) {
		case 1: {Spartan_X();}
		break;
		case 2: {SkullRider();}
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + model);
		}
	}


	public void Spartan_X() {
		System.out.println("Model Name: Spartan_X");
		System.out.println("No.of Speed: 17");
		System.out.println("Colour: Red/Black");
		System.out.println("Price: Rs.10,500");	 
	}

	public void SkullRider() {
		System.out.println("Model Name: SkullRider ");
		System.out.println("No.of Speed: 21");
		System.out.println("Colour: Orange/Black");
		System.out.println("Price: Rs.13,500");	 
	}

}


