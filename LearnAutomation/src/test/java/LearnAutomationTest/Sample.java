package LearnAutomationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

WebDriver driver;

@Test
public void LaunchBrowser() throws InterruptedException
{
    WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.infosys.com/");
    Thread.sleep(20000);
}
}

