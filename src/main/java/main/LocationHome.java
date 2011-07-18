package main;

import java.util.HashMap;

public class LocationHome {

	private final static HashMap<String,Location> availableLocations = new HashMap<String,Location>();  
	
	public static Location searchLocationName(String name){
		return availableLocations.get(name);
	}
	
	public static void add(Location location){
		availableLocations.put(location.getName(),location);
	}
}
