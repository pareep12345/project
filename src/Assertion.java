import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertion {
    WebDriver driver;
    @BeforeClass
    void setup()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\parde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://book.theautomatedtester.co.uk/");
    }
    @Test(priority = 1)
    void homePagetitle()
    {
        String title = driver.getTitle();
        Assert.assertEquals("Selenium: Beginners Guide",title,"tittle not matchh");

    }
    @Test
    void logoTest()
    {
        WebElement logo=driver.findElement(By.xpath("/html/body/div[1]"));
        Assert.assertTrue(logo.isDisplayed(),"logo not displayed on the page");
    }
    @AfterClass
    void tearDown()
    {
        driver.quit();
    }
}
}
