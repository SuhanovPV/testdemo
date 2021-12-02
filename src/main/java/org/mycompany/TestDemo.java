package org.mycompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {
    public static void main(String[] args)
    {
        System.getProperty("webdriver.chrome.driver", ".//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());

        WebElement login = driver.findElement(By.name("email"));
        login.sendKeys("email@gmail.com");
        WebElement pass = driver.findElement(By.name("pass"));
        pass.sendKeys("123456789");

        System.out.println("окай");
    }
}
