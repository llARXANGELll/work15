import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class YandexTest {



    @Test
    public void yandexx() {

        public WebDriver webDriver = new ChromeDriver();
        WebElement input = webDriver.findElement(By.name("text"));
        input.sendKeys("руддщ цкщдв",Keys.ENTER);
        webDriver.quit();


    }

//    @After
//    public void driverOut(){

    }



