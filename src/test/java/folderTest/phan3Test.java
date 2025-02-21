package folderTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class phan3Test {
    public static void main(String[] args) {
        // Đường dẫn đến ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            driver.get("https://vitimex.com.vn/");

            WebElement searchBox = driver.findElement(By.id("menu_item_36"));
            searchBox.sendKeys(Keys.ENTER);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-showroom")));
            WebElement searchBox1 = driver.findElement(By.id("search-showroom"));
            searchBox1.sendKeys("Hà Nội");
            Thread.sleep(2000);
            driver.get("https://vitimex.com.vn/so-mi-ngan-tay-vitimex-asc7785-dp125.html");
            Thread.sleep(2000);
            WebElement size = driver.findElement(By.id("size1"));
            size.click();
            WebElement addToCart = driver.findElement(By.id("addCart_page0"));
            addToCart.click();
            Thread.sleep(2000);

            System.out.println("Automation script đã chạy thành công!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Đóng trình duyệt sau khi hoàn thành
            driver.quit();
        }
    }
}
