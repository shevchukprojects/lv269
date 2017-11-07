package com.softserve.edu.opencart.junit;

import com.softserve.edu.opencart.junit.AddressBook;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditAddressBookTest {
    private static WebDriver driver;

    @BeforeClass
    public static void formForTest() {
        driver = AddressBook.SetUp();
        driver.findElement(By.xpath(".//a[contains(@href,'address')]")).click();
    }

    @AfterClass
    public static void afterTest() {
        driver = AddressBook.setToDefault(driver);
        AddressBook.tearDown(driver);
    }

    @Before
    public void editAddress() {
        driver.findElement(By.cssSelector(".btn.btn-info")).click();
    }

    @After
    public void refreshAddressForm() {
        driver.get(AddressBook.HOME_URL + "index.php?route=account/address");

    }

    @Test
    public void isEmptyFirstNameFieldTest() {

        WebElement fieldFirstName = driver.findElement(By.id("input-firstname"));
        fieldFirstName.clear();
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement textDanger = driver.findElement(By.className("text-danger"));
        Assert.assertEquals("Wrong is an empty FirstName", textDanger.getText(), "First Name must be between 1 and 32 characters!");

    }

    @Test
    public void lowBoundLengthFirstNameTest() {

        WebElement fieldFirstName = driver.findElement(By.id("input-firstname"));
        fieldFirstName.clear();
        fieldFirstName.sendKeys("m");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement text = driver.findElement(By.cssSelector(".alert.alert-success"));
        Assert.assertEquals("Wrong FirstName didn't add", text.getText(), "Your address has been successfully updated");

    }

    @Test
    public void topBoundLengthFirstNameTest() {

        WebElement fieldFirstName = driver.findElement(By.id("input-firstname"));
        fieldFirstName.clear();
        fieldFirstName.sendKeys("mirek mirekmirekmirekmirek mirek");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement text = driver.findElement(By.cssSelector(".alert.alert-success"));
        Assert.assertEquals("Wrong FirstName didn't add", text.getText(), "Your address has been successfully updated");
    }

    @Test
    public void upperBoundLengthFirstNameTest() {

        WebElement fieldFirstName = driver.findElement(By.id("input-firstname"));
        fieldFirstName.clear();
        fieldFirstName.sendKeys("mirek mirekmirekmirekmirek mireks");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement textDanger = driver.findElement(By.className("text-danger"));
        Assert.assertEquals("Wrong FirstName is out of bound", textDanger.getText(), "First Name must be between 1 and 32 characters!");
    }

    @Test
    public void isEmptyLastNameFieldTest() {

        WebElement fieldLastName = driver.findElement(By.id("input-lastname"));
        fieldLastName.clear();
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement textDanger = driver.findElement(By.className("text-danger"));
        Assert.assertEquals("Wrong is an empty LastName", textDanger.getText(), "Last Name must be between 1 and 32 characters!");

    }

    @Test
    public void lowBoundLengthLastNameTest() {

        WebElement fieldLastName = driver.findElement(By.id("input-lastname"));
        fieldLastName.clear();
        fieldLastName.sendKeys("z");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement text = driver.findElement(By.cssSelector(".alert.alert-success"));
        Assert.assertEquals("Wrong LastName didn't add", text.getText(), "Your address has been successfully updated");

    }

    @Test
    public void topBoundLengthLastNameTest() {

        WebElement fieldLastName = driver.findElement(By.id("input-lastname"));
        fieldLastName.clear();
        fieldLastName.sendKeys("mirek mirekmirekmirekmirek mirek");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement text = driver.findElement(By.cssSelector(".alert.alert-success"));
        Assert.assertEquals("Wrong LastName didn't add", text.getText(), "Your address has been successfully updated");
    }

    @Test
    public void upperBoundLengthLastNameTest() {

        WebElement fieldLastName = driver.findElement(By.id("input-lastname"));
        fieldLastName.clear();
        fieldLastName.sendKeys("mirek mirekmirekmirekmirek mireks");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement textDanger = driver.findElement(By.className("text-danger"));
        Assert.assertEquals("Wrong LastName is out of bound", textDanger.getText(), "Last Name must be between 1 and 32 characters!");
    }

    @Test
    public void isEmptyAddressTest() {

        WebElement fieldAddress = driver.findElement(By.id("input-address-1"));
        fieldAddress.clear();
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement textDanger = driver.findElement(By.className("text-danger"));
        Assert.assertEquals("Wrong is an empty Address", textDanger.getText(), "Address must be between 3 and 128 characters!");

    }

    @Test
    public void lowBoundLengthAddressTest() {

        WebElement fieldAddress = driver.findElement(By.id("input-address-1"));
        fieldAddress.clear();
        fieldAddress.sendKeys("NNN");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement text = driver.findElement(By.cssSelector(".alert.alert-success"));
        Assert.assertEquals("Wrong Address didn't add", text.getText(), "Your address has been successfully updated");

    }

    @Test
    public void topBoundLengthAddressTest() {

        WebElement fieldAddress = driver.findElement(By.id("input-address-1"));
        fieldAddress.clear();
        fieldAddress.sendKeys("mirek mirekmirekmirekmirek mirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekz");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement text = driver.findElement(By.cssSelector(".alert.alert-success"));
        Assert.assertEquals("Wrong Address didn't add", text.getText(), "Your address has been successfully updated");
    }

    @Test
    public void upperBoundLengthAddressTest() {

        WebElement fieldAddress = driver.findElement(By.id("input-address-1"));
        fieldAddress.clear();
        fieldAddress.sendKeys("mirek mirekmirekmirekmirek mirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekza");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement textDanger = driver.findElement(By.className("text-danger"));
        Assert.assertEquals("Wrong Address is out of bound", textDanger.getText(), "Address must be between 3 and 128 characters!");
    }

    @Test
    public void isEmptyCityTest() {

        WebElement fieldCity = driver.findElement(By.id("input-city"));
        fieldCity.clear();
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement textDanger = driver.findElement(By.className("text-danger"));
        Assert.assertEquals("Wrong is an empty City", textDanger.getText(), "City must be between 2 and 128 characters!");

    }

    @Test
    public void lowBoundLengthCityTest() {

        WebElement fieldCity = driver.findElement(By.id("input-city"));
        fieldCity.clear();
        fieldCity.sendKeys("NN");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement text = driver.findElement(By.cssSelector(".alert.alert-success"));
        Assert.assertEquals("Wrong City didn't add", text.getText(), "Your address has been successfully updated");

    }

    @Test
    public void topBoundLengthCityTest() {

        WebElement fieldCity = driver.findElement(By.id("input-city"));
        fieldCity.clear();
        fieldCity.sendKeys("mirek mirekmirekmirekmirek mirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekz");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement text = driver.findElement(By.cssSelector(".alert.alert-success"));
        Assert.assertEquals("Wrong Address didn't add", text.getText(), "Your address has been successfully updated");
    }

    @Test
    public void upperBoundLengthCityTest() {

        WebElement fieldCity = driver.findElement(By.id("input-city"));
        fieldCity.clear();
        fieldCity.sendKeys("mirek mirekmirekmirekmirek mirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekmirekza");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement textDanger = driver.findElement(By.className("text-danger"));
        Assert.assertEquals("Wrong City is out of bound", textDanger.getText(), "City must be between 2 and 128 characters!");
    }


    @Test
    public void isNotSelectCountryTest() {

        Select dropdown = new Select(driver.findElement(By.id("input-country")));
        dropdown.selectByVisibleText("--- Please Select ---");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement textDanger = driver.findElement(By.className("text-danger"));
        Assert.assertTrue(textDanger.getText().contains("Please select a country!"));
    }

    @Test
    public void selectValidCountryTest() {
        Select dropdown = new Select(driver.findElement(By.id("input-country")));
        dropdown.selectByVisibleText("Ukraine");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement text = driver.findElement(By.cssSelector(".alert.alert-success"));
        Assert.assertEquals("Wrong Country didn't add", text.getText(), "Your address has been successfully updated");
    }

    @Test
    public void selectValidRegionTest() {

        Select dropdown = new Select(driver.findElement(By.id("input-zone")));
        dropdown.selectByVisibleText("L'vivs'ka Oblast'");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement text = driver.findElement(By.cssSelector(".alert.alert-success"));
        Assert.assertEquals("Wrong Region didn't add", text.getText(), "Your address has been successfully updated");
    }

    @Test
    public void isNotSelectRegionTest() {

        Select dropdown = new Select(driver.findElement(By.id("input-zone")));
        dropdown.selectByVisibleText("--- Please Select ---");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement textDanger = driver.findElement(By.className("text-danger"));
        Assert.assertTrue(textDanger.getText().contains("Please select a region / state!"));
    }

}
