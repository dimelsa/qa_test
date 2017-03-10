package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by admin on 3/8/17.
 */
public class loginCMS_page {

    private static WebElement element =null;


    public static WebElement username_text(WebDriver driver){

        element = driver.findElement(By.name("username"));
        return element;

    }

    public static WebElement password_text(WebDriver driver){

        element = driver.findElement(By.name("password"));
        return element;

    }

    public static WebElement login_btn(WebDriver driver){

        element = driver.findElement(By.name("p::submit"));
        return element;

    }

}
