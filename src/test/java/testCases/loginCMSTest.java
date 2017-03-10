package testCases;


import helpers.AbstractTest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import pageObjects.loginCMS_page;
import pageObjects.workbench_page;

public class loginCMSTest extends AbstractTest {

    @Test
    public void testValidateLogin() throws Exception {
        driver.get(baseUrl);
        assertEquals(baseUrl, driver.getCurrentUrl());
        loginCMS_page.username_text(driver).sendKeys("damaro");
        loginCMS_page.password_text(driver).sendKeys("unit42016");
        loginCMS_page.login_btn(driver).click();
        Thread.sleep(4000);
        workbench_page.optionDashboard(driver).isDisplayed();
        workbench_page.optionChannels(driver).isDisplayed();
        workbench_page.optionContent(driver).isDisplayed();
        workbench_page.username_link(driver).isDisplayed();
        workbench_page.username_link(driver).click();
        workbench_page.logout_btn(driver).click();

    }

    @Test
    public void testInvalidLogin() throws Exception {
        driver.get(baseUrl);
        assertEquals(baseUrl, driver.getCurrentUrl());
        loginCMS_page.username_text(driver).sendKeys("damaro");
        loginCMS_page.password_text(driver).sendKeys("unit4xx");
        loginCMS_page.login_btn(driver).click();
        Thread.sleep(4000);
        assertEquals(baseUrl, driver.getCurrentUrl());
    }
    }
