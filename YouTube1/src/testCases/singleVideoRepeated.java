package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class singleVideoRepeated {
	static {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/param/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
	}
	//public static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) throws InterruptedException {
		//URL=https://www.youtube.com/edit?o=U&video_id=lKAbKF2Rans
		String baseUrl = "https://www.youtube.com/watch?v=lKAbKF2Rans";
		//driver.get(baseUrl);
		for(int j=1;j<200;j++){
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for(int i=1;i<2;i++){
			driver.get(baseUrl);
			Thread.sleep(6000);
			System.out.println(i*j);
		}
		driver.close();
		}
	}

}
