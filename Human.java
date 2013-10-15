
public class Human extends Player {
	
	public Human() {
		//initially sets the Human Player in the top left corner
		Location initial = new Location(0,0);
		this.setLocation(initial);
	}

	@Override
	public synchronized void setLocation(Location location) {
		loc = location;
	}

	@Override
	public char chooseDirection() {
		return ' ';
	}

}
