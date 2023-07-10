package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenerateException {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("file:///C:/Users/hp/OneDrive/Documents/HTML%20Selenium%20code/dropdown.HTML");
		 WebElement dropDrownElement = driver.findElement(By.id("menu"));
		 
		 Select sel= new Select(dropDrownElement);
//		 Thread.sleep(2000);
//		  //identify a dropdown on a web page
//		  
//		  sel.selectByIndex(2);
//		  
//		  Thread.sleep(2000);
//		  sel.deselectByIndex(2);
		  
		  List<WebElement> allOps = sel.getOptions();
		  for(WebElement op:allOps);
		  {
			  if(op.getText().equals("pav bhaji"))
			  {
			  Thread.sleep(2000);
			  op.click();
			  break;
		  }
	}
		  
	}

}
