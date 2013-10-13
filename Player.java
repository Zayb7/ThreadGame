
public abstract class Player implements Runnable {
	//variables
	protected char dir;
	protected int points;
	protected Location loc;
	
	public Player(){
		points = 0;
		dir = 'D';
		loc = new Location(0,0);
	}
	
	
	public int getPoints() {
		return points;
	}


	public void setPoints(int points) {
		this.points = points;
	}


	public char getDirection() {
		return dir;
	}


	public void setDirection(char dir) {
		this.dir = dir;
	}


	public Location getLocation() {
		return loc;
	}



	public abstract void setLocation(Location loc);


	public void run() {
		
	}


	public void start() {
		// TODO Auto-generated method stub
		
	}


	public void stopPlaying() {
		// TODO Auto-generated method stub
		
	}

}
