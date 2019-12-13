package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayListNext {
	static {
	    System.setProperty("webdriver.chrome.driver","C:/Users/param/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
	}
	public static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String baseUrl = "https://www.youtube.com/watch?v=3E7cZFRqW5M&list=PLrK4u5MZIcaopcxNAKmGzfqoQU9kLj81G";
		int count=0;
		driver.get(baseUrl);
		int i=2;
		while (i<200) {
			System.out.println(count++);
			driver.findElement(By.xpath("//div/span["+String.valueOf(i)+"]")).click();
			i++;
		Thread.sleep(5000);
		driver.close();
		}
	}

}
