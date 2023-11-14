package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
 * Project-4 - ProjectName : com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 */
public class Login {

    static String baseUrl = "https://www.saucedemo.com/";

    public static void main(String[] args) throws InterruptedException {

        //setup Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl); // open the Url into browser
        //maximise browser
        driver.manage().window().maximize();
        //we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //print the title of the page
        System.out.println(driver.getTitle());
        //print the current URL
        System.out.println(driver.getCurrentUrl());
        //Print the page source
        System.out.println(driver.getPageSource());
        Thread.sleep(4000);

        //enter the email to email field
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("standard_user");
        Thread.sleep(4000);

        //enter password to password field
        WebElement pswdField = driver.findElement(By.name("password"));
        pswdField.sendKeys("secret_sauce");
        Thread.sleep(4000);

        //click on to Login Button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        Thread.sleep(4000);

        //print the current URL
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(4000);

        //navigate to baseUrl
        driver.navigate().to(baseUrl);
        Thread.sleep(4000);

        //refresh the page
        driver.navigate().refresh();
        Thread.sleep(4000);

        //close the browser
        driver.quit();

    }
}
