package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteControlTest {
    public static void main (String[] args) throws MalformedURLException, InterruptedException {
        //WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.127:4444/wd/hub"), DesiredCapabilities.chrome());
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("flower");

        WebElement btnSearch = driver.findElement(By.name("btnK"));
        btnSearch.submit();

        WebElement link = driver.findElement(By.id("-kP7zK8fVmb59M:"));
        link.click();

        Thread.sleep(5000);
        driver.quit();
    }
}