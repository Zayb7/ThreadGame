
public class Human extends Player {
	
	public Human() {
		//initially sets the Human Player in the top left corner
		Location initial = new Location(0,0);
		this.setLocation(initial);
	}

	@Override
	public void setLocation(Location location) {
		loc = location;
	}

}
