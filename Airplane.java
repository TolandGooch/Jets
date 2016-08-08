package solo;

public class Airplane {
	// Field 
	private int capacity;
	private String taskOfPlane;
	private int numEngines;
	private int altitude;
	private Engine engine;
		
	// Constructors
	public Airplane(){ //default no argument contructor
		this(0," UNDEFINED",0,0);
	}
	public Airplane( int capacity, String taskOfPlane, 
			int numEngines, int altitude){
		this.capacity = capacity;
		this.taskOfPlane = taskOfPlane;
		this.numEngines = numEngines;
		this.altitude = altitude;
	}
	
	
	

	//Main
	public void takeOff(){
		setAltitude (35_000);
	}
	
	public void land() {
		setAltitude (0);
	}
	
	public void crash() {
		setAltitude (0);
	}
	
	
	public String toString(){
		StringBuilder sb = new StringBuilder(100);
		sb.append(this.capacity + " : ");
		sb.append(this.taskOfPlane + " : ");
		sb.append(this.numEngines + " : ");
		sb.append(this.altitude + " : ");
		
		return sb. toString();
	}
	
	//getters and setters
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getTaskOfPlane() {
		return taskOfPlane;
	}
	public void setTaskOfPlane(String taskOfPlane) {
		this.taskOfPlane = taskOfPlane;
	}
	public int getNumEngines() {
		return numEngines;
	}
	public void setNumEngines(int numEngines) {
		this.numEngines = numEngines;
	}
	public int getAltitude() {
		return altitude;
	}
	public void setAltitude(int altitude) {
		if (altitude >10000){
			crash();
		} else {
			this.altitude = altitude;
		}
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
