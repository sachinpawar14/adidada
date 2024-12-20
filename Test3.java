import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.google.com");
		
		WebElement textarea = driver.findElement(By.id("APjFqb"));
		textarea.sendKeys("girish godbole");
		WebElement button = driver.findElement(By.name("btnK"));
		button.submit();
		
	}

}
