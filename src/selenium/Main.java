package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();//otvara browser

        //WebDriver driver = new FirefoxDriver();
        SoftAssert softAssert = new SoftAssert();

        Thread.sleep(3000);

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");

        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("tomsmith");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        WebElement loginButton = driver.findElement(By.cssSelector(".fa"));
        //WebElement loginButton = driver.findElement(By.className("fa fa-2x fa-sign-in"));
        loginButton.click();

        WebElement loggedInUserText = driver.findElement(By.cssSelector("div[class='flash success']"));

        String splitedActual[] = loggedInUserText.getText().split("(?<=!)");

        //String actual = loggedInUserText.getText().substring(0, loggedInUserText.getText().length()-1);

        String expectedText = "You logged into a secure area!";

        String actualText = loggedInUserText.getText(); // = You logged into a secure area!×

        //System.out.println(actual);

        String expectedColor = "rgba(93, 164, 35, 0)";

        String actualColor = loggedInUserText.getCssValue("background-color");

        System.out.println("Actual: " + actualColor);

        softAssert.assertEquals(actualColor,expectedColor, "Colors not matched!");
        softAssert.assertEquals(splitedActual[0], expectedText, "Text not matched!");
        softAssert.assertAll();


//        if (expectedText.equals(splitedActual[0].trim())){
//            System.out.println("Verified!");
//        }else {
//            System.out.println("Error!");
//        }

        //driver.close();
        driver.quit();

    }





}
