package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by admin on 3/8/17.
 */
public class workbench_page {

    private static WebElement element =null;


    public static WebElement username_link(WebDriver driver){

        element = driver.findElement(By.className("hippo-current-user-name"));
        return element;

    }

    public static WebElement optionDashboard(WebDriver driver){

        element = driver.findElement(By.className("hippo-perspective-dashboardperspective"));
        return element;

    }

    public static WebElement optionChannels(WebDriver driver){

        element = driver.findElement(By.className("hippo-perspective-channelmanagerperspective"));
        return element;

    }

    public static WebElement optionContent (WebDriver driver){

        element = driver.findElement(By.className("hippo-perspective-browserperspective"));
        return element;

    }


    public static WebElement logout_btn(WebDriver driver){

        element = driver.findElement(By.className("hippo-logout"));
        return element;

    }


}
