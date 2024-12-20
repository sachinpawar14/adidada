import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

		
		public static void main(String[] args) {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();

			driver.get("https://accounts.google.com/v3/signin/identifier?ifkv=AeZLP988Ph--qMg6nm4AwOR7LjHdR6NDy8vpy07yxHCUKvA0zGGqfpiJvbJAMyBxsQ9HsvL3tIK8dw&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1329396807%3A1734691413665870&ddm=1");
	        WebElement email = driver.findElement(By.id("identifierId"));
	        email.sendKeys("sp@gmail.com");
	        WebElement login = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
	        login.click();
		}

}
