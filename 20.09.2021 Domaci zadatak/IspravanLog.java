package HappySadPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IspravanLog {

	private String username;
	private String password;

	public IspravanLog() {

		this.username = "tomsmith";
		this.password = "SuperSecretPassword!";
	}

	public void login() {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();

		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.clear();
		usernameField.sendKeys(this.username);

		WebElement passField = driver.findElement(By.id("password"));
		passField.clear();
		passField.sendKeys(this.password);

		WebElement loginButton = driver.findElement(By.className("radius"));
		loginButton.click();

		WebElement logoutButton = driver.findElement(By.cssSelector(".button.secondary.radius"));

		if (logoutButton.isDisplayed()) {
			System.out.println("Ulogovali ste se, Logout dugme prisutno ");
		} else {
			System.out.println("Niste ulogovani");
		}

	}

}
