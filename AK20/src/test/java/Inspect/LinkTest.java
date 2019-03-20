package Inspect;

import org.openqa.selenium.support.How;
import support.Browsers;

import static support.CommonFunctions.*;

public class LinkTest {
    public static void main (String []args){
        openBrowser(Browsers.CHROME);
        navigate("https://the-internet.herokuapp.com/redirector");

        click(How.ID,"redirect");
        click(How.XPATH,"//a[@href='status_codes/200']");
        navigateBack();
        click(How.CSS,"a[href='status_codes/301']");

    }
}
