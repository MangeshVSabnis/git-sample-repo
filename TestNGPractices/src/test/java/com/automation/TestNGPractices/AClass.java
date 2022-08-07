package com.automation.TestNGPractices;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AClass 
{
    @BeforeSuite
    public void AClassBeforeSuiteMethod() {
    	System.out.println("AClassBeforeSuite");
    }
    
    @BeforeTest
    public void AClassBeforeTestMethod() {
    	System.out.println("AClassBeforeTest");
    	
    }
    
    @BeforeClass
    public void AClassBeforeClassMethod() {
    	System.out.println("AClassBeforeClass ");
    }
    
    @BeforeMethod
    public void AClassBeforeMethod() {
    	System.out.println("AClassBeforeMethod");
    }
    
    
    @Test(groups= {"Smoke"})
    public void myTest1()
    {
       System.out.println("AClass's myTest1");
    }
    
    @Test(groups= {"Sanity"})
    public void myTest2()
    {
       System.out.println("AClass's myTest2");
    }
    
    @Test(groups= {"Regression"})
    public void myTest3()
    {
       System.out.println("AClass's myTest3");
    }
    @AfterSuite
    public void myAfterSuiteMethod() {
    	System.out.println("AClassAfterSuite");
    }
    
     @AfterTest
    public void myAfterTestMethod() {
    	System.out.println("AClassAfterTest");
    	
    }
    
     @AfterClass
    public void myAfterClassMethod() {
    	System.out.println("AClassAfterClass ");
    }
    
     @AfterMethod
    public void myAfterMethod() {
    	System.out.println("AClassAfterMethod");
    }
    
     @BeforeGroups
     public void AClassBeforeGroups() {
     	System.out.println("AClass's BeforeGroups");
     }
     
     @AfterGroups
     public void AClassAfterGroups() {
     	System.out.println("AClass's AfterGroups");
     }
}

