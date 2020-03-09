package work15;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class YandexTest {

    private WebDriver webDriver;

    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
    }


    @Test
    public void yandexx() {
        webDriver.get("https://yandex.com/ncr");
        WebElement input = webDriver.findElement(By.name("text"));
        input.sendKeys("руддщ цкщдв",Keys.ENTER);
        webDriver.findElement(By.xpath("//div[.=\"Hello, world!\"]"));

    }

    @After
    public void driverOut() {
        webDriver.quit();
    }
    }



