package main;

import java.util.ArrayList;

public class PositionSort {


	public static void sortDevelopers() {
		ArrayList<Developer> developers = DeveloperHome.getAll();
		ArrayList<Position> positions = PositionHome.getAll();
		
		developers.get(0).setPosition(positions.get(0));
		developers.get(1).setPosition(positions.get(0));
		
		
	}

	
}
