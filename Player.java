
public abstract class Player implements Runnable {
	//variables
	protected char dir;
	protected int points;
	protected Location loc = new Location(0,0);
	protected Thread playThread = new Thread(this);
	protected GraphicsPanel graphics;
	
	public Player(GraphicsPanel g){
		graphics = g;
		points = 0;
		dir = ' ';
		this.initLoc();
		
	}
	
	public void start() {
		playThread.start();
	}
	
	public int getPoints() {
		return points;
	}


	public void addPoints() {
		this.points++;
	}


	public char getDirection() {
		return dir;
	}


	public abstract void setDirection(char dir);


	public Location getLocation() {
		return loc;
	}



	public abstract void setLocation(Location loc);
	
	public synchronized void move(){
		//choose the direction
		Location temp = new Location(loc.getX(), loc.getY());
	
		this.chooseDirection(); 

		//makes and checks temporary location 
		switch(dir){

			case 'L':
				temp.setX(temp.getX() - 1);
				break;
	
			case 'R':
				temp.setX(temp.getX() + 1);
				break;
	
			case 'U':
				temp.setY(temp.getY() - 1);
				break;
	
			case 'D':
				temp.setY(temp.getY() + 1);
				break;
			
			case ' ':
				this.setLocation(loc);
				break;
			

		}
		
		//checks if location is blocked
		if(graphics.isBlocked(temp, true)){
			this.setLocation(loc);	
		} else{
			this.setLocation(temp);
		}
		
		if(graphics.isTarget(temp)){
			this.addPoints();
			graphics.checkForPoint(temp);
		}
	}
	
	public abstract void chooseDirection();
	
	public abstract void initLoc();

	public synchronized void run() {
		//infinite loop
		while(true){
			//moves 
			this.move();
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
		playThread = null;
	}

}
