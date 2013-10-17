import java.util.Random;


public class Computer extends Player {
	private Location locat = new Location(0,0);
	
	public Computer(GraphicsPanel g) {
		super(g);
		
		loc = locat;
		
		//choose random direction
		this.chooseDirection();
		
		//initialize the location
		initLoc();
		
	}

	@Override
	public void setLocation(Location location) {
		this.loc = location;
		
	}

	@Override
	public void chooseDirection() {
		Random gen = new Random();
		
		int c = gen.nextInt(4) + 1;
		
		System.out.println(c);
		
		switch(c){
			case 1:
				this.setDirection('U');
			case 2:
				this.setDirection('D');
			case 3: 
				this.setDirection('R');
			case 4:
				this.setDirection('L');
			default:
				this.setDirection(' ');
				
			
		}
	}

	@Override
	public void initLoc() {
		//randomly selects a starting location for computer
		Random rand = new Random();

		//sets up random spot for computer
		int x = rand.nextInt(GraphicsPanel.MAX_X);
		int y = rand.nextInt(GraphicsPanel.MAX_Y);
		
		this.setLocation(new Location(x,y));

	}

	@Override
	public void setDirection(char dir) {
		this.dir = dir;
		
	}
	
}
