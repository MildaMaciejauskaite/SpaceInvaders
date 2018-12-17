package spaceinvaders;
public class Shot {
        int shotX = 9;
	int shotY = 10;
 	public Shot(int shotX, int shotY) {
		super();
		this.shotX = shotX;
		this.shotY = shotY;
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
