import java.util.*;

public class VehicleP {


	static {
		System.out.println("Welcome to the Vehicle Showroom");
		System.out.println(" ");
	}

	public static void main(String[] args) {
		System.out.println("Enter Vehicle type"
				+ " "
				+ "1.Two Wheeler"
				+ "|| "
				+ "2.Three Wheeler"
				+ "|| "
				+ "3.Four Wheeler");
		Scanner sc1 = new Scanner (System.in); 
		int V_type = sc1.nextInt();

		switch (V_type) {
		case 1: { System.out.println("1.Cycle"
				+ " "
				+ "2.Bike"
				+ " "
				+ "3.Scooter"
				+ " ");}
		break;

		case 2: { System.out.println("4.Auto-Rikshaw"
				+ " ");}
		break;

		case 3: { System.out.println("5.Petrol"
				+ " "
				+ "6.Diesel"
				+ " "
				+ "7.EV"
				+ " ");}
		break;
		default:

			System.out.println("Enter correctly" );
			int v_type=sc1.nextInt();

			switch (V_type) {
			case 1: { System.out.println("1.Cycle"
					+ " "
					+ "2.Bike"
					+ " "
					+ "3.Scooter"
					+ " ");}
			break;

			case 2: { System.out.println("4.Auto-Rikshaw"
					+ " ");}
			break;

			case 3: { System.out.println("5.Petrol"
					+ " "
					+ "6.Diesel"
					+ " "
					+ "7.EV"
					+ " ");}
			break;

			}}

		Cycle  c = new Cycle();
		Bike   b = new Bike();
		Scooter S = new Scooter();
		Auto   a = new Auto();
		Petrol p = new Petrol();
		Diesel d = new Diesel();
		EV e = new EV();
		Details details = new Details();


		Scanner s = new Scanner (System.in);
		System.out.println("-----");
		System.out.println("Enter Vehicle Category");
		String input =s.nextLine();

		switch (input) {
		case "1": {c.Select_cycle();}
		break;
		case "2": {b.Select_bike();}
		break;
		case "3": {S.Select_Scooter();}
		break;
		case "4": {a.Select_Auto();}
		break;
		case "5": {p.Select_Petrol();}
		break;
		case "6": {d.Select_Diesel();}
		break;
		case "7": {e.Select_EV();}
		break;

		default:System.out.println("enter again correctly"+ input);
		}
		
		System.out.println(" ");
		System.out.println("Please Enter Your Details for Payment");
		Scanner sc_d1 = new Scanner(System.in);
		Scanner sc_d2 = new Scanner(System.in);
		Scanner sc_d3 = new Scanner(System.in);
		
		System.out.println("Enter your Name");
		String Name=sc_d1.nextLine();
		details.setName(Name);
		System.out.println("Enter your Mob.No");
		//long Mob_No=sc_d.nextLong();
		//details.setMob_No(Mob_No);
		System.out.println("Enter your Address");
		String Address=sc_d3.nextLine();
		details.setAddress(Address);
		
		System.out.println(" ");
		System.out.println("Your details are");
		System.out.println("Name:"+details.getName());
		//System.out.println(details.getMob_No());
		System.out.println("Address:"+details.getAddress());
		
		
	}









}







