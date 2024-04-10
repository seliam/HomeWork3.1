import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class TestHW {
    public static WebDriver driver;
    public static String baseUrl = "https://www.grammarly.com/";

    @Test
    public void assertion(){
        driver = new ChromeDriver();
        driver.get("https://www.grammarly.com/");
        WebElement ele = driver.findElement(By.xpath("///*[@id=\"sectionHero_3b4ejaK9nNqPionbmLlscK\"]/div/div[1]/figcaption/div[2]/div[1]/div/button/span"));
        System.out.println(ele.isDisplayed() + "is it diplayed or not");
        assertTrue("element should be displayed", ele.isDisplayed());
    }


    @Test
    public void listing(){
        driver = new ChromeDriver();
        driver.get("https://www.grammarly.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
       List<WebElement> li = (List<WebElement>) driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/nav/div[1]/ul/li[1]/div/button/span"));
       wait.until(ExpectedConditions.visibilityOfAllElements(li));
       for(WebElement ele : li){
           System.out.println("lists" + ele.getText());
       }
    }
}
