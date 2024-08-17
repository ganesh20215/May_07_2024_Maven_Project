package testng.annotations;

import org.testng.Assert;
import org.testng.annotations.*;
import testng.failtest.ExecutionOfFailTestCase;

public class BeforeAfterMethod_2 {

    @BeforeMethod
    public void beforeMethodEx(){
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethodEx(){
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClassEx(){
        System.out.println("After Class");
    }

    @BeforeClass
    public void beforeClassEx(){
        System.out.println("Before Class");
    }

    @Test
    public void testA(){
        Assert.assertTrue(false);
        System.out.println("Test A");
    }

    @Test
    public void testB(){
        System.out.println("Test B");
    }

    @Test
    public void testC(){
        System.out.println("Test C");
    }
}
