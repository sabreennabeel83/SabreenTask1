package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

String email= "testtask01@mail.com";
String password = "Test@12345";


        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();
        driver.findElement(By.name("FirstName")).sendKeys("test");
        driver.findElement(By.id("LastName")).sendKeys("test");
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(email);
        driver.findElement(By.cssSelector("#Password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@name='register-button']")).click();

        WebElement msg= driver.findElement(By.className("result"));
        System.out.println(msg);
        String Msg = driver.findElement(By.className("result")).getText();
        System.out.println(Msg);

      driver.findElement(By.xpath("//a[text()='Continue']")).click();
      driver.findElement(By.partialLinkText("Log out")).click();
      driver.findElement(By.partialLinkText("Log in")).click();
      driver.findElement(By.cssSelector(".email")).sendKeys(email);
      driver.findElement(By.id("Password")).sendKeys(password);
      driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();










    }
}