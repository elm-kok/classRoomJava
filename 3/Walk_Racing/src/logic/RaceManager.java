package logic;

import java.util.ArrayList;
import java.util.List;

public class RaceManager {
	private List<Walker> walkers;
	private final int finishPosition = 10000;
	private int round;

	public RaceManager(List<Walker> walkers) {
		this.walkers = walkers;
		round = 1;
	}

	public void run() {
		System.out.println("Race Start");
		System.out.println("The finish line is " + finishPosition + " m");
		System.out.println();

		while (getWinner() == null) {
			System.out.println("Round : " + round);

			update();

			for (Walker w : walkers) {
				System.out.println(
						w.getName() + " (" + w.getClass().getSimpleName() + ") is now at " + w.getPosition() + " m");
			}
			System.out.println();

			round++;
		}

		System.out.println("Winner is " + this.getWinner().getName());
	}

	public void update() {
		// TODO Fill code
		for (Walker x : walkers) {
			x.move();
		}
	}

	public Walker getWinner() {
		Walker winner = null;
		ArrayList<Walker> a = new ArrayList<>();
		// TODO Fill code
		for (Walker x : walkers) {
			if (x.getPosition() >= finishPosition)
				a.add(x);
		}
		for (Walker x : a) {
			if (x instanceof HomeWalker) {
				winner = x;
				break;
			}else winner=a.get(0);
		}
		return winner;
	}

	public List<Walker> getWalkers() {
		List<Walker> newWalkers = new ArrayList<>();
		for (Walker w : walkers) {
			if (w instanceof HomeWalker)
				newWalkers.add(new HomeWalker((HomeWalker) w));
			else
				newWalkers.add(new Walker(w));
		}
		return newWalkers;
	}

}
