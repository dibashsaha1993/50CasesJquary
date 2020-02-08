package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    static String url = "https://www.google.com/";
    public static ChromeDriver driver;

    public static void main(String[] args) throws InterruptedException {

        //create object for chrome driver//

       // System.setProperty("webdriver.chrome.driver", "DriverDirectory/chromedriver");
        HomePage Hp=new HomePage();
        Hp.navigateTo("https://www.google.com/");

        driver.get(url);
        // Thread.sleep(3000);
        //this will close the browser//
       //  driver.close();


    }

    public static void navigateTo(String url) {
        // For Chrome Browser
       // System.setProperty(chromeWebDriver,chromeWebDriverPath );
        // create a object for chromeDriver
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        // Navigate to Url
        //driver.get(url);
        driver.navigate().to(url);
        //driver.navigate().back();
    }


}
