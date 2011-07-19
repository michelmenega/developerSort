package main;

public class Developer {
	
	private String name;
	private Position position;

	public Developer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

}
