package solo;
import java.util.Scanner;

public class AircraftMenu {
	private static String nameOfAircraft;
	private static String manufacturer;
	private static String aircraftType;
	private static String aircraftDetail;
	private static String aircraftMission;
	private static int fuelCap;
	private static int maxSpeed;
	private static int maxRange;
	private static int cruiseSpeed;
	private static float unitCost;
	
	// Getter and Setter 
	public static String getNameOfAircraft() {
		return nameOfAircraft;
	}

	public static void setNameOfAircraft(String nameOfAircraft) {
		AircraftMenu.nameOfAircraft = nameOfAircraft;
	}

	public static String getManufacturer() {
		return manufacturer;
	}

	public static void setManufacturer(String manufacturer) {
		AircraftMenu.manufacturer = manufacturer;
	}

	public static String getAircraftType() {
		return aircraftType;
	}

	public static void setAircraftType(String aircraftType) {
		AircraftMenu.aircraftType = aircraftType;
	}

	public static String getAircraftDetail() {
		return aircraftDetail;
	}

	public static void setAircraftDetail(String aircraftDetail) {
		AircraftMenu.aircraftDetail = aircraftDetail;
	}

	public static String getAircraftMission() {
		return aircraftMission;
	}

	public static void setAircraftMission(String aircraftMission) {
		AircraftMenu.aircraftMission = aircraftMission;
	}

	public static int getFuelCap() {
		return fuelCap;
	}

	public static void setFuelCap(int fuelCap) {
		AircraftMenu.fuelCap = fuelCap;
	}

	public static int getMaxSpeed() {
		return maxSpeed;
	}

	public static void setMaxSpeed(int maxSpeed) {
		AircraftMenu.maxSpeed = maxSpeed;
	}

	public static int getMaxRange() {
		return maxRange;
	}

	public static void setMaxRange(int maxRange) {
		AircraftMenu.maxRange = maxRange;
	}

	public static int getCruiseSpeed() {
		return cruiseSpeed;
	}

	public static void setCruiseSpeed(int cruiseSpeed) {
		AircraftMenu.cruiseSpeed = cruiseSpeed;
	}

	public static float getUnitCost() {
		return unitCost;
	}

	public static void setUnitCost(float unitCost) {
		AircraftMenu.unitCost = unitCost;
	}

	public static void Jets() {
		
	}
	
	public static void AircraftDetails() {
	
	}	
	
	public static void  AircraftAdd(Scanner scanner ) {

			System.out.print("\tPlease enter name of aircraft: ");
			nameOfAircraft =scanner.next();
			System.out.print("\tPlease enter aircraft manufacturer: ");
			manufacturer = scanner.next();
			System.out.print("\tPlease enter aircraft type: ");
			aircraftType = scanner.next();
			System.out.println("\tPlease enter aircraft details: ");
			aircraftDetail = scanner.next();
			System.out.println("\tPlease enter aircraft mission: ");
			aircraftMission = scanner.next();
			System.out.println("\tPlease enter aircraft fuel capacity: ");
			fuelCap = scanner.nextInt();
			System.out.println("\tPlease enter aircraft max speed: ");
			maxSpeed = scanner.nextInt();
			System.out.println("\tPlease enter aircraft cruise speed: ");
			cruiseSpeed = scanner.nextInt();
			System.out.println("\tPlease enter aircraft range at max speed(Nautical miles): ");
			maxRange = scanner.nextInt();
			System.out.println("\tPlease enter purchase price per aircraft: ");
			unitCost = scanner.nextInt();
			
		}
		
	public static void Menu() {
		int select = 0;
		Scanner scanner = new Scanner(System.in);
	
		while (true) {
			System.out.println();		
			System.out.println("\t   Aircraft Dealers of America                                           ");		
			System.out.println("\t--------------------------------------------------------------------");
			System.out.println("\t  (1) Aircraft Menu                                                            ");		
			System.out.println("\t--------------------------------------------------------------------");
			System.out.println("\t  (2) Pilot Roster                                                                ");		
			System.out.println("\t--------------------------------------------------------------------");
			System.out.println("\t  (3) Quit                                                                            ");		
			System.out.println("\t--------------------------------------------------------------------");
			System.out.println();
			System.out.print("\t Please make a selection: ");
			select = scanner.nextInt(); 
			
			switch (select) {
				case 1:
					AircraftMenu();
					break;
				case 2:
					PilotMenu();
					break;
				case 3:
					Menu();
					break;
				default:
					System.out.println("\tPlease make a selection of (1), (2), or (3): ");
					break;
			}
			scanner.close();
		}
		
	}
	
