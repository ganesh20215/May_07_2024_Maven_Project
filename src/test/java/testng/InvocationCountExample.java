package testng;

import org.testng.annotations.Test;

public class InvocationCountExample {

    @Test(invocationCount = 100000, invocationTimeOut = 1)
    public void methodForRepetation(){
        System.out.println("Hello World... How Are you...");
    }
}
