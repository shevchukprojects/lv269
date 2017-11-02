package server7.testng;


import org.testng.Assert;
import org.testng.annotations.*;

/**
 * This class checks login (using buttons and Enter) and logout
 * process on Chrome.
 */
public class ChromeLoginLogoutAdminTest {

    public WebDriverCreator webDriverCreator;
    public LoginLogoutAdmin loginLogoutAdmin;

    @DataProvider
    public Object[][] TypeOfEntrance () {
        return new Object[][] {
                {Credentials.BUTTON.getChosenConstant()},
                {Credentials.BUTTON.getChosenConstant()},
        };
    }

    @BeforeClass
    public void createDrivers() {
        webDriverCreator = new WebDriverCreator();
        webDriverCreator.setWebdriverChrome();
        loginLogoutAdmin = new LoginLogoutAdmin(webDriverCreator);
    }

    @BeforeMethod
    public void setMainPage() {
        loginLogoutAdmin.setMainPage();
    }

    @Test(dataProvider = "TypeOfEntrance")
    public void LoginChromeTest(String typeOfEntrance) {
        loginLogoutAdmin.login(typeOfEntrance);
        Assert.assertTrue(loginLogoutAdmin.isLogined(),
                Messages.FAIL_LOGIN_ADMIN_CHROME_CLICK.getMessage());
        loginLogoutAdmin.logout();
        Assert.assertTrue(loginLogoutAdmin.isLogouted(),
                Messages.FAIL_LOGOUT_ADMIN_CHROME_CLICK.getMessage());
    }

    @AfterClass
    public void driverQuit() {
        webDriverCreator.quitDriver();
    }

}