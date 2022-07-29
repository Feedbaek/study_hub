public class Player {

	PlayerLevel level;

	public Player() {
		level = new BeginnerLevel();
	}

	public PlayerLevel getLevel() {
		return level;
	}

	public void play(int time) {
		level.run();
		for(int i =0; i<time; i++) {
			level.jump();
		}
		level.turn();
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
	}
}
