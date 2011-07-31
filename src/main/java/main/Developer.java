package main;

import java.util.Calendar;
import java.util.Date;

public class Developer implements Comparable<Developer> {
	
	private String name;
	private Position position;
	private Date lastTimeMoved;

	public Developer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPosition(Position position) {
		this.position = position;
		this.lastTimeMoved = Calendar.getInstance().getTime();
	}

	public Position getPosition() {
		return position;
	}

	public Date getLastTimeMoved() {
		return lastTimeMoved;
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

	@Override
	public int compareTo(Developer o) {
		return getName().compareTo(o.getName());
	}
}
