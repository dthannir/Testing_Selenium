package junitpack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_Sample {
	
	@BeforeClass
	public static void b1() {
		System.out.println("this is brfore cls method");
	}

	@AfterClass
	public static void b2() {
		System.out.println("this is brfore cls method");
	}
	
	/*
	 * @Before public void a1() { System.out.println("this is brfore method"); }
	 * 
	 * @After public void a2() { System.out.println("this is after method");
	 */
		
	
	@Test
	public void a3() {
		System.out.println("this is test1");
	}
	@Test
	public void a4() {
		System.out.println("this is test2");
	}
	@Test
	public void a5() {
		System.out.println("this is test3");
	}


}
