package virtualPetTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import virtualPet.VirtualPet;

public class VirtualPetTest {

	private VirtualPet underTest;
	private Object check;

	// Hunger

	@Test
	public void shouldHaveADefaultHungerOf100() {
		VirtualPet underTest = new VirtualPet(100, 0, 0);
		int check = underTest.getHunger();
		assertEquals(100, check);

	}

	@Test
	public void shouldHaveADefaultHungerOf50() {
		VirtualPet underTest = new VirtualPet(50, 0, 0);
		int check = underTest.getHunger();
		assertEquals(50, check);
	}

	@Test
	public void shouldHaveADefaultHungerOf50AfterFeedingOf50() {
		VirtualPet underTest = new VirtualPet(100, 0, 0);
		underTest.feed(50);
		int check = underTest.getHunger();
		assertEquals(50, check);

	}

	@Test
	public void shouldHaveADefaultHungerOf140AfterTime() {
		VirtualPet underTest = new VirtualPet(100, 0, 0);
		underTest.play();
		int check = underTest.getHunger();
		assertEquals(140, check);
	}

	// Tired

	@Test
	public void shouldHaveADefaultTiredOf100() {
		VirtualPet underTest = new VirtualPet(0, 100, 0);
		int check = underTest.getTired();
		assertEquals(100, check);

	}

	@Test
	public void shouldHaveADefaultSleepOf50AfterSleeping50() {
		VirtualPet underTest = new VirtualPet(0, 100, 0);
		underTest.sleep(50);
		int check = underTest.getTired();
		assertEquals(50, check);

	}

	// Activity

	@Test
	public void shouldHaveADefaultTiredOf130AfterActivity() {
		VirtualPet underTest = new VirtualPet(100, 100, 100);
		underTest.play();
		int check = underTest.getTired();
		assertEquals(130, check);
	}

	// Tick

	@Test
	public void shouldHaveHungerOf5AfterTick() {
		VirtualPet underTest = new VirtualPet(100, 0, 0);
		underTest.tick();
		int check = underTest.getHunger();
		assertEquals(105, check);
	}

	@Test
	public void shouldHaveTiredOf5AfterTick() {
		VirtualPet underTest = new VirtualPet(0, 100, 0);
		underTest.tick();
		int check = underTest.getTired();
		assertEquals(105, check);
	}

	@Test
	public void shouldHaveActivityOf5AfterTick() {
		VirtualPet underTest = new VirtualPet(0, 0, 100);
		underTest.tick();
		int check = underTest.getActivity();
		assertEquals(105, check);
	}

}
