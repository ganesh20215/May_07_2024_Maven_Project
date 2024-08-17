package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderExample {

    @DataProvider(name = "test-data")
    public Object[][] dataFunForScript() {
        return new Object[][]{
                {"Selenium ", "Mumbai"},
                {"python ", "Pune"},
                {"Java ", "Chennai"},
                {".net ", "Bhopal"},
        };
    }

    @Test(dataProvider = "test-data")
    public void verifyDataProviderExample(String courseName, String cityName) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Upcasting
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement textBox = driver.findElement(By.name("q"));
        textBox.sendKeys(courseName + cityName);
        textBox.sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        driver.close();
    }
}
