package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

    @Test(groups = {"abhishek"})
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("verify login");
    }

    @Test
    public void verifyCreateANewUser(){
        System.out.println("verify create a new user");
    }

    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyFundTransfer(){
        System.out.println("verify fund transfer");
    }
}
