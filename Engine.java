package solo;

public class Engine {
	private int rpm;
	private int thrust;
	private String type;
	private String model;

	// Constructor
	public Engine(int rpm, int thrust, String type, String model){
		this.rpm = rpm;
		this.thrust = thrust;
		this.type = type;
		this.model = model;
	}
	
	@Override
	public String toString(){
		return "Engine [rpm= " + rpm + ", thrust=" + thrust + 
				",type=" + ", model=" + model "]");
	}
}
