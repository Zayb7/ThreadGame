import java.util.Random;


public class Computer extends Player {
	
	public Computer() {
		//randomnly selects a starting location for computer
		Random rand = new Random();
		
		//sets up random spot for computer
		int x = rand.nextInt();
		int y = rand.nextInt();
		
		Location initial = new Location(x,y);
		
		this.setLocation(initial);
		
		
		
	}

	@Override
	public void setLocation(Location location) {
		loc = location;
		
	}
	
}
