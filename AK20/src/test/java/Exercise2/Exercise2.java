package Exercise2;


import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        String url = "https://www.google.com";
        System.out.println("Pls choose browser: \n1-Chrome \n2-Chrome Headless \n3-Firefox \n4-Firefox Headless \n5-IE \n6-Edge ");
        Scanner sc = new Scanner(System.in);
        String browser = sc.next();
        try {
            if (Integer.parseInt(browser) < 1 || Integer.parseInt(browser) >= 8) {
                System.out.println("invalid option");
            } else {
                switch (Integer.parseInt(browser)) {
                    case 1:
                        ClassChrome chrome = new ClassChrome();
                        chrome.testChrome(url);
                        break;
                    case 2:
                        ClassChromeHeadless chromeHeadless = new ClassChromeHeadless();
                        chromeHeadless.ChromeHeadless(url);
                        break;
                    case 3:
                        ClassFirefox firefox = new ClassFirefox();
                        firefox.testFirefox(url);
                        break;
                    case 4:
                        ClassFirefoxHeadless firefoxHeadless = new ClassFirefoxHeadless();
                        firefoxHeadless.FirefoxHeadless(url);
                        break;
                    case 5:
                        ClassIE ie = new ClassIE();
                        ie.testIE(url);
                        break;
                    case 6:
                        ClassEdge edge = new ClassEdge();
                        edge.testEdge(url);
                        break;

                }

            }
        } catch (Exception e) {
            System.out.println("Invalid Option");
        }
    }

}


