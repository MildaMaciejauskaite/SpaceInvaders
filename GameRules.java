package spaceinvaders;
import java.io.IOException;
import spaceinvaders.Command;
public class GameRules {
        private Map map;
	private Invader invader;
	private Protector protector;
        private Shot shot; 
 	public GameRules(Protector protector, Invader invader, Map map, Shot shot) {
		this.protector = protector;
		this.invader = invader;
		this.map = map;
                this.shot = shot;
	}
 	public boolean isGameOver() {
		return (shot.shotX == invader.invaderX && shot.shotY == invader.invaderY);
	}
 	public void endGame() throws IOException {
		System.out.println("GAME OVER!!!!");
		System.exit(0);
	}
	
	void Move(int dx, int dy) {
            if(dy==0){
                int nextX = protector.protectorX + dx;
		int nextY = protector.protectorY + dy;
		
		if (map.isWall(nextX, nextY))
			return;
		
		protector.setProtectorX(nextX);
		protector.setProtectorY(nextY);
            }
            else {
                int nextX = invader.invaderX + dx;
		int nextY = invader.invaderY + dy;
		
		if (map.isWall(nextX, nextY)) {
			invader.invaderDx *= -1;
			invader.invaderDy *= -1;
			
		}else {
			invader.invaderDx = nextX;
			invader.invaderDy = nextY;
		}
            }
	}
        
 	public void processCommand(Command command) throws Exception{
		switch(command) {
		case LEFT:
			Move(-1, 0);
			break;
		case NOTHING:
			break;
		case QUIT:
			endGame();
			break;
		case RIGHT:
			Move(1, 0);
			break;
                case UP:
			ShootOut(0, -1);
			break;
		default:
			break;
		}
	}
 	
        private void ShootOut(int dx, int dy) {
                for (int z= protector.protectorY + dy; z > 1; z--){
                    int nextX = protector.protectorX + dx;
                    int nextY = z;
                    
                    if (map.isWall(nextX, nextY))
			return;
                } 
	}
}
