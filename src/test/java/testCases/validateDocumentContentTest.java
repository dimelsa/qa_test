package testCases;

import helpers.AbstractTest;
import org.junit.Assert;
import org.junit.Test;
import pageObjects.content_page;
import pageObjects.loginCMS_page;
import pageObjects.workbench_page;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by admin on 3/9/17.
 */
public class validateDocumentContentTest extends AbstractTest {
    @Test
    public void validateFolderStructure() throws Exception {
        driver.get(baseUrl);
        assertEquals(baseUrl, driver.getCurrentUrl());
        loginCMS_page.username_text(driver).sendKeys("damaro");
        loginCMS_page.password_text(driver).sendKeys("unit42016");
        loginCMS_page.login_btn(driver).click();
        workbench_page.optionContent(driver).click();
        Thread.sleep(4000);
        content_page.dropdown_icon(driver).click();
        content_page.dropdown_option(driver,"Documents").click();
        Thread.sleep(2000);

        content_page.dropdown_option(driver,"unit4").isDisplayed();
        content_page.dropdown_option(driver,"administration").isDisplayed();
        content_page.dropdown_option(driver,"unit4").click();
        Thread.sleep(4000);
        content_page.dropdown_option(driver,"Banner").isDisplayed();
        content_page.dropdown_option(driver,"Blog").isDisplayed();
        content_page.dropdown_option(driver,"Campaign").isDisplayed();
    }
    @Test
    public void validateCreateFolder() throws Exception {
        driver.get(baseUrl);
        assertEquals(baseUrl, driver.getCurrentUrl());
        loginCMS_page.username_text(driver).sendKeys("damaro");
        loginCMS_page.password_text(driver).sendKeys("unit42016");
        loginCMS_page.login_btn(driver).click();
        workbench_page.optionContent(driver).click();
        Thread.sleep(4000);
        content_page.dropdown_icon(driver).click();
        Thread.sleep(1500);
        content_page.dropdown_option(driver,"Documents").click();
        Thread.sleep(2000);
        content_page.dropdown_option(driver,"unit4").click();
        Thread.sleep(1500);
        content_page.folder_dropdown(driver).click();
        Thread.sleep(1500);
        content_page.addnewfolder_opt(driver).click();
        Thread.sleep(2000);
        content_page.newboxname_opt(driver).click();
        content_page.newboxname_opt(driver).sendKeys("test_folder");
        Thread.sleep(2000);
        content_page.newboxok_opt(driver).click();

    }


    @Test
    public void validateCreateDocument() throws Exception {
        driver.get(baseUrl);
        assertEquals(baseUrl, driver.getCurrentUrl());
        loginCMS_page.username_text(driver).sendKeys("damaro");
        loginCMS_page.password_text(driver).sendKeys("unit42016");
        loginCMS_page.login_btn(driver).click();
        workbench_page.optionContent(driver).click();
        Thread.sleep(4000);
        content_page.dropdown_icon(driver).click();
        Thread.sleep(1500);
        content_page.dropdown_option(driver,"Documents").click();
        Thread.sleep(2000);
        content_page.dropdown_option(driver,"unit4").click();
        Thread.sleep(1500);
        content_page.rootFolder_opt(driver,"test_folder").click();
        Thread.sleep(2000);
        content_page.subfolder_dropdown(driver).click();
        Thread.sleep(1500);
        content_page.addnewdocument_opt(driver).click();
        Thread.sleep(2000);
        content_page.newboxname_opt(driver).click();
        content_page.newboxname_opt(driver).sendKeys("name_document");
        Thread.sleep(2000);
        content_page.doctypedropdown_opt(driver,"Article");
        Thread.sleep(2000);
        content_page.newboxok_opt(driver).click();

    }
}
