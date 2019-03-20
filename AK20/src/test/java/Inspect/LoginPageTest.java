package Inspect;

import org.openqa.selenium.support.How;
import support.Browsers;

import static support.CommonFunctions.*;

public class LoginPageTest {
    public static void main(String[] args) throws InterruptedException {
        openBrowser(Browsers.CHROME);
        visitWebsite("https://the-internet.herokuapp.com/login");
        fill(How.NAME, "username", "tomsmith");
        fill(How.NAME, "password", "SuperSecretPassword!");
        login();
        Thread.sleep(2000);
        logout();
        Thread.sleep(2000);
        driver.quit();

    }















   // System.out.println(driver.findElement(By.cssSelector(".button.secondary.radius")));
    /*fill(How.NAME,"username","tomsmith");
        fill(How.NAME,"password","SuperSecretPassword!");*/
        /*public static void fill (How how, String locator, String withInputText){
        driver.findElement(how.buildBy(locator)).sendKeys(withInputText);
    }
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
    */

            /*public static void openBrowser (String name){
        if (name.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (name.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (name.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.gecko.driver", "Drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else if (name.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "Drivers/MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
        }
        else {
            System.err.println("The browser"+name+"not found");
        }
    }*/
}
