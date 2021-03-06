package main;

public class Pair{
	
	Developer developerA;
	Developer developerB;
	
	public Pair(Developer developer, Developer developer2) {
		setDeveloperA(developer);
		setDeveloperB(developer2);
	}

	public Developer getEligibleToMove() {
		if(getDeveloperA().getLastTimeMoved().toLocalDate().compareTo(getDeveloperB().getLastTimeMoved().toLocalDate()) >= 0)
			return getDeveloperA();
		return getDeveloperB();
	}
	
	public Developer getDeveloperA() {
		return developerA;
	}
	public void setDeveloperA(Developer developerA) {
		this.developerA = developerA;
	}
	public Developer getDeveloperB() {
		return developerB;
	}
	public void setDeveloperB(Developer developerB) {
		this.developerB = developerB;
	}
	
}
