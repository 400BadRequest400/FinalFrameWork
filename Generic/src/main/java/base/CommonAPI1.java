package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CommonAPI1 {

    public static WebDriver driver = null;


    @BeforeMethod
    public static WebDriver setupDriver(){


        System.setProperty("webdriver.chrome.driver","../Generic/src/main/resources/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        return driver;
    }
    @Test
    public void a(){

        driver.get("http://www.google.com");
        driver.getTitle();
    }

    @AfterMethod
    public void quit(){
        driver.quit();
        //driver.close();
    }


}
