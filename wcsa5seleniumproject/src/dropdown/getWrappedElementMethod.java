package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getWrappedElementMethod {
	public class GetAllSelectedOptionMethod {
	     public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver,chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        driver.get("file:///C:/Users/hp/OneDrive/Documents/HTML%20Selenium%20code/Multiple%20dropdown.HTML");
	        
	       // 
	        WebElement dropDownElement = driver.findElement(By.id("menu"));
	        
	        Select sel = new Select(dropDownElement);
	         WebElement allOpts = sel.getWrappedElement();
	         System.out.println(allOpts.getText());
	         
}
