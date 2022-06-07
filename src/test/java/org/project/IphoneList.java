package org.project;

import org.test.home.BaseClass;
import org.testng.annotations.Test;

public class IphoneList extends BaseClass {

	@Test
	private void test() 
	{
		System.out.println("Iphone List......");
		urlLaunch("https://www.amazon.in/");
		
	}
}
