package com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion {
	@Test
	public void test1() {
		System.out.println("Test case start");
		Assert.assertEquals(13, 13);
		System.out.println("test case complete");
	}
	@Test
	public void test2() {
		System.out.println("Test case start");
		Assert.assertEquals(13,13, "drop count not match ");
		System.out.println("test case complete");
	}
	@Test
	public void test3() {
		System.out.println("Test case start");
		Assert.assertEquals("hello","Hello","word does not match");
		System.out.println("test case complete");
	}
	@Test
	public void test4() {
		System.out.println("Test case start");
		Assert.assertTrue(false);
		System.out.println("test case complete");
	}
	@Test
	public void test5() {
		System.out.println("Test case start");
		Assert.assertFalse(true);
		System.out.println("test case complete");
	}
	@Test
	public void test6() {
		System.out.println("Test case start");
		String my = "Krushnakant";
		Assert.assertTrue(my.contains("krushnakant"));
		System.out.println("test case complete");
	}
	@Test
	public void test7() {
		System.out.println("Test case start");
		String my = "Krushnakant";
		Assert.assertTrue(my.contains("moundekar"),"name does not match");
		System.out.println("test case complete");
	}
}
