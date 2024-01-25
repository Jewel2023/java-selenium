package Base_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private WebDriver driver;

    public void chromeDriverSetup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoblaze.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement loginTab = driver.findElement(By.xpath("(//a[normalize-space()='Log in'])[1]"));
        loginTab.click();
        Thread.sleep(2000);
        //Start here
        WebElement userName=driver.findElement(By.xpath("(//input[@id='loginusername'])[1]"));
        userName.click();
        userName.sendKeys("bplcricket");
        Thread.sleep(2000);
//        driver.quit();
        WebElement passWord= driver.findElement(By.xpath("(//input[@id='loginpassword'])[1]"));
        passWord.click();
        passWord.sendKeys("123!111");
        WebElement loginButton= driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]"));
        loginButton.click();
        Thread.sleep(2000);

    }

    public static void main(String[] args) throws InterruptedException {
        BaseTest test = new BaseTest();
        test.chromeDriverSetup();
    }
}
