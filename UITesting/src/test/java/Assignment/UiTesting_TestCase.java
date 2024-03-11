package Assignment;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class UiTesting_TestCase {
	WebDriver driver;
	@BeforeMethod
	public void Setup() {
		String Browser = "firefox" ; // Change To FireFox , Safari 
		if(Browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		}else if (Browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}else {
			System.out.println("Invalid Browser");
		}
		driver.get("https://www.getcalley.com/");
	}
	 
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	@Test (priority = 1)
	public void Resolution_1920_1080() throws IOException {
	driver.manage().window().setSize(new Dimension(1920 , 1080));
	Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	ImageIO.write(screenshot.getImage(),"PNG" , new File("S:\\selenium Project\\UITesting\\src\\test\\resources\\Screenshot\\Chrome\\" + "Resolution_1920_1080.png"));
	}
	
	@Test(priority = 2)
	public void Resolution_1366_768() throws IOException {
		driver.manage().window().setSize(new Dimension(1366 , 768));
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(),"PNG" , new File("S:\\selenium Project\\UITesting\\src\\test\\resources\\Screenshot\\Chrome\\" + "Resolution_1366_786.png"));
	}
	
	@Test(priority = 3)
	public void Resolution_1536_864() throws IOException {
		driver.manage().window().setSize(new Dimension(1536 , 864));
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(),"PNG" , new File("S:\\selenium Project\\UITesting\\src\\test\\resources\\Screenshot\\Chrome\\" + "Resolution_153_864.png"));
		
	}
	
	@Test(priority = 4)
	public void Resolution_360_640() throws IOException {
		driver.manage().window().setSize(new Dimension(360 , 640));
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(),"PNG" , new File("S:\\selenium Project\\UITesting\\src\\test\\resources\\Screenshot\\Chrome\\" + "Resolution_360_640.png"));
	}
	
	@Test(priority = 5)
	public void Resolution_414_896() throws IOException {
		driver.manage().window().setSize(new Dimension(414 , 896));
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(),"PNG" , new File("S:\\selenium Project\\UITesting\\src\\test\\resources\\Screenshot\\Chrome\\" + "Resolution_414_896.png"));
		
	}
	
	@Test(priority = 6)
	public void Resolution_375_667() throws IOException {
		driver.manage().window().setSize(new Dimension(375 , 667));
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(),"PNG" , new File("S:\\selenium Project\\UITesting\\src\\test\\resources\\Screenshot\\Chrome\\" + "Resolution_375_667.png"));
	}
	

}
