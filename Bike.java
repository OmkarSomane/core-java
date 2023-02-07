

import java.util.Scanner;

public class Bike extends VehicleP {
	public static void main(String[] args) {

	}

	public void Select_bike() {

		System.out.println("Select Your Bike Brand");
		System.out.println(" "
				+ "1.Hero"
				+ " "
				+ "2.TVS"
				+ " "
				+ "3.RoyalEnfield"
				+ " "
				+ "4.KTM"
				+ " ");
		Scanner sc_bike =new Scanner(System.in);
		int bike =sc_bike.nextInt();

		//			
		switch (bike) {

		case 1: {System.out.println("Hero MotorCycles");
		Hero_MotorCycles();}
		break;

		case 2: {System.out.println("TVS bikes");
		TVS();}
		break;

		case 3: {System.out.println("RoyalEnfield");
		RoyalEnfield();}
		break;

		case 4: {System.out.println("KTM");
		KTM();}
		break;

		default:
			System.out.println("Enter Correct Value");
			bike =sc_bike.nextInt();
			switch (bike) {

			case 1: {System.out.println("Hero MotorCycles");
			Hero_MotorCycles();}
			break;

			case 2: {System.out.println("TVS bikes");
			TVS();}
			break;

			case 3: {System.out.println("RoyalEnfield");
			RoyalEnfield();}
			break;

			case 4: {System.out.println("KTM");
			KTM();}
			break;
			}



		}
	}
	//HERO

	public void Hero_MotorCycles() {

		System.out.println("Select from Hero_MotorCycles "
				+ " "
				+ "1.Hero Splendor pro"
				+ " "
				+ "2.Hero Passion Plus"
				+ " "
				+ "3.Hero Glamour"
				+ " "
				+ "4.Hero Xtreme160");
		Scanner sc_hero =new Scanner(System.in);
		int model =sc_hero.nextInt();

		switch (model) {
		case 1: {Splendor_proDetails();}
		break;
		case 2: {Passion_PlusDetails();}
		break;
		case 3: {GlamourDetails();}
		break;
		case 4: {Xtreme160Details();}
		break;
		default:
			throw new IllegalArgumentException(" Please select from mentioned options: " + model);
		}
	}

	public void Splendor_proDetails() {
		System.out.println(" ");
		System.out.println("Splendor_pro");
		System.out.println("ENGINE:97.2cc ");
		System.out.println("MILEAGE : 60 KMPL");
		System.out.println("FUEL TANK CAPACITY:10 LITRES ");
		System.out.println("AVAILABLE COLOURS : Techno Blue OR GREY Sports Red");
		System.out.println("PRICE : INR 60,000/-");
		System.out.println(" ");
	}

	public void Passion_PlusDetails() {
		System.out.println(" ");
		System.out.println("Passion_Plus");
		System.out.println("110cc ENGINE :110cc ");
		System.out.println("MILEAGE : 55 KMPL");
		System.out.println("FUEL TANK CAPACITY:10 LITRES ");
		System.out.println("AVAILABLE COLOURS : Glaze Black");
		System.out.println("PRICE : INR 73,000/-");
		System.out.println(" ");
	}

	public void GlamourDetails() {
		System.out.println(" ");
		System.out.println("Glamour");
		System.out.println("124.7cc ENGINE:124.7cc ");
		System.out.println("MILEAGE : 55 KMPL");
		System.out.println("FUEL TANK CAPACITY:10 LITRES ");
		System.out.println("AVAILABLE COLOURS : SunSet Gold OR Canvas Black");
		System.out.println("PRICE : INR 83,256/-");
		System.out.println(" ");
	}

	public void Xtreme160Details() {
		System.out.println(" ");
		System.out.println("Xtreme160");
		System.out.println("163 cc ENGINE:163 cc ");
		System.out.println("MILEAGE : 46 KMPL");
		System.out.println("FUEL TANK CAPACITY:12 LITRES ");
		System.out.println("AVAILABLE COLOURS : RED METALLIC OR GREY METALLIC");
		System.out.println("PRICE : INR 1,19,570 /-");
		System.out.println(" ");
	}

	//TVS

