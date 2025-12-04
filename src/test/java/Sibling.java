import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sibling {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANDRA S\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());//sibling to sibling
	// //header/div/button[1]/parent::div/parent::header --> grand parent
	// //header/div/button[1]/parent::div/parent::header/div/button[1] --> grand parent - back to child
	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header")).getText());
}
	
}
