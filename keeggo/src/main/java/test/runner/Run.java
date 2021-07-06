package test.runner;

import org.junit.runner.JUnitCore;

import test.suites.cadasto.AOS001;

public class Run {
	
	public static void main(String[] args) {
		new JUnitCore().run(AOS001.class);
	}
}