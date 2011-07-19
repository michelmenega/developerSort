package main;

public class Position {
	
	private String name;

	public Position(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Position searchBy(String name) {
		return PositionHome.searchPositionName(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.getName().equals(((Position) obj).getName());
	}
	
	@Override
	public int hashCode() {
		return this.getName().hashCode();
	}
	
	

}
