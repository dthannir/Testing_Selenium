package junitpack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

public class Sample {
	
		
	@BeforeTest
	public void b1() {
		System.out.println("this is brfore cls method");
	}

	@After
	public void b2() {
		System.out.println("this is brfore cls method");
	}

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
