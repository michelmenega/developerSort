package main;

public class Location {
	
	private String name;

	public Location(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Location searchBy(String name) {
		return LocationHome.searchLocationName(name);
	}
	
	

}
