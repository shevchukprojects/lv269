package com.softserve.edu.opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class AddressBook {
    private static WebDriver driver;
    public static final String HOME_URL = "http://server7.pp.ua/";
    private static final int TIMEOUT = 30;

    public static WebDriver SetUp() {
        System.setProperty("webdriver.chrome.driver", "F:/AutomationTest/lib/selen/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.get(HOME_URL + "index.php?route=account/login");
        WebElement login = driver.findElement(By.id("input-email"));
        login.clear();
        login.click();
        login.sendKeys("mirekzvar@gmail.com");
        driver.findElement(By.id("input-password")).click();
        driver.findElement(By.id("input-password")).clear();
        driver.findElement(By.id("input-password")).sendKeys("vitochka24");
        login.sendKeys(Keys.ENTER);

        return driver;
    }

    public static WebDriver setToDefault(WebDriver driver) {
        driver.findElement(By.cssSelector(".btn.btn-info")).click();
        WebElement fieldFirstName = driver.findElement(By.id("input-firstname"));
        fieldFirstName.clear();
        fieldFirstName.sendKeys("mirek");
        WebElement fieldLastName = driver.findElement(By.id("input-lastname"));
        fieldLastName.clear();
        fieldLastName.sendKeys("Zvarych");
        WebElement fieldAddress = driver.findElement(By.id("input-address-1"));
        fieldAddress.clear();
        fieldAddress.sendKeys("Naukova");
        WebElement fieldCity = driver.findElement(By.id("input-city"));
        fieldCity.clear();
        fieldCity.sendKeys("Lviv");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();

        return driver;
    }

    public static void tearDown(WebDriver driver) {
        driver.get(HOME_URL + "index.php?route=account/logout");
        driver.quit();

    }
}
