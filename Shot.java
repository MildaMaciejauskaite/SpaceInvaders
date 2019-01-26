package spaceinvaders;
public class Shot {
        int shotX = 9;
	int shotY = 10;
        private boolean isStarted = false;
        
        public void start(){
            if(!isStarted)
                isStarted = true;
        }
        
 	public Shot(int shotX, int shotY) {
		this.shotX = shotX;
		this.shotY = shotY;
	}
        
        public void stop(){
            if (isStarted)
                isStarted = false;
        }
        
 	public int getShotX() {
		return shotX;
	}
 	public void setShotX(int shotX) {
		this.shotX = shotX;
	}
 	public int getShotY() {
		return shotY;
	}
 	public void setShotY(int shotY) {
		this.shotY = shotY;
	}
}
