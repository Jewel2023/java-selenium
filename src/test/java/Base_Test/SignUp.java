package Base_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
   private WebDriver driver;
   public void signUp() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver ","resources/chromedriver.exe");
       driver=new ChromeDriver();
       driver.get("https://www.demoblaze.com/index.html");
       Thread.sleep(2000);
       driver.manage().window().maximize();
       Thread.sleep(2000);
       WebElement signUpTab= driver.findElement(By.xpath(("(//a[normalize-space()='Sign up'])[1]")));
       signUpTab.click();
       Thread.sleep(2000);
       WebElement userName=driver.findElement(By.xpath(("(//input[@id='sign-username'])[1]")));
       userName.click() ;
       userName.sendKeys("jewelabc@gmail.com");
       Thread.sleep(2000);
       WebElement passWord=driver.findElement(By.xpath(("(//input[@id='sign-password'])[1]")));
       passWord.click();
       passWord.sendKeys("123456");
       Thread.sleep(2000);

       WebElement signUpButton=driver.findElement(By.xpath(("(//input[@id='loginpassword'])[1]")));
       signUpButton.click();
   }

    public static void main(String[] args) throws InterruptedException {
        SignIn object=new SignIn();
        object.signIn();
    }

}
