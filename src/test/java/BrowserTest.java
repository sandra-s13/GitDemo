import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		
		System.out.println("first output");
		System.out.println("second output");
		//WebElement cart= 
		System.out.println("first output");
		System.out.println("second output");
		System.out.println("first output");
		System.out.println("second output");
	}
}
