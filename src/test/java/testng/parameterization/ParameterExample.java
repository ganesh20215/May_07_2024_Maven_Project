package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
    public WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void preRequesite(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver(); //Upcasting
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new FirefoxDriver(); //Upcasting
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new EdgeDriver(); //Upcasting
        } else {
            throw new RuntimeException("Please select correct browser name");
        }
    }

    @Parameters({"courseName", "cityName"})
    @Test
    public void verifyParametersExample(String courseName, String cityName) throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement textBox = driver.findElement(By.name("q"));
        textBox.sendKeys(courseName + cityName);
        textBox.sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        driver.close();
    }
}
