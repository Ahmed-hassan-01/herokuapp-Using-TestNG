import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.crypto.signers.ISOTrailers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CheckLinktextANDLogin {

    WebDriver driver;

    @BeforeTest
    public void prepare()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void end()
    {
        driver.quit();

    }
@Test(priority = 3)
    public void checklinktext()
    {
        driver.navigate().to("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("A/B Testing")).click();

        driver.navigate().back();
        driver.findElement(By.linkText("Add/Remove Elements")).click();

        driver.navigate().back();
        driver.findElement(By.linkText("Basic Auth")).click();

        driver.navigate().back();
        driver.findElement(By.linkText("Broken Images")).click();

        driver.navigate().back();
        driver.findElement(By.linkText("Challenging DOM")).click();

        driver.navigate().back();
        driver.findElement(By.linkText("Checkboxes")).click();

        driver.navigate().back();
        driver.findElement(By.linkText("Context Menu")).click();

        driver.navigate().back();
        driver.findElement(By.linkText("Digest Authentication")).click();

        driver.navigate().back();
        driver.findElement(By.linkText("Disappearing Elements")).click();

        driver.navigate().back();
        driver.findElement(By.linkText("Drag and Drop")).click();

        driver.navigate().back();
        driver.findElement(By.linkText("Dropdown")).click();

        driver.navigate().back();
        driver.findElement(By.linkText("Dynamic Controls")).click();

        driver.navigate().back();
        driver.findElement(By.linkText("Dynamic Loading")).click();

        driver.navigate().back();
        driver.findElement(By.linkText("Entry Ad")).click();

        driver.navigate().back();
        driver.findElement(By.linkText("File Download")).click();




    }

    @Test(priority = 0)
    public void OpenWebSite()
    {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test(priority = 1)
    public void FindElementByLinkText()
    {
        driver.findElement(By.linkText("Form Authentication")).click();

    }

    @Test(priority = 2)
    public void login()
    {
        driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith ");
        driver.findElement(By.cssSelector("input#password")).sendKeys("SuperSecretPassword!");
    }

}
