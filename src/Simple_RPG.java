
public class Simple_RPG {
	static Game_Logic gl = new Game_Logic();

	public static void main(String[] args) {

		while (true) {
			game_loop();
		}

	}

	public static void game_loop() {
		gl.waitforCommand();

	}

}
