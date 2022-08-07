package com.automation.TestNGPractices;

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

public class BClass {


    @BeforeSuite(groups= {"Smoke"})
    public void BClassBeforeSuiteMethod() {
    	System.out.println("BClass's BeforeSuite");
    }
    
    @BeforeTest(groups= {"Smoke"})
    public void BClassBeforeTestMethod() {
    	System.out.println("BClass's BeforeTest");
    	
    }
    
    @BeforeClass(groups= {"Smoke"})
    public void BClassBeforeClassMethod() {
    	System.out.println("BClass's BeforeClass ");
    }
    
    @BeforeMethod(groups= {"Smoke"})
    public void BClassBeforeMethod() {
    	System.out.println("BClass's BeforeMethod");
    }
    
    @Test(groups= {"Smoke"})
    public void myTest1()
    {
       System.out.println("BClass's Test1");
    }
    
    @Test(groups= {"Sanity"})
    public void myTest2()
    {
       System.out.println("BClass's Test2");
    }
    
    @Test(groups= {"Regression"})
    public void myTest3()
    {
       System.out.println("BClass's Test3");
    }
    @AfterSuite(groups= {"Smoke"})
    public void BClassAfterSuiteMethod() {
    	System.out.println("BClass's AfterSuite");
    }
    
     @AfterTest(groups= {"Smoke"})
    public void BClassAfterTestMethod() {
    	System.out.println("BClass's AfterTest");
    	
    }
    
     @AfterClass(groups= {"Smoke"})
    public void BClassAfterClassMethod() {
    	System.out.println("BClass's AfterClass ");
    }
    
     @AfterMethod(groups= {"Smoke"})
    public void BClassAfterMethod() {
    	System.out.println("BClass's AfterMethod");
    }
    
     @BeforeGroups
     public void AClassBeforeGroups() {
     	System.out.println("BClass's BeforeGroups");
     }
     
     @AfterGroups
     public void AClassAfterGroups() {
     	System.out.println("BClass's AfterGroups");
     }

}
