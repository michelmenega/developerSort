package main;

import java.util.ArrayList;
import java.util.HashMap;

public class DeveloperHome {

	private final static HashMap<String,Developer> developers = new HashMap<String,Developer>();  
	
	public static Developer searchDeveloperBy(String name){
		return developers.get(name);
	}
	
	public static void add(Developer developer){
		developers.put(developer.getName(),developer);
	}
	
	public static ArrayList<Developer> getDevelopers(){
		return (ArrayList<Developer>) developers.values();
	}
}
