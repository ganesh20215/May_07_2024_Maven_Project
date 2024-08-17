package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {

    @Test
    public void verifyCreateANewUser(){
        System.out.println("verify create a new user");
    }

    @Test(groups = {"smoke"}, enabled = false)
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("verify login");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyFundTransfer(){
        System.out.println("verify fund transfer");
    }
}
