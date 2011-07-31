package main;

import java.util.ArrayList;
import java.util.Collections;

public class DeveloperHome {

	private final static ArrayList<Developer> developers = new ArrayList<Developer>();  
	
	public static Developer searchDeveloperBy(String name){
		for(Developer p: developers){
			if(p.getName().equals(name)) return p;
		}
		return null;
	}
	
	public static Pair searchDeveloperBy(Position position){
		ArrayList<Developer> developerInPosition = new ArrayList<Developer>();
		
		for(Developer p: developers){
			if(p.getPosition().equals(position)) developerInPosition.add(p);
		}
		
		Collections.sort(developerInPosition);
		return new Pair(developerInPosition.get(0),developerInPosition.get(1));
		
	}
	
	public static void add(Developer developer){
		developers.add(developer);
	}
	
	public static ArrayList<Developer> getAll(){
		return developers;
	}
}
