package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	static {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/param/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
	}
	int i=0;
	public static WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) throws InterruptedException {
	  driver.get(s);
		Thread.sleep(6000);
		System.out.println(i++);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "https://www.youtube.com/watch?v=lKAbKF2Rans" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
		driver.close();
  }

}
