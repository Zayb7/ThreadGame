
public class Human extends Player {
	
	public Human() {
		super();
	}

	@Override
	public synchronized void setLocation(Location location) {
		loc = location;
	}

	@Override
	public char chooseDirection() {
		return ' ';
	}

	@Override
	public void initLoc() {
		//sets up the initial location 
		this.setLocation(new Location(0,0));
		
	}

}
