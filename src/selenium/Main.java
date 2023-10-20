package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //WebDriver driver = new ChromeDriver();//otvara browser

        WebDriver driver = new FirefoxDriver();

        Thread.sleep(3000);

        driver.get("https://the-internet.herokuapp.com/login");

        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("tomsmith");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        WebElement loginButton = driver.findElement(By.cssSelector(".fa"));
        //WebElement loginButton = driver.findElement(By.className("fa fa-2x fa-sign-in"));
        loginButton.click();

    }





}
