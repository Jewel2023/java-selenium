package Base_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {
    private WebDriver driver;
    public void signIn() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver ", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement signInTab = driver.findElement(By.xpath(("(//a[normalize-space()='Log in'])[1]")));
        signInTab.click();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.xpath(("(//input[@id='loginusername'])[1]")));
        userName.click();
        userName.sendKeys("jewelabc@gmail.com");
        Thread.sleep(2000);
        WebElement passWord = driver.findElement(By.xpath(("(//input[@id='loginpassword'])[1]")));
        passWord.click();
        passWord.sendKeys("123456");
        Thread.sleep(2000);
        WebElement signInButton = driver.findElement(By.xpath(("(//button[normalize-space()='Log in'])[1]")));
        signInButton.click();
    }
        public static void main(String[] args) throws InterruptedException {
            SignIn object=new SignIn();
            object.signIn();
        }

    }

