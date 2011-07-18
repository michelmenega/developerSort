package main;

public class Developer {
	
	private String name;
	private Location location;

	public Developer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Location getLocation() {
		return location;
	}

}
