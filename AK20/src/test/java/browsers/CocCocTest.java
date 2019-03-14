package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CocCocTest {
    public static void main(String []args){
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\tphuong\\AppData\\Local\\CocCoc\\Browser\\Application\\browser.exe");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
    }
}
