
public class Human extends Player {
	
	public Human(GraphicsPanel g) {
		super(g);
	}

	@Override
	public void setLocation(Location location) {
			loc = location;
	}

	@Override
	public void chooseDirection() {
	}

	@Override
	public void initLoc() {
		//sets up the initial location 
		loc = new Location(0,0);
		
	}

	@Override
	public void setDirection(char dir) {
		this.dir = dir;
		
	}

}
