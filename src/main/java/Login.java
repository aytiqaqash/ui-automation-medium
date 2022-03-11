import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login {

//    http://aytiqaqash.local/admin/login

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E:\\Youtube\\SELENIUM\\chromedriver_win32_98\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver = new ChromeDriver();
        driver.get("http://aytiqaqash.local/admin/login");
//        driver.getTitle(); // => "Admin - Admin Panel"
//        System.out.println(driver.getTitle());
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("admin@admin.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("password");
        WebElement LoginButton = driver.findElement(By.className("login-button"));
        LoginButton.click();

        driver.getTitle(); // => "Admin panel - Admin panel login səhifəsi"
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));


//        WebElement searchButton = driver.findElement(By.name("btnK"));

//        searchBox.sendKeys("Selenium");
//        searchButton.click();
//
//        searchBox = driver.findElement(By.name("q"));
//        searchBox.getAttribute("value"); // => "Selenium"

        driver.quit();
    }
}
