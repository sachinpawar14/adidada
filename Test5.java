
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;
public class Test5 {
	
	public static void main(String[] args) {
	        
	        WebDriverManager.edgedriver().setup();
	        WebDriver driver = new EdgeDriver();

	        try {
	          
	            driver.get("https://www.saucedemo.com/");

	            
	            WebElement username = driver.findElement(By.id("user-name"));
	            username.sendKeys("invalid_user"); // Invalid username

	           
	            WebElement password = driver.findElement(By.id("password"));
	            password.sendKeys("wrong_password"); // Invalid password

	          
	            WebElement button = driver.findElement(By.id("login-button"));
	            button.click();

	     
	            Thread.sleep(2000);

	          
	            WebElement errorMessage = driver.findElement(By.cssSelector(".error-message-container"));

	            
	            String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
	            String actualMessage = errorMessage.getText();

	            if (actualMessage.equals(expectedMessage)) {
	                System.out.println("Negative test passed. Correct error message displayed.");
	            } else {
	                System.out.println("Negative test failed. Incorrect error message displayed.");
	                System.out.println("Actual message: " + actualMessage);
	            }
	        } catch (Exception e) {
	            System.out.println("Test encountered an error: " + e.getMessage());
	        } finally {
	           
	            driver.quit();
	        }
	    }
	}



