
public class house {
	private int doors,windows,
	floors,
	garage,
	bedrooms,
	sqft,
	bathroom,
	worth,
	construction_date, last_updated_date, property_taxes, numOccupants;
	private String legal_owner,
	town, state;


	public house() {
		 }
	public house(int rooms,int bathroom, int floors) {
		this.bedrooms = rooms;
		this.bathroom = bathroom;
		this.floors = floors;
	}
	
	
	public void setDoors(int d) {
		doors = d;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public void setWindows(int d) {
		windows = d;
	}
	
	public int getWindows() {
		return windows;
	}
	
	public void setFloors(int d) {
		floors = d;
	}
	
	public int getFloors() {
		return floors;
	}
	public void setWorth(int d) {
		worth = d;
	}
	
	public int getWorth() {
		return worth;
	}
	public void setGarage(int d) {
		garage = d;
	}
	
	public int getGarage() {
		return garage;
	}
	public void setSqft(int d) {
		sqft = d;
	}
	
	public int getSqft() {
		return sqft;
	}
	public void setBedrooms(int d) {
		bedrooms = d;
	}
	
	public int getBedrooms() {
		return bedrooms;
	}
	public void setBathrooms(int d) {
		bathroom = d;
	}
	
	public int getBathrooms() {
		return bathroom;
	}
	
	
	
}
