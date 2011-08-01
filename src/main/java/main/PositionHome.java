package main;

import java.util.ArrayList;

public class PositionHome {

	private final static GenericMemoryDAO<Position> positions = new GenericMemoryDAO<Position>();  
	
	public static Position searchPosition(String name){
		for(Position p: positions.list()){
			if(p.getName().equals(name)) return p;
		}
		return null;
	}
	
	public static void add(Position position){
		positions.add(position);
	}

	public static ArrayList<Position> getAll() {
		return (ArrayList<Position>) positions.list();
		
	}
	
	
}
