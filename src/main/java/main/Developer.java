package main;

import java.util.Calendar;
import java.util.Date;

public class Developer {
	
	private String name;
	private Position position;
	private Date date;

	public Developer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPosition(Position position) {
		this.position = position;
		this.date = Calendar.getInstance().getTime();
	}

	public Position getPosition() {
		return position;
	}

	public Date lastTimeMoved() {
		return date;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.getName().equals(((Developer) obj).getName());
	}
	
	@Override
	public int hashCode() {
		return this.getName().hashCode();
	}
	
	@Override
	public String toString() {
		return name; 
	}
}
