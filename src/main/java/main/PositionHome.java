package main;

import java.util.ArrayList;

public class PositionHome {

	private final static ArrayList<Position> availablePosition = new ArrayList<Position>();  
	
	public static Position searchPosition(String name){
		for(Position p: availablePosition){
			if(p.getName().equals(name)) return p;
		}
		return null;
	}
	
	public static void add(Position position){
		availablePosition.add(position);
	}

	public static ArrayList<Position> getAll() {
		return availablePosition;
		
	}
	
	
}
