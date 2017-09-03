package logic;

import util.RandomGenerator;

public class HomeWalker extends Walker /* TODO Fill code */ {
	public HomeWalker(String name, int speed) {
		super(name, speed);
		this.name = name;
		this.speed = speed;
		this.position = 0;
	}

	public HomeWalker(HomeWalker other) {
		super(other);
	}

	@Override
	public void move() {
		// TODO Fill code
		super.move();
		homeBuff();
	}

	private void homeBuff() {
		// TODO Fill code
		this.position +=  RandomGenerator.random(0, 200);
	}
}
