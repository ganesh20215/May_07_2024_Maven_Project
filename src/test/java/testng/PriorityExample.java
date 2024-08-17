package testng;

import org.testng.annotations.Test;

public class PriorityExample {


    @Test(priority = 1)
    public void testDemoA(){
        System.out.println("Test Demo A");
    }

    @Test(priority = 0)
    public void testDemoX(){
        System.out.println("Test Demo X");
    }

    @Test(priority = -3)
    public void testDemoY(){
        System.out.println("Test Demo Y");
    }

    @Test(priority = 'A')
    public void testDemoB(){
        System.out.println("Test Demo B");
    }

    @Test(priority = 5)
    public void testDemoC(){
        System.out.println("Test Demo C");
    }


}
