
public abstract class Player implements Runnable {
	//variables
	protected char dir;
	protected int points;
	protected Location loc = new Location(0,0);
	protected Thread playThread = new Thread(this);
	
	public Player(){
		points = 0;
		dir = 'D';
		initLoc();
		
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
	
	public void move(Location currentLoc){
		//choose the direction
		Location temp = loc;
		char currentDir = this.dir; 

		//makes and checks temporary location 
		switch(dir){

			case 'L':
				temp.setX(loc.getX() - 1);
				break;
	
			case 'R':
				temp.setX(loc.getX() + 1);
				break;
	
			case 'U':
				temp.setY(loc.getY() - 1);
				break;
	
			case 'D':
				temp.setY(loc.getY() + 1);
				break;	

		}

		//update location
		boolean isPlayer = false;
		
		if(this instanceof Human){
			isPlayer = true;
		} else{
			isPlayer = false;
		}
		
		//checks if location is blocked
		if(MainGame.graphics.isBlocked(temp, isPlayer == false)){
			loc = temp;
		}
	}
	
	public abstract char chooseDirection();
	
	public void start() {
		playThread.start();
	}
	
	public abstract void initLoc();

	public synchronized void run() {
		//infinite loop
		while(true){
			//moves 
			this.move(loc);
			//sleeps
			try {
				Thread.sleep(MainGame.DELAY);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	public void stopPlaying() {
		// TODO Auto-generated method stub
		
	}

}
