package testCases;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class YouTubeDirectRun {
	static {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/param/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
	}
	public static WebDriver driver = new ChromeDriver();
	
	//public static WebDriver driver = new FirefoxDriver();
	public static int count = 0;

	public static void main(String[] args) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String baseUrl = "https://www.youtube.com/channel/UCZd0DUTjOLepHah2ew71obQ/videos?shelf_id=0&view=0&sort=dd";
		driver.get(baseUrl);
		List<WebElement> videos = driver.findElements(By.id("video-title"));
		for (int i = 0; i <= videos.size(); i++) {
			driver.get(baseUrl);
			/*while (i >= videos.size()) {
				((JavascriptExecutor) driver).executeScript("scroll(0,11300)");
				Thread.sleep(2000);
				videos = driver.findElements(By.id("video-title"));
			}*/
			System.out.println(videos.size());
			if (i >= 30){
				((JavascriptExecutor) driver).executeScript("scroll(0,1300)");
			((JavascriptExecutor) driver).executeScript("scroll(0,1300)");}
			try {
				videos = driver.findElements(By.id("video-title"));
				videos.get(i).click();
			} catch (Exception e) {
				i = 0;
			}
			Thread.sleep(5000);
			count++;
			System.out.println(count);
		}
		System.out.println(count);
		driver.close();
	}
}