	public void TVS() {

		System.out.println("Select TVS  model"
				+ " "
				+ "1.TVS Apache RTR 160"
				+ " "
				+ "2.TVS Sports"
				+ " ");
		Scanner sc_TVS =new Scanner(System.in);
		int model =sc_TVS.nextInt();

		switch (model) {
		case 1: {Tvs_Apche160R();}
		break;
		case 2: {TVS_Sports();}
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + model);
		}
	}
	public void Tvs_Apche160R() {
		System.out.println(" ");
		System.out.println("TVS Apache RTR 160");
		System.out.println("ENGINE:159.7 cc ");
		System.out.println("MILEAGE : 45 KMPL");
		System.out.println("FUEL TANK CAPACITY:12 LITRES ");
		System.out.println("AVAILABLE COLOURS : Racing Red || Pearl White");
		System.out.println("PRICE : INR 1,22,410 /-");
		System.out.println(" ");
	}

	public void TVS_Sports() {
		System.out.println(" ");
		System.out.println("TVS Sport");
		System.out.println("ENGINE:109.7 cc ");
		System.out.println("MILEAGE : 70 KMPL");
		System.out.println("FUEL TANK CAPACITY:10 LITRES ");
		System.out.println("AVAILABLE COLOURS :  Red || Black");
		System.out.println("PRICE : INR 61,577 /-");
		System.out.println(" ");
	}


	// RoyalEnfield
	public void RoyalEnfield() {

		System.out.println("Select RoyalEnfield  model"
				+ " "
				+ "1.Classic350"
				+ " "
				+ "2.Thunderbird"
				+ " ");
		Scanner sc_RoyalEnfield =new Scanner(System.in);
		int model =sc_RoyalEnfield.nextInt();

		switch (model) {
		case 1: {Classic350();}
		break;
		case 2: {Thunderbird();}
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + model);
		}
	}

	public void Classic350() {
		System.out.println(" ");
		System.out.println("Royal Enfield Classic 350");
		System.out.println("ENGINE: 349 cc ");
		System.out.println("MILEAGE : 35 KMPL");
		System.out.println("FUEL TANK CAPACITY:13 LITRES ");
		System.out.println("AVAILABLE COLOURS :  Red || Black");
		System.out.println("PRICE : INR 1,90,229 /-");
		System.out.println(" ");
	}

	public void Thunderbird() {
		System.out.println(" ");
		System.out.println("Royal Enfield Thunderbird");
		System.out.println("ENGINE: 346 cc ");
		System.out.println("MILEAGE : 35 KMPL");
		System.out.println("FUEL TANK CAPACITY:13 LITRES ");
		System.out.println("AVAILABLE COLOURS :  Navy Blue || Black");
		System.out.println("PRICE : INR 1,29,865 /-");
		System.out.println(" ");
	}




	//KTM	

	public void KTM() {

		System.out.println("Select KTM  model"
				+ " "
				+ "1.KTM 250 Duke"
				+ " "
				+ "2.KTM RC200"
				+ " ");
		Scanner sc_KTM =new Scanner(System.in);
		int model =sc_KTM.nextInt();

		switch (model) {
		case 1: {KTM_250Duke();}
		break;
		case 2: {KTM_RC200();}
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + model);
		}
	}

	public void KTM_250Duke() {
		System.out.println(" ");
		System.out.println("KTM Duke 250");
		System.out.println("ENGINE: 248.76 cc ");
		System.out.println("MILEAGE : 32 KMPL");
		System.out.println("FUEL TANK CAPACITY:13.4 LITRES ");
		System.out.println("AVAILABLE COLOURS :  Orange/Black");
		System.out.println("PRICE : INR 2,36,090 /-");
		System.out.println(" ");
	}

	public void KTM_RC200() {
		System.out.println(" ");
		System.out.println("KTM RC 200");
		System.out.println("ENGINE: 199.5 cc ");
		System.out.println("MILEAGE : 34.5 KMPL");
		System.out.println("FUEL TANK CAPACITY: 13.7 LITRES ");
		System.out.println("AVAILABLE COLOURS :  Orange/Black");
		System.out.println("PRICE : INR 2,13,697 /-");
		System.out.println(" ");
	}









}
