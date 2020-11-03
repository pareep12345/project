import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;
public class S1 {
    WebDriver driver;

    @BeforeClass
    void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\parde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://book.theautomatedtester.co.uk/");
    }

    @Test(priority = 1)
    void homePagetitle() {
        String title = driver.getTitle();
        Assert.assertEquals("Selenium: Beginners Guide", title, "tittle not matchh");

    }
    @Test
    void logoTest() {
        WebElement logo = driver.findElement(By.xpath("/html/body/div[1]"));
        Assert.assertTrue(logo.isDisplayed(), "logo not displayed on the page");
    }
    @Test
    void Testimg() {
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("images:" + images.size());
    }
    @Test
    void TestButton() {
        List<WebElement> button = driver.findElements(By.tagName("button"));
        System.out.println("Button:" + button.size());
    }

}
