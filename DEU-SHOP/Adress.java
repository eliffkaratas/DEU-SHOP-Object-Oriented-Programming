
public class Adress {
	private String Road;
	private String Street;
	private String Door;
	
	public Adress(String road, String street, String door) {
		Road = road;
		Street = street;
		Door = door;
	}

	public String getRoad() {
		return Road;
	}

	public void setRoad(String road) {
		Road = road;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getDoor() {
		return Door;
	}

	public void setDoor(String door) {
		Door = door;
	}

	public String Display() {
		return "Adress [Road=" + Road + ", Street=" + Street + ", Door=" + Door + "]";
	}	
	
	public String Display2() {
		return   Road +"/"+Street+"/"+Door;
	}
}
