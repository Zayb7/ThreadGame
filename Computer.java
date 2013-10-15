import java.util.Random;


public class Computer extends Player {
	private Location locat = new Location(0,0);
	
	public Computer() {
		loc = locat;
		
		//randomnly selects a starting location for computer
		Random rand = new Random();
		
		//sets up random spot for computer
		int x = rand.nextInt() + 1;
		int y = rand.nextInt() + 1;
		
		Location initial = new Location(x,y);
		
		this.setLocation(initial);
		
		
		
	}

	@Override
	public synchronized void setLocation(Location location) {
		//this.loc = location;
		
	}

	@Override
	public char chooseDirection() {
		return ' ';
	}
	
}
