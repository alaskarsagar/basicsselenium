package com.testNGEx;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	
	
	
	@Test(priority=1, groups="login")
	public static void openedBrouser() {
		
		System.out.println("opened browser");
		Assert.assertEquals(false, true);
	}
	
	@Test(priority=2 ,groups="login", dependsOnMethods="openedBrouser")
	public static void login() {
		
		System.out.println("login");
		Assert.assertEquals(true, true);
	}
	
	@Test(priority=3, groups="login")
	public static void signIn() {
		
		System.out.println("sign in");
		Assert.assertEquals(true, true);
	}
	
	@Test(priority=4,groups="dash",dependsOnGroups="login",alwaysRun=true)
	public static void dashBoard() {
		
		System.out.println("opened openDashBoared");
	}
	
	@Test(priority=4,   groups="user",  dependsOnGroups="dash")
	public static void clickUser() {
		
		System.out.println("click user");
	}
	
	@Test(priority=5, groups="user",dependsOnGroups="dash")
	public static void close() {
		
		System.out.println("close");
	}
	
	
	
	
	
}
