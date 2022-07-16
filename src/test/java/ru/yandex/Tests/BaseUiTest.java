package ru.yandex.Tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseUiTest {

    protected WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
       // WebDriverManager.chromedriver().setup();
       // driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.manage().window().setSize(new Dimension(1440, 900));
        driver.manage().deleteCookieNamed("_yasc");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
