package asignmment;

import java.time.Duration;
import java.util.List;

import javax.print.attribute.HashAttributeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v110.page.model.LifecycleEvent;
import org.openqa.selenium.support.ui.Select;

import dropdown.GetAllSelectedOptionMethod;

public class EliminateDuplicate {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("file:///C:/Users/hp/OneDrive/Documents/HTML%20Selenium%20code/Multiple%20dropdown.HTML");
	        
		       // 
		        WebElement dropDownElement = driver.findElement(By.id("menu"));
		        
		        Select sel = new Select(dropDownElement);
                     // to read options frome dropdown
		         List<WebElement>allOpts = sel.getOptions();
		         HashSet hs =new Hashas
		        		 22yet<string>();
		         for(int i=0;i<allOpts.size();i++)
		         {
		        	 WebElement op= allOpts.get(i);
		        	 //add the value into set that mans duplicate will not be allowed
		        	 // intractiion ordr want to be mantained
		        	 String value= op.getText();
		        	 hs.add(value);
		         }
		         // read the value frome set
		         
		         
	}

}
