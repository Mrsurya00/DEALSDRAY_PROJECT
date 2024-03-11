package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Functional_Testing {

	WebDriver driver;

	@BeforeMethod
	public void Setup() {
		driver = new ChromeDriver();
		driver.get("https://demo.dealsdray.com/");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void TearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void LoginandUploadTheXlsFile() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com", Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement orderOption = driver.findElement(By.xpath("//span[contains(text(),'Order')]"));
		orderOption.click();
		
		WebElement ordersOption = driver.findElement(By.xpath("//span[text() = 'Orders']"));
		ordersOption.click();
		Thread.sleep(2000);
		
		WebElement BulkOrders = driver.findElement(By.xpath("//button[contains(text(),'Add Bulk Orders')]"));
		BulkOrders.click();
		Thread.sleep(1000);
		
		WebElement fileinput = driver.findElement(By.cssSelector("input.MuiOutlinedInput-input"));
		Thread.sleep(2000);
		fileinput.sendKeys("S:\\selenium Project\\UITesting\\src\\test\\resources\\file\\demo-data.xlsx");
		driver.findElement(By.cssSelector("button.css-6aomwy")).click();

		driver.findElement(By.xpath("//button[contains(text(), 'Validate Data')]")).click();
		Thread.sleep(1000);

		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
}
