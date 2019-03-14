package Inspect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        //  driver.findElement(By.name("username")).sendKeys("tomsmith");
        //driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("tomsmith");
        // driver.findElement(By.cssSelector("input#name=username")).sendKeys("tomsmith");

        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("SuperSecretPassword!");

        //driver.findElement(By.cssSelector("input[contains(@name,'username')]")).sendKeys("tomsmith");
        //driver.findElement(By.cssSelector("*[contains(@name,'username'])")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("button[type='submit']")).submit();
        driver.findElement(By.cssSelector("a[href='/logout']")).submit();
        //todo: find the solution to use switch with string variable
        String name;
        //test test
        switch (name){

        }
    }
}
