package spaceinvaders;
public class Invader {
    	int invaderX = 9;
	int invaderY = 3;
	int invaderDx = 0;
	int invaderDy = 1;
 	public Invader(int invaderX, int invaderY, int invaderDx, int invaderDy) {
		this.invaderX = invaderX;
		this.invaderY = invaderY;
		this.invaderDx = invaderDx;
		this.invaderDy = invaderDy;
	}
 	public int getInvaderX() {
		return invaderX;
	}
 	public void setInvaderX(int invaderX) {
		this.invaderX = invaderX;
	}
 	public int getInvaderY() {
		return invaderY;
	}
 	public void setInvaderY(int invaderY) {
		this.invaderY = invaderY;
	}
 	public int getInvaderDx() {
		return invaderDx;
	}
 	public void setInvaderDx(int invaderDx) {
		this.invaderDx = invaderDx;
	}
 	public int getInvaderDy() {
		return invaderDy;
	}
 	public void setInvaderDy(int invaderDy) {
		this.invaderDy = invaderDy;
	}
}
