package Inspect;

import org.openqa.selenium.support.How;
import support.Browsers;

import static support.CommonFunctions.*;

public class CheckboxTest {
    public static void main(String[] args) {
        openBrowser(Browsers.CHROME);
        navigate("https://the-internet.herokuapp.com/checkboxes");

        checkboxSelect(How.XPATH, "//form[@id='checkboxes']/input[1]");
        checkboxSelect(How.XPATH, "//form[@id='checkboxes']/input[2]");
    }
}
