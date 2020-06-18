package selenium2;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.Date;
public class Test {
//all filled correctly
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl = "http://localhost:8081/selenium2/src/index.php";
		driver.get(baseurl);
		 WebElement name = driver.findElement(By.id("name"));
		 WebElement dob = driver.findElement(By.id("dob"));
		 WebElement address = driver.findElement(By.id("address"));
		 WebElement sod = driver.findElement(By.id("sod"));
		 WebElement laddress = driver.findElement(By.id("laddress"));
		 WebElement labdir = driver.findElement(By.id("lab_director"));
		 Select tmethod = new Select(driver.findElement(By.id("tmethod")));
		 WebElement pdate = driver.findElement(By.id("performed_date"));
		 WebElement res = driver.findElement(By.id("negative"));
		 WebElement submit = driver.findElement(By.id("button1"));
		 name.sendKeys("Jesse Pinkman");
		 dob.sendKeys("04-07-1984");
		 address.sendKeys("Alberqurque");
		 sod.sendKeys("Air Travel");
		 laddress.sendKeys("Mexico");
		 labdir.sendKeys("Walter White");
		 pdate.sendKeys("06-02-2020");
		 tmethod.selectByValue("cobas SARS-Cov-2");
		 res.click();
		 submit.click();
		 String str = driver.getPageSource();
		 if(str.contains("Saved")) {
			 System.out.println("Test case successful");
		 }
		 else if(str.contains("Updated")) {
			 System.out.println("Test case successful, entry updated");
		 }
		 else
			 System.out.println("Test Case Failed");
		 //driver.close();
	}

}
