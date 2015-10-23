
package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helloworld {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new FirefoxDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("http://www.guru99.com/selenium-tutorial.html");
	}

}
