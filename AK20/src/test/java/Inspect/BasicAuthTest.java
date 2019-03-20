package Inspect;
import support.Browsers;

import static support.CommonFunctions.*;


public class BasicAuthTest {
    public static void main(String []args){
        openBrowser(Browsers.CHROME);
        navigate("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
