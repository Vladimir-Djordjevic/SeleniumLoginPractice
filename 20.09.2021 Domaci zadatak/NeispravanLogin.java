package HappySadPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeispravanLogin {
	private String username;
	private String password;

	public NeispravanLogin() {

		this.username = "Zika";
		this.password = "Slika";
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
		// mora ponovo da se napravi zbog JS libary koji izbrise element i napravi ga
		// ponovo pod istim nazivom,classom....
		WebElement loginButton2 = driver.findElement(By.className("radius"));

		if (loginButton2.isDisplayed()) {
			System.out.println("Niste se ulogovani, Login dugme prisutno ");
		} else {
			System.out.println("Ulogovani ste");
		}

	}

}
