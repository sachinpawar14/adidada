import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {



		public static void main(String[] args) {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();

			driver.get("https://demo.guru99.com/test/radio.html");
			WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
			
			radio1.click();
		
	}

}
