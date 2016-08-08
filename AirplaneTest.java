package solo;

public class AirplaneTest {
	public static void main(String [] args){
	Airplane a1 = new Airplane();
	Airplane a2 = new Airplane(200, "Passenger", 2, 0);
	//System.out.println(a1);
	//System.out.println(a2);
	a2.takeOff();
	System.out.println(a2);
	a2.land();
	System.out.println(a2);
		
	Engine rolls = new Engine(2900, 70_000, "Jets", "Rolls Roycee");
	System.out.println(rolls);
	
	
	Airplane a2 = new Airplane (200, "Passenger", 0, 0)
	a2.setEngine(rolls);
	}
	
}
