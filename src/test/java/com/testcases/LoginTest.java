package com.testcases;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class LoginTest {

    private WebDriver driver;

    @BeforeMethod
    public void Startup(){
        //Initiate driver
        //driver = new FirefoxDriver();
    }

    @Test(priority=1)
    public void GoogleLogin() throws Exception {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");


        WebDriver driver=new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        System.out.println(driver.getTitle());

        driver.quit();
    }

}
