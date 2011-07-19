package main;

import java.util.ArrayList;

public class DeveloperHome {

	private final static ArrayList<Developer> developers = new ArrayList<Developer>();  
	
	public static Developer searchDeveloperBy(String name){
		for(Developer p: developers){
			if(p.getName().equals(name)) return p;
		}
		return null;
	}
	
	public static void add(Developer developer){
		developers.add(developer);
	}
	
	public static ArrayList<Developer> getAll(){
		return developers;
	}
}
