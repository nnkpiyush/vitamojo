package Base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest extends commons {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public BaseTest() {
		super();
	}
	
	@BeforeSuite
	public void driverInitilization() {
		
		if(config.getBrowser().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
			
			driver.set(new ChromeDriver());
		}
		else if (config.getBrowser().equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
			driver.set(new FirefoxDriver());
		}
		
		getDriver().manage().window().maximize();
		
	}
	

	  public static WebDriver getDriver() { 
		  WebDriver local = driver.get(); 
		  return local; 
		  }
	  
	  public void writeTextInField(WebElement element , String text) {
			element.sendKeys(text);
		}
		
		public void navigateTo(String url) {
			getDriver().navigate().to(url);
		}
		
		public void clickonElement(WebElement element) {
			element.click();
		}
		
		public boolean isVisible(WebElement element) {
			return element.isDisplayed();
		}
	

}