	public static void AircraftMenu(Scanner scanner) {
			int select = 0;
		
			while (true) {
		
			System.out.println();		
			System.out.println("\t         Aircraft Dealers of America                                    ");		
			System.out.println("\t--------------------------------------------------------------------");
			System.out.println("\t  (1) List of aircraft in inventory                                       ");		
			System.out.println("\t--------------------------------------------------------------------");
			System.out.println("\t  (2) Fastest aircraft in inventory                                       ");		
			System.out.println("\t--------------------------------------------------------------------");
			System.out.println("\t  (3) Aircraft with the longest range in inventory              ");		
			System.out.println("\t--------------------------------------------------------------------");
			System.out.println("\t  (4) Add new aircraft to inventory                                    ");		
			System.out.println("\t--------------------------------------------------------------------");
			System.out.println("\t  (5) Return to main menu                                                 ");		
			System.out.println("\t--------------------------------------------------------------------");

			System.out.println();
			
			System.out.print("\t Please enter your selection: " );
			select = scanner.nextInt();
		
			
			switch (select){
				case 1:		// System.out.println(printArray);
					System.out.println("\tPlease review our inventory.");
					System.out.println();
					break;
				case 2: 	// check inventory for fastest max speed
					System.out.println("\tThis aircraft is the fastest in our inventory.");
					System.out.println();
					break;
				case 3:		// check foe aircraft with the longest range
					System.out.println("\tThis aircraft has the longest range at cruise speed.");
					System.out.println();
					System.out.println("\tThis aircraft has the longest range at max speed.");
					System.out.println();
					break;
				case 4:		// add an aircraft to inventory
					System.out.println("\tTo add additional aircraft to the inventory. "
							+ "Please provide all of the aircraft data below.");
					System.out.println();
					break;
				case 5:		// quit program
					System.out.println("\tGood bye. Exiting...");
					Menu();
					break;
				default:
					System.out.print("\tPlease make a selection: ");
				}
		}
	}
	
	public static void PilotMenu(Scanner scanner) {
			int pilotSelect = 0;
		
				while (true) {
						
				System.out.println();
				System.out.println("\t    Aircraft Dealers of America                                 ");				
				System.out.println("\t-------------------------------------------------------------");
				System.out.println("\t  (1) List of pilot on roster                                        ");		
				System.out.println("\t-------------------------------------------------------------");
				System.out.println("\t  (2) Input new pilot data                                         ");		
				System.out.println("\t-------------------------------------------------------------");
				System.out.println("\t  (3) Return to main menu                                        ");		
				System.out.println("\t-------------------------------------------------------------");
				
				System.out.print("\t Please enter your selection: " );
				pilotSelect = scanner.nextInt();
					
				switch (pilotSelect) {
					case 1:
						System.out.println("\tThe following is a roster of our "
								+ "current pilots: ");
						break;
					case 2:
						System.out.println("\tPlease provide the following field for "
								+ " the pilot to be added. ");
						break;
					case 3:
						Menu();
						break;
					default:
						System.out.print("\tPlease make a selection of (1), (2), or (3): ");
						break;
				}
			}
	}
	
	public static void PilotInfo() {
		String[] pilotName = new String [5];
		pilotName [0] = "Aaron Airfield ";
		pilotName [1] = "Bob Blade";
		pilotName [2] = "Charlie Chute";
		pilotName [3] = "David Delta ";
		pilotName [4] = "Ed Engineer";
		
		int[] pilotAge = new int [5];
		pilotAge [0] = 35;
		pilotAge [1] = 45;
		pilotAge [2] = 37;
		pilotAge [3] = 32;
		pilotAge [4] = 40;
		
		boolean[] pilotMil = new boolean [5];
		pilotMil [0] = true;
		pilotMil [1] = true;
		pilotMil [2] = true;
		pilotMil [3] = true;
		pilotMil [4] = true;
		
		String[] pilotExp = new String [5];
		pilotExp [0] = "5 years";
		pilotExp [1] = "15 years";
		pilotExp [2] = "7 years";
		pilotExp [3] = "3 years";
		pilotExp [4] = "8 years";
		
		for (int i = 0; i  <  pilotName[i]; i++){
			System.out.println("\tPilot " + pilotName[i] + " /  Age: " + pilotAge[i] + " / Military pilot : " + pilotMil[i] + " / Experience as pilot: " + pilotExp[i] );
		}
	}
	
	public static void main(String[] arguments) {
		int select = 0;
		int menuSelect = 0;
		Scanner scanner = new Scanner(System.in);
		
		Menu();
		
	}
	
	
/*String[][] air = new String[5][6];
	
	air[0][0] = "nameOfAircraft";
	air[0][1] = "manufacturer";
	air[0][2] = "aircraftType";
	air[0][3] = "aircraftDetail";
	air[0][4] = "fuelCap";
	air[0][5] = "maxSpeed";
	air[0][6] = "maxRange";
	
	switch (menuSelect) {
		case 1:
			AircraftMenu();
		case 2:
			PilotMenu();
			PilotInfo();
		case 3:
			Menu();
		default:
			System.out.print("\tYou must select (1) or (2): ");
			select = scanner.nextInt();
		}
*/
}