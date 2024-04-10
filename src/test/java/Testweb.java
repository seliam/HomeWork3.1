import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class Testweb {
    public static WebDriver driver;
    @BeforeClass
    public static void aaa(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.grammarly.com/");
        driver.getTitle();
        driver.quit();
    }
    @BeforeClass
    public static void aaa1(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.grammarly.com/");
        driver.findElement(By.className("base-module_leftIconWrapper__zC-eb"));
        driver.findElement(By.id("pdst-capture"));
        driver.findElement(By.xpath("//*[@id=\"sectionHero_3b4ejaK9nNqPionbmLlscK\"]/div/div[2]/div/div[2]/button/span/svg/g/circle"));
        driver.findElement(By.id("__NEXT_DATA__"));
        driver.findElement(By.cssSelector("#__next > div > div > div > nav > div.headerDesktopContainer_InJ6meKi.headerDesktopContainer24_InJ6meKi > div > a:nth-child(1)"));
        driver.findElement(By.xpath("//*[@id=\"sectionLinkableBoxes_LdDPok7NKeyljPbkiZmVD\"]/div/div/a[1]/div/div/div[3]"));
        driver.quit();
    }
    @BeforeClass
    public static void aaa2(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.grammarly.com/");
        Actions actions = new Actions(driver);
        WebElement contextMenuElement = driver.findElement(By.cssSelector("#sectionHero_3b4ejaK9nNqPionbmLlscK > div > div.two-column_leftColumnContent__fnQg2 > figcaption > div.hero_ctasContainer__lTxbj > div:nth-child(1) > div > button > span > b"));
        actions.contextClick(contextMenuElement).perform();
    }
    @BeforeClass
    public static void aaa3(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.grammarly.com/");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/nav/div[1]/ul/li[1]/div/button")).click();
    }
    @BeforeClass
    public static void aaa4(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.grammarly.com/");
        Actions actions = new Actions(driver);
        WebElement hoverElement = driver.findElement(By.xpath("//*[@id=\"sectionLinkableBoxes_LdDPok7NKeyljPbkiZmVD\"]/div/div/a[1]/div/div"));
        actions.moveToElement(hoverElement).perform();
    }
    @BeforeClass
    public static void aaa5(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.grammarly.com/");
        Actions actions = new Actions(driver);
        WebElement doubleClickElement = driver.findElement(By.cssSelector("#sectionHero_3b4ejaK9nNqPionbmLlscK > div > div.two-column_leftColumnContent__fnQg2 > figcaption > div.hero_ctasContainer__lTxbj > div:nth-child(1) > div > button > span"));
        actions.doubleClick(doubleClickElement).perform();
    }
    @BeforeClass
    public static void aaa6(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.grammarly.com/");
        driver.findElement(By.xpath("//*[@id=\"sectionHero_3b4ejaK9nNqPionbmLlscK\"]/div/div[1]/figcaption/div[2]/div[1]/div/button/span/b")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("selia_mardirosi@edu.aua.am" + Keys.ENTER);
    }


    public static void main(String[] args) {
        aaa();
    }

}
