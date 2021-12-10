import JavascriptExecuter.JavascriptExexuter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSendKeys {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://www.zomato.com/mumbai/restaurants?utm_source=google&utm_medium=cpc&utm_campaign=Gsearch_P-MWeb_O-NA_C-Brand_A-NewUser_SC-Generic_L-PanIndia&utm_term=zomato&gclid=EAIaIQobChMIiIHE6qzZ9AIVS0NgCh0CJwiLEAAYASAAEgLiVPD_BwE");
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.xpath("//*[contains(@class, 'SHtSS')]"));
        Thread.sleep(2000);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("argument[0].value 'bhagya'",search);

    }
}
