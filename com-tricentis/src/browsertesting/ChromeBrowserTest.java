package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Navigate to Url.
 * “https://demowebshop.tricentis.com/login ”
 * 7. Print the current URL.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current URL.
 * 11. Refresh the page.
 * 12. Enter the email in the email field.
 * 13. Enter the password in the password field.
 * 14. Click on the Login Button.
 * 15. Close the browser.
 */

public class ChromeBrowserTest {

String baseUrl=" https://demowebshop.tricentis.com/";

    public static void main(String[] args) {

        //* 1. Set up Chrome browser.
        WebDriver driver = new ChromeDriver();

        //2. Open URL.
        driver.get( "https://demowebshop.tricentis.com/");

        //Maximise the Browser
        driver.manage().window().maximize();


        //* 3. Print the title of the page.
        String title = driver.getTitle();
        System.out.println(title);

        //4. Print the current URL.
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current URL: " + currentUrl);

        //5. Print the page source.
        System.out.println("The page current source: " + driver.getPageSource());

        //6. Navigate to Url.
        // * “https://demowebshop.tricentis.com/login ”

        String loginUrl = "https://demowebshop.tricentis.com/login";
        driver.navigate().to(loginUrl);


        //7 Print the current URL.
        System.out.println("The current URL:" + driver.getCurrentUrl());

        //8. Navigate back to the home page.
        driver.navigate().back();
        System.out.println("Get  " + driver.getCurrentUrl());

        //9. Navigate to the login page.
        driver.navigate().to(loginUrl);
        System.out.println(" Get Navigate to the login page:" + currentUrl);


        //10. Print the current URL.
        System.out.println("The current URL:" + currentUrl);

        //11. Refresh the page.
        driver.navigate().refresh();

        //12. Enter the email in the email field.
        WebElement searchBox = driver.findElement(By.id("Email"));
        searchBox.sendKeys("XYZ123@gmail.com");

        // 13. Enter the password in the password field.
        WebElement passwordBox = driver.findElement(By.className("password"));
        passwordBox.sendKeys("1234piu");
        passwordBox.click();


        // 14. Click on the Login Button.
        WebElement loginButton = driver.findElement(By.linkText("Log in"));

        loginButton.click();


        //15. Close the browser.
        driver.close();


    }
}



