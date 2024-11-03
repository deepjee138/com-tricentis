package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {


    static String browser = "Chrome";
    static String baseUrl = "https://demowebshop.tricentis.com";
    static WebDriver driver;


    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver= new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong browser Name:");

        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
         System.out.println("The page current source: " + driver.getPageSource());
        String loginUrl = "https://demowebshop.tricentis.com/login";
        driver.navigate().to(loginUrl);
        System.out.println("The current URL:" + driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println("Get  " + driver.getCurrentUrl());
        driver.navigate().to(loginUrl);
         driver.navigate().refresh();
        WebElement searchBox = driver.findElement(By.id("Email"));
        searchBox.sendKeys("XYZ123@gmail.com");
        WebElement passwordBox = driver.findElement(By.className("password"));
        passwordBox.sendKeys("1234piu");
        passwordBox.click();
        WebElement loginButton = driver.findElement(By.linkText("Log in"));
        loginButton.click();
        driver.close();

    }

    }
