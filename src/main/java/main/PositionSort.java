package main;

import java.util.ArrayList;
import java.util.Iterator;

public class PositionSort {

	public static void setUp() {
		ArrayList<Developer> developers = DeveloperHome.getAll();
		ArrayList<Position> positions = PositionHome.getAll();
		developers.get(0).setPosition(positions.get(0));
		developers.get(1).setPosition(positions.get(0));
	}
	
	public static ArrayList<Developer> eligibleDevelopersToMove(){
		
		ArrayList<Position> positions = (ArrayList<Position>) PositionHome.getAll();
		ArrayList<Developer> developers = new ArrayList<Developer>();
		
		
		Iterator<Position> positionIterator = positions.iterator();
		while(positionIterator.hasNext()){
			Pair pair = DeveloperHome.searchDeveloperBy(positionIterator.next());
			developers.add(pair.getEligibleToMove());
		}
		
		return developers;
//		position.getAllPairs();
//		allPairs getEligible();
//		return eligible;
	}

	public static void getAllPairs() {
		// TODO Auto-generated method stub
		
	}
	
	
}
