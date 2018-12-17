package spaceinvaders;

public class GameRenderer {
        private Map map;
	private Invader invader;
	private Protector protector;
        private Shot shot; 
 	public GameRenderer(Protector protector, Invader invader, Map map, Shot shot) {
		this.protector = protector;
		this.invader = invader;
		this.map = map;
                this.shot = shot;
	}
        
	public void render() {
		for (int y = 0; y < map.getHeight(); y++) {
			for (int x = 0; x < map.getWidth(); x++) {
				if (x == protector.protectorX && y == protector.protectorY) {
					System.out.print("Y");
				} else if (x == invader.invaderX && y == invader.invaderY) {
					System.out.print("O");
                                } else if (x == shot.shotX && y == shot.shotY) {
					System.out.print(".");
				} else if (map.isWall(x, y)) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
