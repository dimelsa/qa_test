package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by admin on 3/9/17.
 */
public class content_page {

    private static WebElement element =null;

    public static WebElement dropdown_icon(WebDriver driver){

        element = driver.findElement(By.xpath("//*/div[2]/div[2]/b[@class='button']"));
        return element;

    }

    public static WebElement dropdown_option(WebDriver driver, String ContentType) {

        element = driver.findElement(By.xpath("//*/span[text()='"+ContentType+"']"));
        return element;

    }

    //selectric-items / selectric-scroll
    public static WebElement rootFolder_opt(WebDriver driver, String nameFolder){

        element = driver.findElement(By.xpath("//*/span[2][text()='"+nameFolder+"']"));
        return element;

    }



    public static WebElement folder_dropdown(WebDriver driver){

        element = driver.findElement(By.className("hippo-tree-dropdown-icon-container"));
        return element;

    }

    public static WebElement subfolder_dropdown(WebDriver driver){

        element = driver.findElement(By.cssSelector("hippo-tree-dropdown-icon-container container-selected"));
        return element;

    }

    public static WebElement addnewfolder_opt(WebDriver driver){

        element = driver.findElement(By.xpath("//*/ul/li[1]/span/a/span[2]/span"));
        return element;

    }

    public static WebElement addnewdocument_opt(WebDriver driver){

        element = driver.findElement(By.xpath("//*/ul/li[2]/span/a/span[2]/span"));
        return element;
    }

    public static WebElement renamefolder_opt(WebDriver driver){

        element = driver.findElement(By.xpath("//*/ul/li[3]/span/a/span[2]/span"));
        return element;
    }

    public static WebElement reorderfolder_opt(WebDriver driver){

        element = driver.findElement(By.xpath("//*/ul/li[4]/span/a/span[2]/span"));
        return element;
    }

    public static WebElement deletefolder_opt(WebDriver driver){

        element = driver.findElement(By.xpath("//*/ul/li[5]/span/a/span[2]/span"));
        return element;
    }

    public static WebElement publishfolder_opt(WebDriver driver){

        element = driver.findElement(By.xpath("//*/ul/li[6]/span/a/span[2]/span"));
        return element;
    }

    public static WebElement offlinefolder_opt(WebDriver driver){

        element = driver.findElement(By.xpath("//*/ul/li[7]/span/a/span[2]/span"));
        return element;
    }

    public static WebElement editallowedcontent_opt(WebDriver driver){

        element = driver.findElement(By.xpath("//*/ul/li[8]/span/a/span[2]/span"));
        return element;
    }

    public static WebElement translations_opt(WebDriver driver){

        element = driver.findElement(By.xpath("//*/ul/li[9]/span/a/span[2]/span"));
        return element;
    }

    public static WebElement newboxname_opt(WebDriver driver){

        element = driver.findElement(By.xpath("//*/input[@name='name-url:name']"));
        return element;
    }

    public static WebElement newboxurl_opt(WebDriver driver){

        element = driver.findElement(By.xpath("//*/input[@name='name-url:url']"));
        return element;
    }

    public static WebElement newboxok_opt(WebDriver driver){

        element = driver.findElement(By.xpath("//*/input[@name='buttons:0:button']"));
        return element;
    }

    public static WebElement newboxcancel_opt(WebDriver driver){

        element = driver.findElement(By.xpath("//*/input[@name='buttons:1:button']"));
        return element;
    }

    public static WebElement doctypedropdown_opt(WebDriver driver, String doctype){

        element = driver.findElement(By.className("hippo-form-select"));
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(doctype);
        return element;
    }

}
