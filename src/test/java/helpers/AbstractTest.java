package helpers;



import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.junit.*;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by admin on 3/8/17.
 */
public abstract class AbstractTest {

    protected WebDriver driver;
    public String baseUrl;
    String baseDir;
    String baseCountry;
    boolean acceptNextAlert = true;
    StringBuffer verificationErrors = new StringBuffer();
    final static Logger log = Logger.getLogger(AbstractTest.class);

    @Rule
    public TestWatcher testWatcher = new TestWatcher() {
        protected void failed(Throwable e, Description description) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            error("\n");
            error("\n");
            error(exceptionAsString);
            error("\n");
            error("\n");

            e.getStackTrace();
            super.failed(e, description);

        }
        protected void starting(Description description) {
            startTestCaseLog(description.getMethodName());
        }

        protected void finished(Description description) {
            endTestCaseLog(description.getMethodName());
        }

        protected void succeeded(Description description) {
            info("                               *****TEST SUCCEEDED*****");
        }

    };

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://cms.unit4.test.us.onehippo.com/?0";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //check for -D baseUrl parameter to override
        String url = System.getProperty("baseUrl");
        if (url != null && url.trim().length() > 0) baseUrl=url;

        String country = System.getProperty("baseCountry");
        if (country != null && country.trim().length() > 0) baseCountry=country;

    }

    public static void startTestCaseLog(String testCaseName){

        log.info("****************************************************************************************");

        log.info("\n");

        log.info("$$$$$$$$$$$$$$$$$$$$$     "+testCaseName+"-START-"+ "   $$$$$$$$$$$$$$$$$$$$$$$$$");

        log.info("\n");



    }

    public static void endTestCaseLog(String testCaseName){

        log.info("\n");

        log.info("XXXXXXXXXXXXXXXXXXXXXXX       "+testCaseName+"-END-"+"      XXXXXXXXXXXXXXXXXXXXXX");

        log.info("\n");

        log.info("****************************************************************************************");

        log.info("\n");

        log.info("\n");

        log.info("\n");

    }


    public static void info(String message) {

        log.info(message);

    }

    public static void error(String message) {

        log.error(message);

    }

    public static void debug(String message) {

        log.debug(message);

    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

}
