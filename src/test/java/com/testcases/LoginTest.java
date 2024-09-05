package com.testcases;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;

import java.net.URL;
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


//        WebDriver driver=new ChromeDriver(options);

//        driver = new RemoteWebDriver(new URL("https://de49-42-104-100-108.ngrok-free.app/wd/hub"), options);

//        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);

//        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--remote-debugging-port=9222");
        options.addArguments("--headless"); // Run in headless mode
        options.addArguments("--no-sandbox"); // Bypass the sandbox
        options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        System.out.println(driver.getTitle());

        driver.quit();
    }

}
