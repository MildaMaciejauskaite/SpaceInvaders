package spaceinvaders;
import java.io.IOException;
import java.util.Scanner;

public class SpaceInvaders {
    public static void main(String[] args) throws IOException, Exception {
		Map map = new Map();
		Invader invader = new Invader(9,3,-1,0);
		Protector protector = new Protector(9, 10);
                Shot shot = new Shot(9, 10);
		
		GameRenderer renderer = new GameRenderer(protector, invader, map, shot);
		GameRules gameRules = new GameRules(protector, invader, map, shot);
		UserInput userInput = new UserInput();
		
		while(true) {
			renderer.render();
			if (gameRules.isGameOver())
				gameRules.endGame();
			
			Command command = userInput.getCommand();
			gameRules.processCommand(command);
			gameRules.moveInvader();
		}
	}
}
