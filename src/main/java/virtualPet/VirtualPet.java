package virtualPet;

public class VirtualPet {

	private int hunger;
	private int tired;
	private int activity;
	public int tick;

	public VirtualPet(int hunger, int tired, int activity) {
		this.hunger = hunger;
		this.tired = tired;
		this.activity = activity;
	}

	public int getHunger() {

		return hunger;
	}

	public void feed(int feed) {
		hunger -= feed;

	}

	public void play() {
		hunger += 20;
		tired += 15;
		activity -= 10;

	}

	public int getTired() {

		return tired;
	}

	public void sleep(int sleep) {
		tired -= sleep;

	}

	public void tick() {
		hunger += 5;
		tired += 5;
		activity += 5;

	}

	public int getActivity() {

		return activity;
	}

}
