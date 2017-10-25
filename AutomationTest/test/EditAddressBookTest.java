import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by ${Mirek} on 24.10.2017.
 */
public class EditAddressBookTest {
    private static WebDriver driver;
    private static final String HOME_URL ="http://server7.pp.ua/";
    private static final int TIMEOUT = 30;
    @BeforeClass
    public static void SetUp(){
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
        driver.findElement(By.xpath(".//*[@id='column-right']/div/a[contains(@href,'address')]")).click();

    }
    @AfterClass
    public static void tearDown(){
        if (driver!=null){
            driver.quit();
        }
    }
    @Before
    public void editAddress(){
        driver.findElement(By.cssSelector(".btn.btn-info")).click();
    }
    @After
    public void refreshAddressForm(){
        driver.get(HOME_URL + "index.php?route=account/address");;
    }
    @Test
    public void verifyUserIsNotAbleLeaveRequiredFirstNameFieldEmptyTest() throws Exception{
        WebElement fieldFirstName = driver.findElement(By.id("input-firstname"));
        fieldFirstName.clear();
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement textDanger = driver.findElement(By.className("text-danger"));
        Assert.assertTrue(textDanger.getText().contains("First Name must be between 1 and 32 characters!"));
    }
    @Test
    public void verifyUserIsNotAbleLeaveRequiredLastNameFieldEmptyTest() throws Exception {
        WebElement fieldLastName = driver.findElement(By.id("input-lastname"));
        fieldLastName.clear();
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement textDanger = driver.findElement(By.className("text-danger"));
        Assert.assertTrue(textDanger.getText().contains("Last Name must be between 1 and 32 characters!"));
    }
    @Test
    public void verifyUserIsNotAbleLeaveRequiredAddressFieldEmptyTest() throws Exception {
        WebElement fieldAddress = driver.findElement(By.id("input-address-1"));
        fieldAddress.clear();
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement textDanger = driver.findElement(By.className("text-danger"));
        Assert.assertTrue(textDanger.getText().contains("Address must be between 3 and 128 characters!"));
    }
    @Test
    public void verifyUserIsNotAbleLeaveRequiredCityFieldEmptyTest() throws Exception {
        WebElement fieldCity = driver.findElement(By.id("input-city"));
        fieldCity.clear();
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement textDanger = driver.findElement(By.className("text-danger"));
        Assert.assertTrue(textDanger.getText().contains("City must be between 2 and 128 characters!"));
    }
    @Test
    public void verifyUserIsNotAbleLeaveRequiredCountryFieldEmptyTest() throws Exception {
        WebElement mySelectElement = driver.findElement(By.id("input-country"));
        Select dropdown= new Select(mySelectElement);
        dropdown.selectByVisibleText("--- Please Select ---");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement textDanger = driver.findElement(By.className("text-danger"));
        Assert.assertTrue(textDanger.getText().contains("Please select a country!"));
    }
    @Test
    public void verifyUserIsNotAbleLeaveRequiredRegionFieldEmptyTest() throws Exception {
        WebElement mySelectElement = driver.findElement(By.id("input-zone"));
        Select dropdown= new Select(mySelectElement);
        dropdown.selectByVisibleText("--- Please Select ---");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        WebElement textDanger = driver.findElement(By.className("text-danger"));
        Assert.assertTrue(textDanger.getText().contains("Please select a region / state!"));
    }

}
