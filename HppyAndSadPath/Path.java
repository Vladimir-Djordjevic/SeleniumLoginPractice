package HappyandSadPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Path {

	public void loginTest(String username, String password) {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();

		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.clear();
		usernameField.sendKeys(username);

		WebElement passField = driver.findElement(By.id("password"));
		passField.clear();
		passField.sendKeys(password);

		WebElement loginButton = driver.findElement(By.className("radius"));
		loginButton.click();

		WebElement message = driver.findElement(By.id("flash"));
		String messageText = message.getText();
		System.out.println(messageText);

		if (messageText.contains("You logged into a secure area")) {
			System.out.println("Uspesno ste se ulogovali");
		} else if (messageText.contains("Your password is invalid")) {
			System.out.println("Niste se uspesno ulogovali");
		} else {
			System.out.println("Niste se uspesno ulogovali");
		}

	}

}
