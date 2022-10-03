package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before(order = 0)
	public void hook1() {
		System.out.println("Before Hook order = 0");
	}

	@Before(order = 1)
	public void hook2() {
		System.out.println("Before Hook order = 1");
	}

	@Before(order = 2)
	public void hook3() {
		System.out.println("Before Hook order = 2");
	}

	@After(order = 2)
	public void hook4() {
		System.out.println("After Hook order = 2");
	}

	@After(order = 1)
	public void hook5() {
		System.out.println("After Hook order = 1");
	}

	@After(order = 0)
	public void hook6() {
		System.out.println("After Hook order = 0");
	}
}
