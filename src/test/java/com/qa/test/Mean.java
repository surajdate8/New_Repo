package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Mean {
	@Test
	public void sum()
	{
		System.out.println("for sum");
		int a=10,b=20;
		Assert.assertEquals(30, a+b);
	}
	@Test
	public void sub()
	{
		System.out.println("for sub");
		int a=10,b=20;
		Assert.assertEquals(110, b-a);
	}
	@Test
	public void mul()
	{
		System.out.println("for sum");
		int a=10,b=20;
		Assert.assertEquals(200, a*b);
	}
	@Test
	public void div()
	{
		System.out.println("for sum");
		int a=10,b=20;
		Assert.assertEquals(2, b/a);
	}
	

}
