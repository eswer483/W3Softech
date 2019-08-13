package com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
	
	@Test
	public void name()
	{
		Assert.assertEquals("Eswar", "eswar","name not matched");
	}
	@Test(dependsOnMethods ={"name","compare"})
	public void namevalid()
	{
		Assert.assertEquals("Eswar","Eswar");
	}
	@Test
	public void compare(){
		Assert.assertNotEquals(1, 1);
	}
}
